public class Car {
    private int id;
    private int arrivalTime;
    private int parkingDuration;
    private int gateId;

    public Car(int id, int arrivalTime, int parkingDuration, int gateId) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.parkingDuration = parkingDuration;
        this.gateId = gateId;
    }

    public int getId() {
        return id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getParkingDuration() {
        return parkingDuration;
    }

    public int getGateId() {
        return gateId;
    }

    @Override
    public String toString() {
        return "Car " + id + " from Gate " + gateId + ", Arrive " + arrivalTime + ", Parks " + parkingDuration;
    }
}
