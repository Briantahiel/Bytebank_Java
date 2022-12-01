public class Account {
    private double balance;
    int agency;
    int number;
    Client owner;
    // This method does not return a value.
    public void deposit(double value){
        this.balance += value;
    }
     // This method does return a value.
    public boolean withdrawal(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean transfer(double value, Account account){
       if(this.balance >= value){
        this.balance -= value;
        account.deposit(value);
        return true;
       }
        return false;
    }
    public double getBalance(){
        return this.balance;
    }
}
