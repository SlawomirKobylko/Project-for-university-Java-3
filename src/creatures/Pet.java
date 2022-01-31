package creatures;

public class Pet extends Animal {
    public Pet(String species, String name, Integer age) {
        super(species, age);
        this.name = name;
        //this.age = age;
        //this.alive = true;
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("This pet has now received " + foodWeight + " of food");

    }
}
