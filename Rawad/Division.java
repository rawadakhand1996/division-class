
/**
 * Write a description of class Division here.
 * 
 * @author Rawad
 * @version 9/20/2016
 */
public class Division
{
    // instance variables - replace the example below with your own
    private double numerator;
    private double denominator;

    /**
     * Constructor for objects of class Division
     */
    public Division()
    {
       numerator = 1;
       denominator = 1;
    }

    /**
     Description: Changes the numerator and the denominator
     Input: User inserts values for n1 and n2
     Output: Replace the numerator n1 and denominator n2 and divides n1 with n2
     Example: n1= 15 n2= 5
     * @return is 3
     */
    public void getNumber (double n1, double n2)
    {
       numerator = n1;
       denominator = n2;
    }
    public void print()
{
    System.out.println(numerator/denominator);
}
}