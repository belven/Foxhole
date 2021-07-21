package belven.foxhole.resources.weapons;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class ArgentirIIRifle extends Resource {
	static public String rname = "Argenti r.II Rifle";

	public ArgentirIIRifle() {
		super(rname, 80, 20);
		requiredResources.put(new BasicMaterials(), 100);
	}

}
