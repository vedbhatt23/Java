public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        try {
            if(n<2 || n>10)
            {
                throw new MyExcep();
            }

            Main obj = new Main();
            obj.factorial(n);

        }catch (MyExcep me)
        {
            System.out.println("Number out of range");
        }
    }

    void factorial(int n)
    {
        int fact = 1;
        for(int i = 1;i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.println("Facorial: "+fact);
    }
}