import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try   {
                BufferedReader reader1 = new BufferedReader(new FileReader("test.txt"));

                ArrayList<String> strings = new ArrayList<>();
                String line;
                while ((line = reader1.readLine()) != null){
                    strings.add(line);
                }
                reader1.close();

                String[] array = strings.toArray(new String[strings.size()]);
                Arrays.sort(array);
                for (String s:array){
                    System.out.println(s);
                }

        }
        catch (FileNotFoundException ex){

        }
        catch (IOException ex){

        }
        return;
    }
}
