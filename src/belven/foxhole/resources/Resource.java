package belven.foxhole.resources;

import java.util.HashMap;

public class Resource {
	private String name = "";
	private float timeTaken = 0f;
	protected HashMap<Resource, Integer> requiredResources = new HashMap<Resource, Integer>();
	private int amountCreated = 1;

	public Resource(String name, float timeTaken, int amountCreated) {
		this.name = name;
		this.timeTaken = timeTaken;
		this.amountCreated = amountCreated;
	}

	public Resource(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(float timeTaken) {
		this.timeTaken = timeTaken;
	}

	public HashMap<Resource, Integer> getRequiredResources() {
		return requiredResources;
	}

	public void setRequiredResources(HashMap<Resource, Integer> requiredResources) {
		this.requiredResources = requiredResources;
	}

	public int getAmountCreated() {
		return amountCreated;
	}

	public void setAmountCreated(int amountCreated) {
		this.amountCreated = amountCreated;
	}

}
