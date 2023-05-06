public class Sedan extends Car {
    private int trunkCapacity;

    public Sedan(String make, String model, int year, double price, int trunkCapacity) {
        super(make, model, year, price);
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "trunkCapacity=" + trunkCapacity +
                '}';
    }


    }



