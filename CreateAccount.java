public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 1000;
        System.out.println(firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 1200;
        System.out.println(secondAccount.balance);
    }
}
