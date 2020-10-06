public class Animal {
    public int age;
    public double weight;
    public double running;
    public String eating;

    public Animal(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public void running(){
        System.out.println("is running");
    }

    public void eating(){
        System.out.println("is eating");
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

}
