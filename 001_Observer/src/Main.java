import at.htldornbirn._4cwi.swp.observer.NewsAgency;
import at.htldornbirn._4cwi.swp.observer.NewsChannel;

public class Main {

    String name ;

    public static void main(String[] args) throws Exception{

        //news Agency
        var apa = new NewsAgency("APA");
        var reuters = new NewsAgency("Reuters");

        //news Channels
        var wabloweb = new NewsChannel("raspi.wabloweb.uk");
        var nzz = new NewsChannel("nzz");
        var nytimes = new NewsChannel("New York Times");

        apa.subscribe(wabloweb);
        apa.subscribe(nytimes);

        reuters.subscribe(nzz);
        reuters.subscribe(nytimes);

        //broadcast news
        apa.broadcast("Auf der Suche nach der nächsten Regierung!");
        reuters.broadcast("Harris campaign raises $55 mln over two weekend events,  campaign official says");

    }

}