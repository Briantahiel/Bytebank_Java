public class MethodTest {
    public static void main(String[] args) {
        Account myAccount = new Account(2);

        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());

        myAccount.withdrawal(200);
        System.out.println(myAccount.getBalance());

        Account yourAccount = new Account(2);
        yourAccount.deposit(2000);
        System.out.println(yourAccount.getBalance());
        yourAccount.transfer(400, myAccount);
        System.out.println(myAccount.getBalance());
        System.out.println(yourAccount.getBalance());
    }
}
