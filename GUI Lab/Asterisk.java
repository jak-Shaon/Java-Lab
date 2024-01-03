public class Asterisk 
{
    public static void main(String[] args) 
    {
        System.out.printf("Exercise a)%n%n");

        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= i; j++)

            System.out.print("*");
            System.out.println();
        }
        
        System.out.println();
        System.out.printf("Exercise b)%n%n");
        
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 10; j >= i; j--)

            System.out.print("*");
            System.out.println();
        }
        
        System.out.println();
        System.out.printf("Exercise c)%n%n");
        
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j < i; j++)

                System.out.print(" ");
            
            for (int j = 10; j >= i; j--)

                System.out.print("*");
                System.out.println();
        }
        
        System.out.println();
        System.out.printf("Exercise d)%n%n");
        
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 10; j > i; j--)

                System.out.print(" ");
            
            for (int j = 1; j <= i; j++)

                System.out.print("*");
                System.out.println();
        }
    } 
} 