import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter values : ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        Operations obj = new Operations();
        int add=obj.Add(a,b);
        double pow=obj.Power(a,b);
        int sub=obj.Sub(a,b);
        int div=obj.Div(a,b);
        int multi=obj.Multi(a,b);

        System.out.println("Addition : "+add);
        System.out.println("Power : "+pow);
        System.out.println("Subtraction : "+sub);
        System.out.println("Division : "+div);
        System.out.println("Multiplication : "+multi);
    }
}
class Operations
{
    int Add(int i, int j)
    {
        return(i+j);
    }
    double Power(int i, int j)
    {
        return(Math.pow(i,j));
    }
    int Sub(int i, int j)
    {
        return(i-j);
    }
    int Div(int i, int j)
    {
        return(i/j);
    }
    int Multi(int i, int j)
    {
        return(i*j);
    }
}