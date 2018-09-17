package ch02;

class Car {
    private double position;
    final private double fuelConsumptionKmOnLiter;
    final private double capacity;
    private double currentCapacity;

    public Car(double fuelConsumptionKmOnLiter, double capacity) {
        this.fuelConsumptionKmOnLiter = fuelConsumptionKmOnLiter;
        this.capacity = capacity;
    }

    double fillFuel(double liters) {
        double freeLiters = capacity - currentCapacity;
        if (liters < freeLiters) {
            currentCapacity += liters;
            return 0;
        } else {
            currentCapacity += freeLiters;
            return liters - freeLiters;
        }
    }

    double move(double distance) {
        double consumptionForMove = distance / fuelConsumptionKmOnLiter;
        if (currentCapacity > consumptionForMove) {
            position += distance;
            currentCapacity -= consumptionForMove;
            return distance;
        } else {
            double possibleDistance = currentCapacity * fuelConsumptionKmOnLiter;
            position += possibleDistance;
            currentCapacity = 0;
            return possibleDistance;
        }
    }
}

public class Ex9Car {
    public static void main(String[] args) {
        Car car = new Car(25, 40);
        car.fillFuel(40);
        double distanceOnFullTank = 0;
        double lastMove = 0;
        do {
            lastMove = car.move(100);
            distanceOnFullTank += lastMove;
        } while (lastMove != 0);
        System.out.println("Car can move on: " + distanceOnFullTank);

        double extraLiters = car.fillFuel(50);
        System.out.println("Fill 50 liters in the car. Extra liters: " + extraLiters);
        System.out.println("Full capacity then 50-Extra: " + (50 - extraLiters));
    }
}
