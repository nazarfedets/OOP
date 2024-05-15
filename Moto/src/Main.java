public class Main {
    public static void main(String[] args) {
        Moto1 moto1a = new Moto1();
        Moto1 moto1b = new Moto1(150);
        Moto1 moto1c = new Moto1(160, 180);
        Moto1 moto1d = new Moto1(170, 190, 15.5);

        Moto2 moto2a = new Moto2();
        Moto2 moto2b = new Moto2(200);
        Moto2 moto2c = new Moto2(210, 220);
        Moto2 moto2d = new Moto2(220, 230, 240.0);

        Moto3 moto3a = new Moto3();
        Moto3 moto3b = new Moto3(2015);
        Moto3 moto3c = new Moto3(2016, 30000);
        Moto3 moto3d = new Moto3(2017, 40000, 600.0);


        moto1b.displaySpeed();
        moto1c.displaySpeed();
        moto1d.displaySpeed();

        System.out.println("Ефективність використання палива: " + moto1d.calculateFuelEfficiency(300));
        moto1d.compareWeight(moto2b);




        moto2b.displayHorsepower();
        moto2c.displayHorsepower();
        moto2d.displayHorsepower();

        System.out.println("Прискорення: " + moto2d.calculateAcceleration(5.0));
        moto2d.compareTopSpeed(moto3d);

        moto3b.displayYear();
        moto3c.displayYear();
        moto3d.displayYear();

        System.out.println("Вартість при перепродажі: " + moto3d.calculateResaleValue(2024) + " $");
        moto3d.compareMileage(moto1c);


    }
}