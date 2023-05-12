package Teste.app;

import Teste.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teste_csv {
    public static void main(String[] args) {
        String path = "C:/Users/47238341840/Desktop/Kalunga_scraping-main/xlsx_archives/Products.csv";
        List<Product> productsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            while (line != null){
                String[] vec = line.split(";");
                int idProduct = Integer.parseInt(vec[0]);
                String nameProduct = vec[1];
                double priceProduct = Double.parseDouble(vec[2]);

                Product product = new Product(idProduct, nameProduct, priceProduct);
                productsList.add(product);

                line= br.readLine();
            }
            System.out.println("PRODUCTS");
            for (Product prod: productsList){
                System.out.println(prod);
          }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
