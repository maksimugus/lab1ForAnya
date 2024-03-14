public class CreditAccount extends Account {
    private User owner;
    private Bank bank;

    public CreditAccount(User owner, Bank bank) {
        this.owner = owner;
        this.bank = bank;
    }

    public void Subscribe() {
        bank.getNotificationService().AddSubscriber(owner, getClass());
    }
}
