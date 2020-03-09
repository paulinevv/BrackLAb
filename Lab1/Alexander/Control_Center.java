public class Control_Center {

	private String sensorCompany;
	private Enum size;

	public String getName() {
		return sensorCompany;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		sensorCompany = name;
	}

	public Enum getSize() {
		return this.size;
	}

	/**
	 * 
	 * @param size
	 */
	public void setSize(Enum size) {
		this.size = size;
	}

	public void addSensor() {
		// TODO - implement Control_Center.addSensor
		throw new UnsupportedOperationException();
	}

	public void checkSensor() {
		// TODO - implement Control_Center.checkSensor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param active
	 */
	public int testAllSensors(int active) {
		// TODO - implement Control_Center.testAllSensors
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Sensor
	 */
	public int testSensor(sensor Sensor) {
		// TODO - implement Control_Center.testSensor
		throw new UnsupportedOperationException();
	}

	public void giveOverview() {
		// TODO - implement Control_Center.giveOverview
		throw new UnsupportedOperationException();
	}

}