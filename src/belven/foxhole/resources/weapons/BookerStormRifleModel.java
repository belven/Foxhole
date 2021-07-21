package belven.foxhole.resources.weapons;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.materials.BasicMaterials;

public class BookerStormRifleModel extends Resource {
	static public String rname = "Booker Storm Rifle Model 838";

	public BookerStormRifleModel() {
		super(rname, 80, 10);
		requiredResources.put(new BasicMaterials(), 165);
	}

}
