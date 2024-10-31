class Vehicle{
    String make;
    String model;
    int year;

        Vehicle(String make, String model, int year){
            this.make=make;
            this.model=model;
            this.year=year;
        }       
}

class Car extends Vehicle{
     int numberofDoors;

        Car(String make, String model, int year, int numberofDoors){
            super(make, model, year);
            this.numberofDoors= numberofDoors;
        }
        public void displayDetails(){
            System.out.println("Car Details: ");
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Number of Doors: "+ numberofDoors);
    
        }
}
    
    public class Tasksheet126{
        public static void main(String[] args) {
            Car car0 = new Car("Toyota","Hilux",2022,4);
            car0.displayDetails();;
        }
    }
