import java.util.ArrayList;
import java.util.List;

interface Youtuber{
    void subscribe(Subscriber s);
    void videoName(String video_name);
    void unsubscribe(Subscriber s);
}
interface Subscriber{
    void update(String video_name);
}
class Youtuber_Impl implements Youtuber{
    private String youtuber_name;
    public Youtuber_Impl(String youtuber_name) {
        this.youtuber_name=youtuber_name;
    }
    private List<Subscriber> subscriber=new ArrayList<>();
    @Override
    public void subscribe(Subscriber s) {
        subscriber.add(s);
    }

    @Override
    public void videoName(String video_name) {
        for(Subscriber sub:subscriber){
            sub.update(video_name);
        }
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscriber.remove(s);
    }
}
class Subscriber_Impl implements Subscriber{
    private String name;
    Subscriber_Impl(String name){
        this.name=name;
    }

    @Override
    public void update(String video_name) {
        System.out.println(name+" received an update for "+video_name);
    }
}
public class Youtuber_Subscriber {
    public static void main(String[] args) {
        Youtuber tSeries = new Youtuber_Impl("T-Series");
        Youtuber TravelVlogs = new Youtuber_Impl("Travel Vlogs");
        Subscriber Moumita = new Subscriber_Impl("Moumita");
        Subscriber Onkita = new Subscriber_Impl("Onkita");
        Subscriber Jiya = new Subscriber_Impl("Jiya");
        Subscriber Sachin = new Subscriber_Impl("Sachin");
        tSeries.subscribe(Onkita);
        TravelVlogs.subscribe(Moumita);
        tSeries.subscribe(Jiya);
        TravelVlogs.subscribe(Sachin);
        tSeries.subscribe(Sachin);
        tSeries.videoName("Petriotic Song");
        TravelVlogs.videoName("Ayodhya");
        TravelVlogs.unsubscribe(Sachin);
        TravelVlogs.videoName("Mathura");
    }
}
