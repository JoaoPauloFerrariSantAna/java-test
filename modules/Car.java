public class Car {
	private String carMark;
	private String releaseDate;
	private int tires;
	private int doors;

	public Car(String carMark, String releaseDate, int tires, int doors) {
		this.carMark = carMark;
		this.releaseDate = releaseDate;
		this.tires = tires;
		this.doors = doors;
	}

	public String getCarMark() {
		return this.carMark;
	}

	public String getReleaseDate() {
		return this.releaseDate;
	}
}
