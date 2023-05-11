import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVarchive {
    public static void main(String[] args) {
        File file = new File("C:/Users/47238341840/IdeaProjects/JavaExcel/archives/test.txt");
//        Scanner tec = null;
//        try {
//            tec = new Scanner(file);
//            while (tec.hasNextLine()){
//                System.out.println(tec.nextLine());
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }finally {
//            if (tec != null){
//                tec.close();
//            }
//        }

//        FileReader fr = null;
//        BufferedReader br = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
