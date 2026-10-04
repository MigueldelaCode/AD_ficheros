import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2_BufferedReader {
    public static void main(String[] args) {
        final String ruta = "C:\\Users\\mikik\\IdeaProjects\\AD_ficheros\\src\\main\\java\\datos.txt";

        try(BufferedReader br = (new BufferedReader(new FileReader(ruta)))){
            String line;
            while ( (line = br.readLine()) != null){
                System.out.print(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
