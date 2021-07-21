package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.ExplosiveMaterials;

public class ThirtyMM extends Resource {
	static public String rname = "30 MM";

	public ThirtyMM() {
		super(rname, 100, 20);
		requiredResources.put(new BasicMaterials(), 80);
		requiredResources.put(new ExplosiveMaterials(), 20);
	}

}
