import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int month = getNum();
        int year = getYear();
        
        
        getMonth(month, year);
    }

    public static void getMonth(int month, int year){
        switch (month){
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                if (year%4 != 0){
                    System.out.println("February " + year + " has 28 days");
                }
                else{
                    System.out.println("February " + year + " has 29 days");
                }
                break;
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("Novermber " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }


    public static int getYear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int y = scan.nextInt();
        return y;
    }

    public static int getNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int num = scan.nextInt();
        return num;
    }
}
