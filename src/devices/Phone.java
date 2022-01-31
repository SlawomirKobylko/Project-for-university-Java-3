package devices;

public class Phone extends Device{
    Double screenSize;
    String OSversion;
    Integer yearOf;


    //Zadanie 7
    public Phone (String producer, String model, Integer yearOfProduction, Double screenSize, String OSversion, Integer yearof){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.OSversion = OSversion;
        this.yearOf = yearof;
    }
    /*Phone (String producer, String model, Double yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }*/

    //Zadanie 7
    @Override
    public void turnOn() {
        System.out.println("I press the button");
    }

    //Zadanie 6


    @Override
    public String toString() {
        return "Phone{" +
                "producer='"+ producer + '\'' +
                ", model='"+ model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", OSversion='" + OSversion + '\'' +
                ", yearOf=" + yearOf +
                '}';
    }
}
