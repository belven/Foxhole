package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.CrudeOil;

public class Petrol extends Resource {
	static public String rname = "Petrol";
	
	public Petrol() {
		// 6 minutes
		super(rname, 360, 1);
		requiredResources.put(new CrudeOil(), 3);
	}
}