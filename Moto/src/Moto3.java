class Moto3 {
    private int year;
    private int mileage;
    private double engineVolume;

    public Moto3() {}

    public Moto3(int year) {
        this.year = year;
    }

    public Moto3(int year, int mileage) {
        this.year = year;
        this.mileage = mileage;
    }

    public Moto3(int year, int mileage, double engineVolume) {
        this.year = year;
        this.mileage = mileage;
        this.engineVolume = engineVolume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    void displayYear() {
        System.out.println("Рік: " + year);
    }

    double calculateResaleValue(int currentYear) {
        int age = currentYear - year;
        return Math.round(engineVolume * 1000 / age);
    }

    void compareMileage(Moto1 moto1) {
        if (this.mileage > moto1.getWeight()) {
            System.out.println("Moto3 має більший пробіг, ніж  Moto1.");
        } else {
            System.out.println("Moto3 має менший або такий самий пробіг, що і  Moto1.");
        }
    }


}