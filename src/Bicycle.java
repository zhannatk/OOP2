import OPP2HW.Serviceable;
public class Bicycle  extends Vehicle {



    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }


    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
            updateTyres();
    }
}