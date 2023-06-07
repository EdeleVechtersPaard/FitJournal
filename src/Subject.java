public interface Subject {
    void subscribe(NieuwsBriefSubscriber sub);

    void unSubscribe(NieuwsBriefSubscriber sub);

    void notifySubscribers();

    void upload(String title);
}
