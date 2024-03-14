import java.util.List;

public class NotificationService {
    private final List<Node> subscribers;

    public NotificationService(List<Node> subscribers) {
        this.subscribers = subscribers;
    }

    public void AddSubscriber(User user, Class<? extends Account> cl) {
        subscribers.add(new Node(user, cl));
    }

    public void Notify(Class<? extends Account> cl) {
        subscribers.stream().filter(node -> node.cl().equals(cl)).forEach(node -> {
            node.user().AddNotification("Change in " + cl);
        });
    }
}
