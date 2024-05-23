import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        ArrayList<Integer> numbers = new ArrayList();
//        System.out.println(numbers.size());
//        numbers.add(5);
//        numbers.add(14);
//        numbers.add(7);
//        System.out.println(numbers.get(2));
//        numbers.set(2,21);
//        System.out.println(numbers.get(2));
//        numbers.remove(0);
//        System.out.println(numbers.size());
//        while(true) {
//            System.out.println("ivesk preke");
//            String input = sc.nextLine();
//            shoppingList.add(input);
//            System.out.println();
//            System.out.println("----------------------------");
//            for (int i = 0; i < shoppingList.size(); i++) {
//                System.out.println(shoppingList.get(i));
//            }
//            System.out.println("----------------------------");
//            System.out.println();
//        }


        ArrayList<ArrayList<String>> students = new ArrayList<>();
        ArrayList<String> studentas = new ArrayList<>();
        studentas.add("Jonas");
        studentas.add("Jokubaitis");
        studentas.add("1994-02-06");
        studentas.add("labasasjonas@gmail.com");
        students.add(studentas);
        ArrayList<String> studentas2 = new ArrayList<>();
        studentas2.add("Petras");
        studentas2.add("Jakobuonis");
        studentas2.add("1992-05-06");
        studentas2.add("labasaspetras@gmail.com");
        students.add(studentas2);

        ArrayList<String[]> studentsSimple = new ArrayList<>();
        String[] studentasSimple = new String[4];
        studentasSimple[0] = "Jonas";
        studentasSimple[1] = "Jokubaitis";
        studentasSimple[2] = "1994-02-06";
        studentasSimple[3] = "labasasjonas@gmail.com";
        studentsSimple.add(studentasSimple);


        ArrayList<String> shoppingList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            printInfoMessages();
            int item = intInput(sc);
            sc.nextLine();
            switch (item) {
                case 1:
                   addItem(shoppingList,sc);
                    break;
                case 2:
                   printItems(shoppingList);
                    break;
                case 5:
                    System.exit(1);

                default:
                    System.out.println("pasiilgo Maryte Jono...");
                    break;
            }
        }

//        while (true) {
//            String belekas = sc.nextLine();
//            switch (belekas) {
//                case "jonas":
//                    System.out.println("buvo jonas");
//                    break;
//                case "labas":
//                    System.out.println("tai kur valkiojais?(klausia zmona jono)");
//                    break;
//                case "ate":
//                    System.out.println("jonas isejo");
//                    break;
//                default:
//                    System.out.println("pasiilgo Maryte Jono...");
//                    break;
//            }
//        }

    }
    public static int intInput(Scanner sc){
        while(true) {
            try {
               return sc.nextInt();
            } catch (Exception e) {
                System.out.println("iveskite skaiciu skaitmenimis");
                sc.nextLine();
            }
        }
    }
    public static void printItems(ArrayList<String> shoppingList){
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }
    public static void addItem(ArrayList<String> shoppingList, Scanner sc){
        System.out.println("parasykite prekes pavadinima");
        String input = sc.nextLine();
        shoppingList.add(input);
    }
    public static void printInfoMessages(){
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("1. ivesti preke");
        System.out.println("2. atvaizduoti prekes");
        System.out.println("3. redaguoti preke");
        System.out.println("4. trinti preke");
        System.out.println("5. iseiti is programos");
        System.out.println("----------------------------");
        System.out.println();
    }
}