import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        List<HashMap<Object, Object>> products = new ArrayList<>();
        HashMap<Object, Object> product = new HashMap<>();

         while (true){
             System.out.print("""
                 —————————MENU—————————
                 [0] - ADD PRODUCT
                 [1] - REMOVE PRODUCT
                 [2] - UPDATE PRODUCT
                 [3] - SHOW ALL
                 [4] - EXIT
                 >>> """);
             int resp = tec.nextInt();
             tec.nextLine();

             if (resp == 4){
                 break;
             } else if (resp == 0) {
                 product.clear();
                 
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
                 System.out.println("Input the index of product>> ");
                 int index = tec.nextInt();
                 tec.nextLine();
                 if (products.size() >= index){
                     products.remove(index);
                 }else {
                     System.out.println("Invalid index");
                 }
             }
         }
    }
}
