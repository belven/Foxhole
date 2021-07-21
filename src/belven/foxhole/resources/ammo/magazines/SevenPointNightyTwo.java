package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class SevenPointNightyTwo extends Resource {
	static public String rname = "7.92 MM";

	public SevenPointNightyTwo() {
		super(rname, 60, 30);
		requiredResources.put(new BasicMaterials(), 120);
	}

}
