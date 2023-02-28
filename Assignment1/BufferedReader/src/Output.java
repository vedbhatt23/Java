import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Output
{
    public static void main(String[] k) throws IOException {
        int n, fact = 1, con = 1;
        do {
            Scanner sc = new Scanner(System.in);
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1) Fibonacci using Scanner");
            System.out.println("2) Fibonacci using Buffer");
            System.out.println("3) Factorial using Scanner");
            System.out.println("4) Factorial using Buffer");
            switch (Integer.parseInt(k[0])) {
                case 1: {
                    System.out.println("Enter number 1 : ");
                    int n1 = sc.nextInt();
                    System.out.println("Enter number 2 : ");
                    int n2 = sc.nextInt();
                    System.out.println("Enter length : ");
                    int len = sc.nextInt();
                    for(int i =0;i<len;i++)
                    {
                        int p = n1+n2;
                        n1 = n2;
                        n2=p;
                        System.out.println(p + " ");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter number 1 : ");
                    int n1 = Integer.parseInt(rd.readLine());
                    System.out.println("Enter number 2 : ");
                    int n2 = Integer.parseInt(rd.readLine());
                    System.out.println("Enter length : ");
                    int len = Integer.parseInt(rd.readLine());
                    for(int i =0;i<len;i++)
                    {
                        int p = n1+n2;
                        n1 = n2;
                        n2 = p;
                        System.out.println(p + " ");
                    }
                    break;
                }
                case 3: {
                    fact = 1;
                    System.out.println("Enter number 3 : ");
                    n = sc.nextInt();
                    for (int i = 1; i <= n; i++)
                    {
                        fact = fact * i;
                    }
                    System.out.println("Factorial SC : " + fact);
                    break;
                }
                case 4:
                {
                    fact = 1;
                    try
                    {
                        System.out.println("Enter number 4 : ");
                        n = Integer.parseInt(rd.readLine());
                        for (int i = n; i > 0; i--)
                        {
                            fact = fact * i;
                        }
                        System.out.println("Factorial BR : " + fact);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
            System.out.println("Continue 1) Yes 2) No : ");
            con = sc.nextInt();
        }while (con==1);
    }
}