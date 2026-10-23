
import java.io.*;

class TextEditor {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("text.txt");
            fw.write("Welcome to Java Text Editor");
            fw.close();

            FileReader fr = new FileReader("text.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
