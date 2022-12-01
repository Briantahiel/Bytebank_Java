public class AccessTest {
    public static void main(String[] args) {
        Account account = new Account(2);
        // account.setAgency(2);
        System.out.println(account.getAgency());
        account.deposit(300);
        account.withdrawal(100);
        System.out.println(account.getBalance());
    }
}
