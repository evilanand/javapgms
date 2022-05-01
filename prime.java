import java.util.Scanner;
class Test 
{
    int n, i, p = 1;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Please insert any number:");
        n = sc.nextInt();
    }
    void checkPrime() 
    {
        for (i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                p = 0;
                break;
            }
        }
        if (p == 1) 
        {
            System.out.println(n+ " is prime number" );
        } 
        else 
        {
            System.out.println(n+ " is not prime number");
        }
    }
}
class Main {
    public static void main(String args[])
    {
        Test obj = new Test();
        obj.input();
        obj.checkPrime();
    }
}
