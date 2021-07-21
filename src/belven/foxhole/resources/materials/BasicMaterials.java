package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Salvage;

public class BasicMaterials extends Resource {
	static public String rname = "Basic Materials";

	public BasicMaterials() {
		// Takes 60 seconds to create 50 B Mats
		super(rname, 60, 50);
		requiredResources.put(new Salvage(), 100);
	}

}
