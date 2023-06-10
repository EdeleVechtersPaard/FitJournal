public interface Subject {
    void subscribe(Member sub);

    void unSubscribe(Member sub);

    void notifySubscribers();

    void upload(String title);
}
