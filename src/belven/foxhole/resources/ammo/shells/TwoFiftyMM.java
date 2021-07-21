package belven.foxhole.resources.ammo.shells;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;
import belven.foxhole.resources.materials.HeavyExplosiveMaterials;

public class TwoFiftyMM extends Resource {
	static public String rname = "250 MM";

	public TwoFiftyMM() {
		super(rname, 150, 5);
		requiredResources.put(new BasicMaterials(), 120);
		requiredResources.put(new HeavyExplosiveMaterials(), 25);
	}

}
