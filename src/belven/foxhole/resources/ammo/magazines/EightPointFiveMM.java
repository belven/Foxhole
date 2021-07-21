package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class EightPointFiveMM extends Resource {
	static public String rname = "8.5 MM";

	public EightPointFiveMM() {
		super(rname, 100, 10);
		requiredResources.put(new BasicMaterials(), 150);
	}

}
