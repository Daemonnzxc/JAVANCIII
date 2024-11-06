interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    
    @Override
    public boolean feed(boolean timeToEat) {
        // Gorilla is hungry
        if (timeToEat) {
            System.out.println("Put gorilla food into cage.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla: lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla: pet at your own risk.");
    }
}

public class Tasksheet129 {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
