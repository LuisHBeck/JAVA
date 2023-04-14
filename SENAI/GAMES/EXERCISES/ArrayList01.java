import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        ArrayList<String> contacts = new ArrayList<>();

        while (true){
            System.out.print("Input the contact name>> ");
            String contact = tec.nextLine();
            contacts.add(contact);

            System.out.println("Want do add another? [0 - no / 1 - yes]");
            int resp = tec.nextInt();
            tec.nextLine();

            if (resp == 1){
                continue;
            } else if (resp == 0) {
                break;
            }else {
                System.out.println("Invalid option");
                break;
            }
        }
        System.out.println();
        int cont = 1;
        for (String name : contacts){
            System.out.printf("Contact %d = %s", cont, name);
            System.out.println();
            cont++;
        }

        System.out.println();
        System.out.print("Serch contact name>> ");
        String search = tec.nextLine();

        for (int i = 0; i< contacts.size(); i++){
            if (contacts.get(i).equals(search)){
                System.out.printf("%s is the %d position", search, i);
            }else {
                System.out.println("INVALID CONTACT");
            }
        }
    }
}
