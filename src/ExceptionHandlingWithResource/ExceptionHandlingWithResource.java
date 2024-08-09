package ExceptionHandlingWithResource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionHandlingWithResource {

        public static void main(String[] args) {
            File file = new File("src/ExceptionHandlingWithResource/input.txt");
            try{
                file.createNewFile();
                System.out.println("File created");
            }catch(IOException e){System.out.println(e);}

            try(BufferedReader reader = new BufferedReader(new FileReader("src/ExceptionHandlingWithResource/input.txt"))){
                String line;
                while((line= reader.readLine())!=null)
                    System.out.println(line);
            }catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }



