package belven.foxhole.resources.weapons;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class Blakerow extends Resource {
	static public String rname = "Blakerow 871";

	public Blakerow() {
		super(rname, 80, 20);
		requiredResources.put(new BasicMaterials(), 140);
	}

}
