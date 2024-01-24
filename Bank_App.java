import java.util.Scanner;

    public class Bank_App {
    
    
        public static void main(String[] args) {
            int input;
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("**********************<<<<<Bank Details>>>>>*********************");
            System.out.println("Enter Your First Name:- ");
            String na = sc.next();
            System.out.println("Enter Your Last Name:- ");
            String la = sc.next();
            System.out.println("Account Number is:- ");
            String ac = sc.next();
            System.out.println("Account Type is:- ");
            String sa = sc.next();
            System.out.println("Opening Balance is:- ");
            float ob = sc.nextInt();
            RBI s = new RBI(ac,la,na,ob,sa);
            
            
            System.out.println("Enter 1 for Deposite Money");
            System.out.println("Enter 2 for Withdraw Money");
            System.out.println("Enter 3 for Banking Fund");
            System.out.println("Enter 4 for Last Transaction");
            System.out.println("Enter 5 for Exit");
            boolean b = true;
            
            
            
            input = sc.nextInt();
            
            switch(input)
            {
            case 1:
                System.out.println("First Name:- "+na);
                System.out.println("Last Name:- "+la);
                System.out.println("Account Number:- "+ac);
                System.out.println("Account Type:- "+sa);
                System.out.println("Your Balance:- "+ob);
                s.DE();
                
                break;
            case 2:
                System.out.println("First Name:- "+na);
                System.out.println("Last Name:- "+la);
                System.out.println("Account Number:- "+ac);
                System.out.println("Account Type:- "+sa);
                System.out.println("Your Balance:- "+ob);
                s.WDraw();
                break;
            case 3:
                s.Details();
                break;
            case 4:
                s.Trasac();
                break;
            case 5:
                b = true;
                System.out.println("First Name:- "+na);
                System.out.println("Last Name:- "+la);
                System.out.println("Account Number:- "+ac);
                System.out.println("Account Type:- "+sa);
                System.out.println("Your Balance:- "+ob);
                System.out.println("*******Thank YOU*******");
                break;
            
            }
            
    
        }
    
    
}
