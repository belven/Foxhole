package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class TwentyMM extends Resource {
	static public String rname = "20 MM";

	public TwentyMM() {
		super(rname, 100, 10);
		requiredResources.put(new BasicMaterials(), 100);
	}

}
