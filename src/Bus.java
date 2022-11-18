public class Bus extends Transport {

    public Bus(String brand, String model, String color, String engineVolume) {
        super(brand,model,color,engineVolume);
    }

    public void startDrive() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" стартовал.");}

    @Override
    public void finishDrive() {

    }

    @Override
    public void refuel() {
        System.out.println(getBrand()+" "+getModel()+" "+getColor()+" заправлен.");}


}
