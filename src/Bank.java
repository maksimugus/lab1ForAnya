public class Bank {
    public NotificationService getNotificationService() {
        return notificationService;
    }

    private NotificationService notificationService;

    private int creditPercent;

    public CreditAccount CreateAccount(User user) {
        return new CreditAccount(user, this);
    }

    public Bank(NotificationService notificationService, int creditPercent) {
        this.notificationService = notificationService;
        this.creditPercent = creditPercent;
    }

    public void setCreditPercent(int creditPercent) {
        this.creditPercent = creditPercent;
        notificationService.Notify(CreditAccount.class);
    }
}
