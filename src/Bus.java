public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08;
    }

    @Override
    public void performService() {
        System.out.println("Bus ID " + id + " is being serviced");
    }

    @Override
    public int getServiceIntervalKm() {
        return 20000;
    }

    @Override
    public String toString() {
        return "Bus -> " + super.toString() +
                ", Capacity: " + passengerCapacity;
    }
}