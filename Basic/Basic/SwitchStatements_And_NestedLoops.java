
import java.util.Scanner;;
public class SwitchStatements_And_NestedLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // if (fruit.equals("mango")){
        //     System.out.println("King of Fruit ");
        // }
        // if(fruit.equals("apple")){
        //     System.out.println("a sweet red fruit");
        // }

        //switch case
        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("Kings of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red Fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round Fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small Fruit");
        //         break;
        //     default:
        //         System.out.println("Please Enter a valid fruit");
        //}

        //Advance Switch case
        // switch (fruit) {
        //     case "Mango" -> System.out.println("Kings of fruits");
        //     case "Apple" -> System.out.println("A sweet red Fruit");
        //     case "Orange" -> System.out.println("Round Fruit");
        //     case "Grapes" -> System.out.println("Small Fruit");
        //     default -> System.out.println("Please Enter a valid fruit");
        // }

        //switch for weeks
        // int day = in.nextInt();
        // switch (day) {
        //     case 1->System.out.println("Monday");
        //     case 2->System.out.println("Tuesday");
        //     case 3->System.out.println("Wednesday");
        //     case 4->System.out.println("Thursday");
        //     case 5->System.out.println("Friday");
        //     case 6->System.out.println("Saturday");
        //     case 7->System.out.println("Sunday");
        // }

        //Nested Switch Case
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 : 
                System.out.println("Kunal Kushwaha");
                break;
            case 2 :
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
            }
            default:
                System.out.println("Enter correct EMPID");
        }
        in.close();
    }
}
