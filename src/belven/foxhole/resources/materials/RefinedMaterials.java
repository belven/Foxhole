package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Components;

public class RefinedMaterials extends Resource {
	static public String rname = "Refined Materials";
	
	public RefinedMaterials() {
		// 5 minutes to create 5, 1 minute for 1
		super(rname, 60, 1);
		requiredResources.put(new Components(), 20);
	}
}