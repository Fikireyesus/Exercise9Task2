public class Task3
{

    public static void main(String[] args)
    {

        Account account1=new Account("Fikireyesus Bancha",10000,56351);
        try
        {
            account1.withdrawal(100);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        catch (Exception e)
        {

        }
        finally
        {

            System.out.println(account1.getBalance());
        }

    }
}
class Account
{
    private String owner;
    private int balance;
    private int accountNumber;
    public Account(String owner,int balance,int accountNumber)
    {
        this.owner=owner;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public String getOwner(){return owner;}
    public int getBalance(){return balance;}
    public void setBalance(int Balance){balance=balance;}
    public int getAccountNumber(){return  accountNumber;}
    public void withdrawal(int amount)throws NotEnoughMoneyException
    {
        if (balance>=amount)
        {
            balance=balance-amount;
        }
        else
        {
            System.out.println("there is not enough money in your account");
            throw new NotEnoughMoneyException("There is not enough money in your account");
        }
    }

}
class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException(String message){super(message);}
}
