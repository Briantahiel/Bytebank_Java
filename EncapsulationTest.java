public class EncapsulationTest {
    public static void main(String[] args) {
        Account account = new Account(2);
        Client client = new Client();
        client.setName("Dean");
        account.setOwner(client);
        System.out.println(client.getName());
        System.out.println(account.getOwner().getName());
    }
}
