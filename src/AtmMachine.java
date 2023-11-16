import java.util.Scanner;

class ATM{
    float Balance;
    int PIN=1234;

    public void checkPin(){
        System.out.println("Enter a Pin");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if(enterPin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a Valid Pin");
            menu();
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                break;
            default:
                System.out.println("Enter Valid choice");
        }


    }

    public void checkBalance(){
        System.out.println("Your Balance :"+ Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Withdraw Amount :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(Balance>amount){
            Balance = Balance-amount;
            System.out.println("Withdraw Money Successfully");
            menu();
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public void depositMoney(){
        System.out.println("Enter Deposit Amount :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money Deposit Successfully");
        menu();
    }
}



public class AtmMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();

    }
}

