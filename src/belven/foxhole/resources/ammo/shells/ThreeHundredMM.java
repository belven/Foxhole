package belven.foxhole.resources.ammo.shells;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;

public class ThreeHundredMM extends Resource {
	static public String rname = "300 MM";

	public ThreeHundredMM() {
		super(rname, 125, 5);
		requiredResources.put(new BasicMaterials(), 135);
		requiredResources.put(new HeavyExplosiveMaterials(), 30);
	}

}
