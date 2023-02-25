public class ServiceStation {
    public void check(Car car){
        if (car != null) {
            checkNameAndWheels(car);
            car.checkEngine();
        }
    }
    public void check(Bicycle bicycle){
        if (bicycle != null) {
            checkNameAndWheels(bicycle);
        }
    }
    public void check(Truck truck){
        if (truck != null) {
            checkNameAndWheels(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    public void checkNameAndWheels(Vehicle vehicle){
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}
