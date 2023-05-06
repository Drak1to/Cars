public class SUV extends Car {
    private String fourWheelDrive;

    public SUV(String make, String model, int year, double price, String fourWheelDrive) {
        super(make, model, year, price);
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(String fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "fourWheelDrive='" + fourWheelDrive + '\'' +
                '}';
    }
}







