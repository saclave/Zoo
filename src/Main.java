public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(2, 100);
        System.out.println("Tiger Details: ");
        System.out.println("Age " + tiger.age + " years old");
        System.out.println("Weight: " + tiger.weight + " kg");
        System.out.println("Behavior/Sound: " + tiger.behavior());
        tiger.eating();
        tiger.running();
    }
}

class Tiger extends Felidae{
    public Tiger(int age, double weight) {
        super(age, weight);
    }
}