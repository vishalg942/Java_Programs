public class calculator
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       double a=20.5, b=5.5;
       System.out.println("Enter the operation to be performed");
       String operation=sc.next();
       switch(operatin)
       {
       case "Addition": System.out.println("The sum of two numbers a and b are "+(a+b));
               break;
       case "Substraction": System.ot.printin("The subsraction of two numbers are "+(a-b));
               break;
       case "Multiplication": System.out.println("The multiplication of two numbers are "+(a*b));
               break;
       case "Division": System.ot.println("The division of two numbers are "+(a/b));
               break;
       default: System.out.println("Invalid Operations");
               break;
     }
}
}