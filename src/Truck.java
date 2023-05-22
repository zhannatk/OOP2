import OPP2HW.Serviceable;

public class Truck extends Vehicle  {



    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyres();
        checkEngine();
        checkTrailer();

    }
    public void checkEngine() {
        System.out.println("    Проверяем двигатель");


    }
    public void checkTrailer() {
        System.out.println("    Проверяем прицеп");

    }
}