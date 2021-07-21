package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.ExplosiveMaterials;

public class FortyMM extends Resource {
	static public String rname = "40 MM";

	public FortyMM() {
		super(rname, 200, 20);
		requiredResources.put(new BasicMaterials(), 160);
		requiredResources.put(new ExplosiveMaterials(), 120);
	}

}
