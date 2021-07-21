package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class EightMM extends Resource {
	static public String rname = "8 MM";

	public EightMM() {
		super(rname, 20, 40);
		requiredResources.put(new BasicMaterials(), 40);
	}

}
