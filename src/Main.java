import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Задание 1
//        String str = new String();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Please enter something ");
//            str = scanner.nextLine();
//            System.out.printf("You enter \"%s\". If you wanna stop enter \"Exit\"", str);
//            if (str.equalsIgnoreCase("exit")){
//                System.out.println("Thank you for using our program!!!");
//                break;
//            }
//        }

    // Задание 2

//        Scanner scanner = new Scanner(System.in);
//        System.out.print( "Please enter a number: ");
//        int x = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= x || i<=x*(-1); i++) {
//            sum += i;
//        }
//        System.out.printf("The sum of all numbers from 0 to %d is %d ", x, sum);

    // Задание 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter your score: ");
//        int score = new Scanner(System.in).nextInt();
//
//        while (score < 0 || score > 100) {
//            System.out.print("You entered an incorrect value, please re-enter your score (0 - 100): ");
//            score = scanner.nextInt();
//        }
//        if (score >= 80) {
//            System.out.println("Congrats! You’ve passed the test! \"A\"");
//        } else if (score >= 60 && score < 80) {
//            System.out.println("Congrats! You’ve passed the test! \"B\"");
//        } else if (score >= 40 && score < 60) {
//            System.out.println("You’ve passed the test! \"C\"");
//        } else if (score >= 20 && score < 40) {
//            System.out.println("Sorry, you’ve failed the test. \"D\"");
//        } else if (score >= 0 && score < 20) {
//            System.out.println("Sorry, you’ve failed the test. \"E\"");
//        }

    //Задание 4
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Which of the 10 channels will we watch??? To turn off, select \"0\". - ");
//        int channel =scanner.nextInt();
//        String tvChanels [] = {"MTV Music Television", "BBC", "CNN", "Discovery Channel", "ESPN", "STAR World",
//                "HBO (Home Box Office)", "Disney Channel", "FOX", "Nickelodeon"};
//
//        while (true) {
//            while (channel < 0 || channel > 10) {
//                System.out.print("Invalid channel number. Select a channel from 1 to 10. To turn off, select \"0\". - ");
//                channel = new Scanner(System.in).nextInt();
//            }
//            if (channel == 0) {
//                System.out.println("Bye");
//                break;
//            }
//            System.out.println("High watch channel - "+tvChanels[channel - 1]);
//        System.out.print("\n"+ "What channel will we watch next? - ");
//        channel = new Scanner(System.in).nextInt();
//    }

    //Задание 5

//    Scanner scanner = new Scanner(System.in);
//    System.out.print("1. Ввести имя " + "\n" + "2. Ввести фамилию"  + "\n" + "3. Ввести год рождения" + "\n" +
//                    "4. Вывести информацию" + "\n" + "0. Выход" + "\n" + "Your choice - ");
//    int choice = scanner.nextInt();
//        scanner.nextLine();
//    String firstName = null;
//    String lastName = null;
//    String yearOfBirth = null;
//
//        while (true){
//            while (choice < 0 || choice > 4) {
//                System.out.print("Invalid menu number. Select a menu number from 1 to 4. To turn off, select \"0\". - ");
//                choice = scanner.nextInt();
//                scanner.nextLine();
//            }
//
//            switch (choice){
//                case 1:
//                    System.out.print("Enter your first name - ");
//                    firstName = scanner.nextLine() ;
//                    System.out.print("Your first name information has been updated " + "\n");
//                    break;
//                case 2:
//                    System.out.print("Enter your last name - ");
//                    lastName= scanner.nextLine() ;
//
//                    System.out.print("Your last name information has been updated " + "\n");
//                    break;
//                case 3:
//                    System.out.print("Enter your year of birth - ");
//                    yearOfBirth = scanner.nextLine() ;
//
//                    System.out.print("Your year of birth information has been updated " + "\n");
//                    break;
//                case 4:
//                    System.out.print("Here is your data:" + "\n" + firstName + "\n" + lastName + "\n" +
//                            yearOfBirth);
//                    break;
//        }
//            if (choice ==0){
//                System.out.println("bye");
//            break;
//            }
//        System.out.print("1. Ввести имя " + "\n" + "2. Ввести фамилию"  + "\n" + "3. Ввести год рождения" + "\n" +
//                "4. Вывести информацию" + "\n" + "0. Выход" + "\n" + "Your choice - ");
//
//            choice = scanner.nextInt();
//           scanner.nextLine();
//        }

        }
    }
