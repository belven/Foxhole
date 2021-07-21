package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class Buckshot extends Resource {
	static public String rname = "Buckshot";

	public Buckshot() {
		super(rname, 50, 40);
		requiredResources.put(new BasicMaterials(), 80);
	}

}
