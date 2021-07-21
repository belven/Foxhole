package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class PointFortyFourMM extends Resource {
	static public String rname = ".44 MM";

	public PointFortyFourMM() {
		super(rname, 40, 40);
		requiredResources.put(new BasicMaterials(), 40);
	}

}
