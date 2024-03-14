public class Main {
    public static void main(String[] args) {
        var user = new User();

        CentralBank cb = new CentralBank();

        var bank = cb.CreateBank(239);

        var ac = bank.CreateAccount(user);

        user.addAccount(ac);

        user.SubscribeForNotifications(0);

        bank.setCreditPercent(34);
    }
}