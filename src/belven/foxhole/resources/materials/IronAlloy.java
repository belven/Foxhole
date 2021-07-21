package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Iron;

public class IronAlloy extends Resource {
	static public String rname = "Iron Alloy";
	
	public IronAlloy() {
		// Time not in wiki yet
		super(rname, 20, 1);
		requiredResources.put(new Iron(), 1);
	}
}