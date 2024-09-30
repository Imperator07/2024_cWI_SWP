import at.htldornbirn._4cwi.swp.observer.NewsAgency;
import at.htldornbirn._4cwi.swp.observer.NewsChannel;

public class Main {

    String name ;

    public static void main(String[] args){

        var newAgency = new NewsAgency("APA");

        var newsChannel = new NewsChannel("raspi.wabloweb.uk");

        System.out.println("New NewsAgency: " + newAgency + " has been created" );

        System.out.println("New NewsChannel: " + newsChannel + " has been created" );

    }

}