public class Animal {
    public int age;
    public double weight;
    public double running;
    public String eating;

    public Animal(int age, double weight, double running, String eating){
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public Animal setAge(int age){
        this.age = age;
        return this;
    }

    public double getWeight(){
        return weight;
    }

    public Animal setWeight(double weight){
        this.weight = weight;
        return this;
    }

    public int getAge(){
        return age;
    }

    public Animal setRunning(double running){
        this.running = running;
        return this;
    }

    public double getRunning(){
        return running;
    }

    public Animal setEating(String eating){
        this.eating = eating;
        return this;
    }

    public String setEating(){
        return eating;
    }
}
