public class Subscriber implements SubsciberObserver{
    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(NewsAgency news) {
        System.out.println("Hey, " + subscriberName + 
                           "!\nBREAKING NEWS! : " + news.getBreakingNews());
    }
}
