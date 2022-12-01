public class ClientReference {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "John";
        client.id = "123456";
        client.telephone = "55567889";

        Account accountJohn = new Account();
        accountJohn.agency = 1;
        accountJohn.owner = client;
        System.out.println(accountJohn.owner.name);
       
    }
}
