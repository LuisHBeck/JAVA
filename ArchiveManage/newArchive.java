import java.nio.file.*;

public class newArchive {
    public static void main(String[] args) {
        Path oldJavaLogo = Paths.get("C:/Users/47238341840/IdeaProjects/JavaExcel/archives/Java-Logo.png");
        Path newJavaLogo = Paths.get("C:/Users/47238341840/IdeaProjects/JavaExcel/archives/python-logo.png");

        try {
            byte[] bytesNewLogo = Files.readAllBytes(newJavaLogo);
            Files.write(oldJavaLogo, bytesNewLogo);
        }catch (Exception e){
            System.out.println("ERRO!");
        }
    }
}
