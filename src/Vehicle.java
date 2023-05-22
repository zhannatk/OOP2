import OPP2HW.Serviceable;

abstract class Vehicle implements Serviceable {
    private String modelName;
    private int wheelsCount;


    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyres() {
        System.out.print("    ");
        System.out.print("Меняем покрышку №");
        for (int i = 1; i <= getWheelsCount(); i++)
            System.out.print(i + ",");
        System.out.println();

    }


}
