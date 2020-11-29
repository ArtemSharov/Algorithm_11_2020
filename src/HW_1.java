import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class HW_1 {
    public static void main(String[] args) {
        File fileInput = new File("src//input.txt");
        File fileOutput = new File("src//output.txt");
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        try(FileReader reader = new FileReader(fileInput))
        {
            int c;
            int i = 0;
            while((c=reader.read())!=-1){
                sb.insert(i, (char)c);
                ++i;
            }
            String[] buf = sb.toString().split(" ");
            int[] intBuf = new int[buf.length];
            for (int j = 0; j < buf.length; j++) {
                intBuf[j] = Integer.parseInt(buf[j]);
                sum+=intBuf[j];
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter(fileOutput)) {
            writer.write(Integer.toString(sum));
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
