class Moto1 {
    private int speed;
    private int weight;
    private double fuelCapacity;

    public Moto1() {}

    public Moto1(int speed) {
        this.speed = speed;
    }

    public Moto1(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public Moto1(int speed, int weight, double fuelCapacity) {
        this.speed = speed;
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void displaySpeed() {
        System.out.println("Швидкість: " + speed);
    }

    double calculateFuelEfficiency(int distance) {
        return Math.round(distance / fuelCapacity);
    }

    void compareWeight(Moto2 moto2) {
        if (this.weight > moto2.getHorsepower()) {
            System.out.println("Moto1 має більше кінських сил ніж Moto2.");
        } else {
            System.out.println("Moto1 має менше або стількиж кінських сил, що і Moto2 .");
        }
    }


}