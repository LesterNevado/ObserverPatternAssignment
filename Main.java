import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creating subscribers
        Subscriber juan = new Subscriber();
        juan.setSubscriberName("Juan");

        Subscriber maria = new Subscriber();
        maria.setSubscriberName("Maria");

        Subscriber oliver = new Subscriber();
        oliver.setSubscriberName("Oliver");

        // create subscriber list
        List<Subscriber> subscribers = new ArrayList<>();

        // create news and add subscribers
        NewsAgency news = new NewsAgency();
        news.setSubscriberList(subscribers);
        news.subscribe(juan);
        news.subscribe(maria);
        news.subscribe(oliver);
        news.setBreakingNews("Typhoon Pepito has reached Signal #1!");

        // notify subscribers
        System.out.println("\nUPDATE!");
        System.out.println(news.notifySubscriber());

        // remove oliver, add paul, and notify new update
        news.unsubscribe(oliver);

        Subscriber paul = new Subscriber();
        paul.setSubscriberName("Paul");
        news.subscribe(paul);

        System.out.println("\nNEW UPDATE RECENTLY!");
        System.out.println(news.notifySubscriber());

        paul.updateNews(news);
    }
}
