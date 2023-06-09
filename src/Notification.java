import java.util.ArrayList;
import java.util.List;

public class Notification implements Subject {

    private List<Member> subs = new ArrayList<>();
     String title;

    @Override
    public void subscribe(Member sub)
    {
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Member sub)
    {
     subs.remove(sub);
    }

    @Override
    public void notifySubscribers()
    {
        for(Member sub : subs)
        {
            sub.update();
        }
    }

    @Override
    public void upload(String title)
    {
        this.title = title;
        notifySubscribers();
    }
}
