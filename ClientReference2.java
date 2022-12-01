public class ClientReference2{
    public static void main(String[] args) {
        Account accountJohn = new Account(2);
        Client client = new Client();
        accountJohn.setOwner(client);
        client.setName("Bob");
        System.out.println(client.getName());
    }
}