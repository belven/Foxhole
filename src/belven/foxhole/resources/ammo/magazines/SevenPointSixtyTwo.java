package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class SevenPointSixtyTwo extends Resource {
	static public String rname = "7.62 MM";

	public SevenPointSixtyTwo() {
		super(rname, 50, 40);
		requiredResources.put(new BasicMaterials(), 80);
	}

}
