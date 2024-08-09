package TryWithResource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TryWithResource {
    public static void processFiles(List<String> filePaths) {
            for(int i=0;i<filePaths.size();i++) {
                try (BufferedReader reader = new BufferedReader(new FileReader(filePaths.get(i)))) {
                    String line;
                    while((line=reader.readLine())!=null)
                        System.out.println(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void main(String[] args) {
            List<String> filePaths= new ArrayList<>();
            filePaths.add("src/TryWithResource/file1.txt");
            filePaths.add("src/TryWithResource/file2.txt");
            filePaths.add("src/TryWithResource/file3.txt");

            processFiles(filePaths);

        }
    }





