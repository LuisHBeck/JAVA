import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        List<HashMap<Object, Object>> products = new ArrayList<>();

        while (true){
            System.out.print("""
                 —————————MENU—————————
                 [0] - ADD PRODUCT
                 [1] - SHOW ALL
                 [2] - REMOVE PRODUCT 
                 [3] - EXIT
                 >>> """);
            int resp = tec.nextInt();
            tec.nextLine();

            if (resp == 3){
                break;
            } else if (resp == 0) {

                HashMap<Object, Object> product = new HashMap<>();

                System.out.print("Product name>> ");
                String name = tec.nextLine();
                product.put("name", name);

                System.out.print("Product price>> ");
                int price = tec.nextInt();
                tec.nextLine();
                product.put("price", price);

                System.out.print("Product quantity>> ");
                int quantity = tec.nextInt();
                tec.nextLine();
                product.put("quantity", quantity);

                products.add(product);
            } else if (resp == 1) {
                int n = 1;
                for (HashMap<Object, Object> dicionario: products){
                    System.out.println();
                    System.out.println("Product #" + n);
                    n++;
                    for (Object key : dicionario.keySet()){
                        Object value = dicionario.get(key);
                        System.out.println(key + " = " + value);
                    }
                }
            } else if (resp == 2) {
                System.out.print("Input the index of product>> ");
                int index = tec.nextInt();
                tec.nextLine();
                if (products.size() >= index){
                    products.remove(index - 1);
                }else {
                    System.out.println("Invalid index");
                }
            }
        }
    }
}
