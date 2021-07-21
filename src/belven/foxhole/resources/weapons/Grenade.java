package belven.foxhole.resources.weapons;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.ExplosiveMaterials;

public class Grenade extends Resource {
	static public String rname = "Grenade";

	public Grenade() {
		super(rname, 100, 20);
		requiredResources.put(new BasicMaterials(), 100);
		requiredResources.put(new ExplosiveMaterials(), 20);
	}

}
