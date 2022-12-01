public class ClientReference2{
    public static void main(String[] args) {
        Account accountJohn = new Account();
        accountJohn.owner = new Client();
        accountJohn.owner.name = "John";
        System.out.println(accountJohn.owner.name);
    }
}