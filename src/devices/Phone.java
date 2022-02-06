package devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device{
    Double screenSize;
    String OSversion;
    Integer yearOf;


    //Zadanie 10
    //final static String Application = "google maps";
    final static String Server = "https://www.google.com/";
    static final String protocol = "SSH";
    static final String appVersion =  "Android 10";

    public static Double disk_space = 200.50;
    double appCost = 10.0;
    //final static URL url = new URL(Server);
/*
    final static URL url(String Server) {
        try {
            return new URL(Server);
        } catch (MalformedURLException e) {
            e.printStackTrace();{
            return null;
            }
        }
    }*/
    //Double appCost;


    //Zadanie 7
    public Phone (String producer, String model, Integer yearOfProduction, Double screenSize, String OSversion, Integer yearof, Double value){
        super(producer, model, yearOfProduction, value);
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

    //Zadanie 10
    public void installAnApp(String appName){
        System.out.println("instalowanie aplikacji "+appName);
        this.installAnApp(appName);

    }
    public void installAnApp(String appName, String version){
        System.out.println("installing the application "+ appName +" in version "+ version);
        this.installAnApp(appName, Server);

    }
    public void installAnApp(String appName, String version, String server) {
        try{
            URL url = new URL("https",server,443,appName+"-"+version);
            this.installAnApp(url);
        }
        catch (MalformedURLException a){
            a.printStackTrace();
        }

    }

    public void installAnApp(URL url){
        if (Server!=null) //(!Server.equals(true))
        {
            System.out.println("Now download from "+ Server + " server");
            {
                System.out.println("Check disk space form your device");
                if (disk_space > 100) {
                System.out.println("There is disk space");
                    {
                        if (appCost > 0) {
                            System.out.println("You must have to pay " + appCost + " $");
                        } else{
                            System.out.println("This application its free");
                        }
                    }
                    System.out.println("Now I installing the application");

            } else {
                System.out.println("Can't install this application. Out of disk space");
                return;
            }
            }
        }
        else {
            System.out.println("Error 404. Page not found");
        }
        //sprawdzanie miejsca
        //sprawdzenie czy jest płatna
        //obsługa płatności
        //pobranie aplikacji
        //rozpakowanie
        //instalacja
    }

    public void installAnApp(List<String> appNames){
        for (String appName : appNames)
        {
            this.installAnApp(appName);
        }

    }
}
