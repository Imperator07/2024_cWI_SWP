package at.htldornbirn._4cwi.swp.observer;

public class NewsChannel {

    private final String name;

    public NewsChannel(String name) {

        this.name = name;
    }

    public void notify(String news)
    {
        System.out.println(this + " is notified " + news);
    }

    @Override
    public String toString() {
        return name;
    }
}
