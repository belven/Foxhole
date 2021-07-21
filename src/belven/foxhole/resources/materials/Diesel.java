package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Salvage;

public class Diesel extends Resource {
	static public String rname = "Diesel";
	
	public Diesel() {
		super(rname, 12, 1);
		requiredResources.put(new Salvage(), 10);
	}
}