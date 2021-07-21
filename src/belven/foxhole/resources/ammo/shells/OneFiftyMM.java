package belven.foxhole.resources.ammo.shells;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;

public class OneFiftyMM extends Resource {
	static public String rname = "150 MM";

	public OneFiftyMM() {
		super(rname, 65, 5);
		requiredResources.put(new BasicMaterials(), 120);
		requiredResources.put(new HeavyExplosiveMaterials(), 10);
	}

}
