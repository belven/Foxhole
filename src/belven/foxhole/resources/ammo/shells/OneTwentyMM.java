package belven.foxhole.resources.ammo.shells;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.ExplosiveMaterials;

public class OneTwentyMM extends Resource {
	static public String rname = "120 MM";

	public OneTwentyMM() {
		super(rname, 55, 5);
		requiredResources.put(new BasicMaterials(), 60);
		requiredResources.put(new ExplosiveMaterials(), 15);
	}

}
