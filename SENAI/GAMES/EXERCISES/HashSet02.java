import java.util.Scanner;
import java.util.HashSet;

public class ex02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        HashSet<String> followers = new HashSet<>();

        while (true){
            System.out.print("""
                —————————MENU—————————
                [0] - ADD FOLLOWERS
                [1] - REMOVE FOLLOWERS
                [2] - SEARCH FOLLOWERS
                [3] - TOTAL FOLLOWERS
                [4] - EXIT
                >>> """);
            int resp = tec.nextInt();
            tec.nextLine();

            if (resp == 0){
                System.out.print("Input the @>> ");
                String newFollow = tec.nextLine();
                followers.add(newFollow);
            } else if (resp == 1) {
                int cont = 1;
                for (String follow: followers){
                    System.out.printf("%d- %s, ",cont, follow);
                    cont++;
                }
                System.out.println();
                System.out.print("Input the indice to remove>> ");
                String remove = tec.nextLine();
                if (followers.contains(remove)){
                    followers.remove(remove);
                }else {
                    System.out.println("This @ isn't in you followers");
                }
            } else if (resp == 2) {
                System.out.print("Input the user @>> ");
                String search = tec.nextLine();
                if (followers.contains(search)){
                    System.out.println("TRUE!");
                }else {
                    System.out.println("FALSE!");
                }
            } else if (resp == 3) {
                System.out.printf("You have %d followers", followers.size());
                System.out.println();
            } else if (resp == 4) {
                break;
            }else {
                System.out.println("INVALID OPTION!!");
                break;
            }

        }

    }
}
