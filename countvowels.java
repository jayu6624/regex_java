import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class countvowels {
    public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\Administrator\\Downloads\\complier-main\\src\\text.txt");
      Scanner myReader = new Scanner(myObj);
      int cntv = 0;
      int cntc = 0;
      myReader.close();
      
      myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        // read a line from program
        String data = myReader.nextLine();

        for (int i=0;i<data.length();i++) {
          // Lexem it is an identifier
          ///System.out.println("Matching " + data.substring(i,i+1));
            if(data.substring(i,i+1).matches("[aeiouAEIOU]{0,9}")){
                cntv++;
            } else if(data.substring(i,i+1).matches("[b-d]|[f-h][j-n]|[p-t]|[v-z]|[B-D]|[F-H]|[J-N]|[P-T]|[V-Z]")){
                cntc++;
            }
        }
      }
      System.out.println("vowels = "+cntv);
      System.out.println("constants = "+cntc);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }   
}
