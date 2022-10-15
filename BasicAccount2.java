/*
Implement a subclass of BankAccount called BasicAccount whose withdraw
method charges a penalty of $30 for each withdrawal that results in an
overdraft.

 */
public class  BasicAccount2 extends BankAccount  {
    private double withdraw;

    public BasicAccount2(double withdraw) {
        this.withdraw = withdraw;
    }

    int n=0;
    public double withdraw(){
        n++;
        System.out.println("The withdraw you have : ");
        if  (balance >= withdraw  ) {
            if (n < 3)
                return withdraw;
            else
                return (withdraw - 30);
        } else

        return 0;

    }
}
