import OPP2HW.Serviceable;

public class Car extends Vehicle {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

   @Override
    public void service() {
       System.out.println("Обслуживаем " + getModelName());
        updateTyres();
        checkEngine();

    }

    public void checkEngine() {
        System.out.println("    Проверяем двигатель");


    }
}