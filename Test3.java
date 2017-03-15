import java.util.Scanner;

class Test3 
{    
 public static void main(String[] args)
{
char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a VOWEL");
        }
        else
        {
            System.out.print("This is a CONSONANT");
        }
}
}
