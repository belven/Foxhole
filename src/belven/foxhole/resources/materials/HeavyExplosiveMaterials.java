package belven.foxhole.resources.materials;

import belven.foxhole.resources.Resource;
import belven.foxhole.resources.base.Sulfur;

public class HeavyExplosiveMaterials extends Resource {
	static public String rname = "Heavy Explosive Materials";

	public HeavyExplosiveMaterials() {
		super(rname, 60, 1);
		requiredResources.put(new Sulfur(), 20);
	}
}