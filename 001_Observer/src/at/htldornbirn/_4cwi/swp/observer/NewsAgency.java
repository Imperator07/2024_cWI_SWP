package at.htldornbirn._4cwi.swp.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private final String name;
    private final List<NewsChannel> channels;

    public NewsAgency(String name) {

        this.name= name;
        this.channels = new ArrayList<>();
    }

    public void subscribe(NewsChannel channel)
    {
        System.out.println(channel + " has subscribed to " + this);
        this.channels.add(channel);
    }

    public void unsubscribe(NewsChannel channel)
    {
        this.channels.remove(channel);
    }

    public void broadcast(String news)
    {
        System.out.println(this + " broadcasts " + news);
        for(NewsChannel channel : channels)
        {
            channel.notify(news);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
