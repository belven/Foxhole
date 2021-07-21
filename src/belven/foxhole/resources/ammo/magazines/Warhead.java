package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;
import belven.foxhole.resources.materials.RefinedMaterials;

public class Warhead extends Resource {
	static public String rname = "Warhead";

	public Warhead() {
		super(rname, 600, 1);
		requiredResources.put(new RefinedMaterials(), 200);
		requiredResources.put(new HeavyExplosiveMaterials(), 1000);
	}

}
