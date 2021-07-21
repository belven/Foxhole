package belven.foxhole;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.ammo.magazines.Buckshot;
import belven.foxhole.resources.ammo.magazines.EightMM;
import belven.foxhole.resources.ammo.magazines.EightPointFiveMM;
import belven.foxhole.resources.ammo.magazines.FortyMM;
import belven.foxhole.resources.ammo.magazines.NineMM;
import belven.foxhole.resources.ammo.magazines.PointFortyFourMM;
import belven.foxhole.resources.ammo.magazines.SevenPointNightyTwo;
import belven.foxhole.resources.ammo.magazines.SevenPointSixtyTwo;
import belven.foxhole.resources.ammo.magazines.SixtyEightMMAT;
import belven.foxhole.resources.ammo.magazines.TheeHundredMM;
import belven.foxhole.resources.ammo.magazines.ThirtyMM;
import belven.foxhole.resources.ammo.magazines.TwelvePointSevenMM;
import belven.foxhole.resources.ammo.magazines.TwentyMM;
import belven.foxhole.resources.ammo.magazines.Warhead;
import belven.foxhole.resources.base.Aluminum;
import belven.foxhole.resources.base.Components;
import belven.foxhole.resources.base.CrudeOil;
import belven.foxhole.resources.base.Iron;
import belven.foxhole.resources.base.Salvage;
import belven.foxhole.resources.base.Sulfur;
import belven.foxhole.resources.materials.AluminumAlloy;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.ConcreteMaterials;
import belven.foxhole.resources.materials.Diesel;
import belven.foxhole.resources.materials.ExplosiveMaterials;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;
import belven.foxhole.resources.materials.IronAlloy;
import belven.foxhole.resources.materials.Petrol;
import belven.foxhole.resources.materials.RefinedMaterials;
import belven.foxhole.resources.weapons.AaltoStormRifle24;
import belven.foxhole.resources.weapons.ArgentirIIRifle;
import belven.foxhole.resources.weapons.Blakerow;
import belven.foxhole.resources.weapons.BookerStormRifleModel;
import belven.foxhole.resources.weapons.BrasaShotgun;
import belven.foxhole.resources.weapons.Grenade;

public class Main {
	static ArrayList<String> baseMats = new ArrayList<>();

	static public float totalTime = 0;

	static protected HashMap<Resource, Integer> requestedResources = new HashMap<Resource, Integer>();
	static protected HashMap<String, Integer> requiredResources = new HashMap<String, Integer>();
	static protected HashMap<String, Integer> existingResources = new HashMap<String, Integer>();

	static public HashMap<String, Class<? extends Resource>> resources = new HashMap<String, Class<? extends Resource>>();

	public static void addResource(Class<? extends Resource> resource) {
		try {
			resources.put(resource.getDeclaredField("rname").get(null).toString(), resource);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found for " + resource.getSimpleName());
		}
	}

	static {
		// Base
		addResource(Aluminum.class);
		addResource(Components.class);
		addResource(CrudeOil.class);
		addResource(Iron.class);
		addResource(CrudeOil.class);
		addResource(Salvage.class);
		addResource(Sulfur.class);

		// Materials
		addResource(AluminumAlloy.class);
		addResource(BasicMaterials.class);
		addResource(ConcreteMaterials.class);
		addResource(Diesel.class);
		addResource(ExplosiveMaterials.class);
		addResource(HeavyExplosiveMaterials.class);
		addResource(IronAlloy.class);
		addResource(Petrol.class);
		addResource(RefinedMaterials.class);

		// Ammo
		addResource(Buckshot.class);
		addResource(EightMM.class);
		addResource(EightPointFiveMM.class);
		addResource(FortyMM.class);
		addResource(NineMM.class);
		addResource(PointFortyFourMM.class);
		addResource(SevenPointNightyTwo.class);
		addResource(SevenPointSixtyTwo.class);
		addResource(SixtyEightMMAT.class);
		addResource(TheeHundredMM.class);
		addResource(ThirtyMM.class);
		addResource(TwelvePointSevenMM.class);
		addResource(TwentyMM.class);
		addResource(Warhead.class);

		// Weapons
		addResource(Grenade.class);
		addResource(AaltoStormRifle24.class);
		addResource(ArgentirIIRifle.class);
		addResource(Blakerow.class);
		addResource(BookerStormRifleModel.class);
		addResource(BrasaShotgun.class);

		try (PrintWriter base = new PrintWriter(new File("FoxholeItems.csv")); PrintWriter resourcesFile = new PrintWriter(new File("FoxholeRecipie.csv"))) {

			StringBuilder sb = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();

			sb.append("Name, Class Name, Amount Created, Time Taken");
			sb.append('\n');

			sb2.append("Main Resource, Resource Name, Amount Needed, Time Taken");
			sb2.append('\n');

			for (Entry<String, Class<? extends Resource>> e : resources.entrySet()) {
				Resource r = e.getValue().getConstructor().newInstance();
				sb.append(e.getKey() + "," + r.getName() + "," + r.getAmountCreated() + "," + r.getTimeTaken());
				sb.append('\n');

				for (Entry<Resource, Integer> rr : r.getRequiredResources().entrySet()) {
					sb2.append(e.getKey() + ", " + rr.getKey().getName() + ", " + rr.getValue() + ", " + rr.getKey().getTimeTaken());
					sb2.append('\n');
				}
			}

			base.write(sb.toString());
			base.flush();
			base.close();

			resourcesFile.write(sb2.toString());
			resourcesFile.flush();
			resourcesFile.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Add base resources, as this is what we really care about
		baseMats.add(Aluminum.rname);
		baseMats.add(Components.rname);
		baseMats.add(CrudeOil.rname);
		baseMats.add(Iron.rname);
		baseMats.add(Salvage.rname);
		baseMats.add(Sulfur.rname);

		inputs();

		for (Entry<Resource, Integer> e : requestedResources.entrySet()) {
			System.out.println(e.getKey().getName() + "   " + e.getValue());
		}

		System.out.println("\n");

		for (Entry<Resource, Integer> e : requestedResources.entrySet()) {
			calculateResourcesRequired(e);
		}

		// Remove resources we already have, this will need to calculate the advanced materials sometime, i.e. a resource that has sub resources
		// TODO Move this into calculations
		for (Entry<String, Integer> er : existingResources.entrySet()) {
			if (requiredResources.containsKey(er.getKey())) {
				Integer rr = requiredResources.get(er.getKey());

				requiredResources.put(er.getKey(), rr - er.getValue());
			}
		}

		// Output results
		System.out.println("Total Time (m): " + (totalTime / 60));
		System.out.println("Total Time (H): " + ((totalTime / 60) / 60));
		System.out.println("\n");
		System.out.println("Base Materials");

		for (Entry<String, Integer> e : requiredResources.entrySet()) {
			if (baseMats.contains(e.getKey()))
				System.out.println(e.getValue() + " " + e.getKey());
		}

		System.out.println("\n");
		System.out.println("Other Materials");

		for (Entry<String, Integer> e : requiredResources.entrySet()) {
			if (!baseMats.contains(e.getKey()))
				System.out.println(e.getValue() + " " + e.getKey());
		}
	}

	private static void inputs() {
		// Put in item requests here!! TODO
		// requestedResources.put(new Warhead(), 2);
		requestedResources.put(new Grenade(), 60);
		requestedResources.put(new FortyMM(), 100);
		requestedResources.put(new PointFortyFourMM(), 400);
		// requestedResources.put(new Petrol(), 10);

		// Put in already owned resources here!!
		// existingResources.put("Salvage", 1);
	}

	private static void calculateResourcesRequired(Entry<Resource, Integer> e) {
		Resource coreResource = e.getKey();
		Integer amountRequested = e.getValue();
		HashMap<Resource, Integer> requiredResourcesLocal = coreResource.getRequiredResources();
		Set<Entry<Resource, Integer>> requiredResource = requiredResourcesLocal.entrySet();

		// Calculate the actual amount needed. Make sure the amount is at least the amount created then make it to the closest amount
		int crAmountCreated = coreResource.getAmountCreated();
		int mod = amountRequested % crAmountCreated;

		if (mod != 0) {
			int newAmount = (amountRequested - mod) + crAmountCreated;
			e.setValue(newAmount);
			System.out.println(coreResource.getName() + " amount required changed from  " + amountRequested + " to " + " " + newAmount);
		}

		amountRequested = e.getValue();

		float crTimeTaken = coreResource.getTimeTaken();
		float totalTimeTaken = crTimeTaken * (amountRequested / crAmountCreated);

		// if (totalTimeTaken > 0)
		// System.out.println(coreResource.getName() + " total time taken (m) " + (totalTimeTaken / 60));

		totalTime += totalTimeTaken;

		for (Entry<Resource, Integer> rr : requiredResource) {
			Resource resource = rr.getKey();

			// Set the amount needed so the next item down knows how much as well
			rr.setValue((rr.getValue() * amountRequested) / crAmountCreated);

			Integer amountNeeded = rr.getValue();
			String name = resource.getName();

			if (requiredResources.get(name) != null) {
				requiredResources.put(name, requiredResources.get(name) + amountNeeded);
			} else {
				requiredResources.put(name, amountNeeded);
			}

			calculateResourcesRequired(rr);
		}
	}
}
