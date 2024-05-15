class Moto2 {
    private int horsepower;
    private int torque;
    private double topSpeed;

    public Moto2() {}

    public Moto2(int horsepower) {
        this.horsepower = horsepower;
    }

    public Moto2(int horsepower, int torque) {
        this.horsepower = horsepower;
        this.torque = torque;
    }

    public Moto2(int horsepower, int torque, double topSpeed) {
        this.horsepower = horsepower;
        this.torque = torque;
        this.topSpeed = topSpeed;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    void displayHorsepower() {
        System.out.println("Кінські сили: " + horsepower);
    }

    double calculateAcceleration(double time) {
        return topSpeed / time;
    }

    void compareTopSpeed(Moto3 moto3) {
        if (this.topSpeed > moto3.getEngineVolume()) {
            System.out.println("Moto2 швидший за Moto3.");
        } else {
            System.out.println("Moto2 повільніший або має ту саму максимальну швидкість, що і Moto3.");
        }
    }


}