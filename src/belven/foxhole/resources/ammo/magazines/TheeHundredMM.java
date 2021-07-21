package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;

public class TheeHundredMM extends Resource {
	static public String rname = "300 MM";

	public TheeHundredMM() {
		super(rname, 125, 5);
		requiredResources.put(new BasicMaterials(), 135);
		requiredResources.put(new HeavyExplosiveMaterials(), 30);
	}

}
