package CSV.application;

import CSV.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String path = "C:/Users/47238341840/IdeaProjects/JavaExcel/archives/test.txt";
        List<Product> list = new ArrayList<Product>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            while (line != null){
                String[] vec = line.split(",");
                String name = vec[0];
                double price = Double.parseDouble(vec[1]);
                int quantity = Integer.parseInt(vec[2]);

                Product prod = new Product(name, price, quantity);
                list.add(prod);

                line = br.readLine();
            }
            System.out.println("PRODUCTS: ");
            for (Product p : list){
                System.out.println(p);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
