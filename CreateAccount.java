public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(1000);
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new Account();
        secondAccount.deposit(1200); 
        System.out.println(secondAccount.getBalance());
    }
}
