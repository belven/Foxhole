package belven.foxhole.resources.ammo.magazines;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class TwelvePointSevenMM extends Resource {
	static public String rname = "12.7 MM";

	public TwelvePointSevenMM() {
		super(rname, 70, 20);
		requiredResources.put(new BasicMaterials(), 100);
	}

}
