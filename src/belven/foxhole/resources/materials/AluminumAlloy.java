package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Aluminum;

public class AluminumAlloy extends Resource {
	static public String rname = "Aluminum Alloy";
	
	public AluminumAlloy() {
		// Time not in wiki yet
		super(rname, 20, 1);
		requiredResources.put(new Aluminum(), 1);
	}
}