


public class MainVehicle {
    public static void main(String[] args) {

    }
    //sa explicam cele 3 principii si sa le implementam

    public class Vehicle{
        double value;

        public double getValue() {
            return value;
        }
        public double calculateValue(){
            return getValue();
        }
    }
    public class Car extends Vehicle {

        public double calculateValue(){
            return getValue()*0.8;

        }
    }

    public class Truck extends Vehicle {

        public double calculateValue(){
            return getValue()*0.9;

        }
    }

    public class Bike extends Vehicle {

        public double calculateValue(){
            return getValue()*0.5;

        }
    }


}