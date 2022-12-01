public class ClientReference {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John");
        Account accountDean = new Account(2);
        System.out.println((accountDean));
        Account accountDave = new Account(2);
        System.out.println((accountDave));
        System.out.println(client.getName());
        Account accountJohn = new Account(2);
        accountJohn.setOwner(client);
        System.out.println(accountJohn.getAgency());
       
    }
}
