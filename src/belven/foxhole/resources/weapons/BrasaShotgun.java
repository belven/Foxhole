package belven.foxhole.resources.weapons;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class BrasaShotgun extends Resource {
	static public String rname = "Brasa Shotgun";

	public BrasaShotgun() {
		super(rname, 80, 20);
		requiredResources.put(new BasicMaterials(), 120);
	}

}
