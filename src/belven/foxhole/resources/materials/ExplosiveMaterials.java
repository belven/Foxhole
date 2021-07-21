package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Salvage;

public class ExplosiveMaterials extends Resource {
	static public String rname = "Explosive Materials";
	
	public ExplosiveMaterials() {
		// 240 seconds to make 10
		super(rname, 24, 1);
		requiredResources.put(new Salvage(), 10);
	}
}