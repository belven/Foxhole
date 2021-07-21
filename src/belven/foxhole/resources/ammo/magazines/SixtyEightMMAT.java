package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;

public class SixtyEightMMAT extends Resource {
	static public String rname = "68 MM AT";

	public SixtyEightMMAT() {
		super(rname, 125, 5);
		requiredResources.put(new BasicMaterials(), 135);
		requiredResources.put(new HeavyExplosiveMaterials(), 30);
	}

}
