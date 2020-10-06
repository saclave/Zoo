public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(2, 100, 49, "chicken");
        System.out.println("Tiger Details: ");
        System.out.println("Age " + tiger.age + " years old");
        System.out.println("Weight: " + tiger.weight + " kg");
        System.out.println("Running at: " + tiger.running + " km/h");
        System.out.println("Eating/Diet: " + tiger.eating);
        System.out.println("Behavior/Sound: " + tiger.behavior());
    }
}

class Tiger extends Felidae{
    public Tiger(int age, double weight, double running, String eating) {
        super(age, weight, running, eating);
    }
}