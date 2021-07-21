package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Components;

public class ConcreteMaterials extends Resource {
	static public String rname = "Concrete Materials";
	
	public ConcreteMaterials() {
		super(rname, 20, 1);
		requiredResources.put(new Components(), 10);
	}
}