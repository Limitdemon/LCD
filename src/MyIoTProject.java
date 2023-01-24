import java.util.Scanner;

public class MyIoTProject {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        LCD.showloginMenu();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Option = ");
        String option = scan.nextLine();


        switch (option) {

            case "1":

                LCD.showHomepageMenu();

                System.out.print("Enter Option = ");
                String user = scan.nextLine();
                if (!user.isEmpty()) {

                    menu();

                } else {
                    System.out.println("Error");
                }
                break;

            case "2":
                sub_menu();
                break;

            case "3":
                LCD.showQuitMenu();
                break;

            default:
                System.out.println("Error");
                break;
        }
    }

    public static void sub_menu() {

        Scanner scan = new Scanner(System.in);
        LCD.showSystemMenu();
        System.out.print("Enter Option = ");
        String func1 = scan.nextLine();
        switch (func1) {
            case "1":
                menu();
                break;

            case "2":
                LCD.showSearchMenu();
                System.out.print("Enter Option = ");
                String func2 = scan.nextLine();
                switch (func2) {

                    case "1":
                        sub_menu();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;

            case "3":
                LCD.showHomepageMenu();
                System.out.print("Enter Option = ");
                String func3 = scan.nextLine();
                switch (func3) {

                    case "1":
                        sub_menu();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;

            case "4":
                LCD.showBombItMenu();
                System.out.print("Enter Option = ");
                String func4 = scan.nextLine();
                switch (func4) {

                    case "1":
                        sub_menu();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case "5":
                LCD.showPongMenu();
                System.out.print("Enter Option = ");
                String func6 = scan.nextLine();
                switch (func6) {

                    case "1":
                        sub_menu();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
        }

    }

}

