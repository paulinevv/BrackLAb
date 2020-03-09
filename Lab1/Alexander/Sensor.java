public class Sensor {

	private String location;
	private String name;
	private boolean active;

	public String getLocation() {
		return this.location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public boolean getActive() {
		return this.active;
	}

	/**
	 * 
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	public void getAttribute() {
		// TODO - implement Sensor.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Sensor.setAttribute
		throw new UnsupportedOperationException();
	}

	public void simulateAction() {
		// TODO - implement Sensor.simulateAction
		throw new UnsupportedOperationException();
	}

	public void executeAction() {
		// TODO - implement Sensor.executeAction
		throw new UnsupportedOperationException();
	}

}