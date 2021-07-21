package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class NineMM extends Resource {
	static public String rname = "9 MM";

	public NineMM() {
		super(rname, 50, 40);
		requiredResources.put(new BasicMaterials(), 80);
	}

}
