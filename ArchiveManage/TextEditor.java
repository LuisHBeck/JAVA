import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your text:");

        try {
            String text = br.readLine();

            System.out.println("Do you want to save the text to a file? (Y/N)");
            String choice = br.readLine();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Enter the path where you want to save the file:");
                String filePath = br.readLine();
                System.out.println("Enter the filename:");
                String filename = br.readLine();

                File file = new File(filePath+filename);
                FileWriter fw = new FileWriter(file);
                fw.write(text);
                fw.close();

                System.out.println("Text saved to file " + filename);
                System.out.println("Text saved to file " + filePath);
            } else {
                System.out.println("Text not saved");
            }

            System.out.println("Do you want to read the text file content? (Y/N)");
            choice = br.readLine();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Enter the path:");
                String filePath= br.readLine();
                System.out.println("Enter the filename:");
                String filename = br.readLine();

                File file = new File(filePath+filename);
                FileReader fr = new FileReader(file);
                BufferedReader br2 = new BufferedReader(fr);

                String line;
                while ((line = br2.readLine()) != null) {
                    System.out.println(line);
                }

                br2.close();
                fr.close();
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}