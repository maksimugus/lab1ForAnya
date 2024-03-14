import java.util.ArrayList;
import java.util.List;

public class User {
    private final List<String> notifications;

    private List<CreditAccount> accounts;

    public User() {
        this.accounts = new ArrayList<>();
        notifications = new ArrayList<>();
    }

    public void AddNotification(String notification) {
        notifications.add(notification);
        System.out.println(notification);
    }

    public void addAccount(CreditAccount account) {
        accounts.add(account);
    }

    public void SubscribeForNotifications(int accountId) {
        accounts.get(accountId).Subscribe();
    }
}
