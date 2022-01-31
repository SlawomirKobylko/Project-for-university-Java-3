package creatures;

//Zadanie 9 ↓
public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, String name, Integer age) {
        super(species, age);
    }

    @Override
    public void beEaten() {
        System.out.println("This farm animal is edible!");
    }

    @Override
    public void feed() { super.feed();}

    @Override
    public void feed(Double foodWeight) {
        System.out.println("Farm animal has now received " + foodWeight + " of food");
    }
}