import java.util.Scanner;
 
class Test10 {
    public static void main(String args[])
    {   
        int a, b=0;
        System.out.print("Enter a Number:");
        Scanner get = new Scanner(System.in);
        a = get.nextInt();
        while(a>0)
        {
            a=a/10;
            b++;
        }
        System.out.println();
        System.out.println("Number of Digits present : "+b);
    }
}
