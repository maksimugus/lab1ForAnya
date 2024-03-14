import java.util.ArrayList;

public class CentralBank {
    public Bank CreateBank(int creditPercent) {
        return new Bank(new NotificationService(new ArrayList<>()), creditPercent);
    }
}
