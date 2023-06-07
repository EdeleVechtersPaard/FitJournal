import java.util.ArrayList;
import java.util.List;

public class Notification implements Subject {

    private List<NieuwsBriefSubscriber> subs = new ArrayList<>();
     String title;

    @Override
    public void subscribe(NieuwsBriefSubscriber sub)
    {
        subs.add(sub);
    }

    @Override
    public void unSubscribe(NieuwsBriefSubscriber sub)
    {
     subs.remove(sub);
    }

    @Override
    public void notifySubscribers()
    {
        for(NieuwsBriefSubscriber sub : subs)
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
