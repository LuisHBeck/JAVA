import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Archive {
    public static void main(String[] args) {

        Path directory = Paths.get("C:/Users/47238341840/IdeaProjects/JavaExcel/archives");
        Path archive = Paths.get("C:/Users/47238341840/IdeaProjects/JavaExcel/archives/test.txt");

//        if (Files.isDirectory(directory)){
//            System.out.println("This directory exist!");
//        }else {
//            System.out.println("This directory doesn't exist!");
//        }
//        if (Files.exists(archive)){
//            System.out.println("This archive exist!");
//        }else {
//            System.out.println("This archive doesn't exist!");
//        }

        try {
            List<String> lines = Files.readAllLines(archive);
            lines.forEach(linha -> System.out.println(linha));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
