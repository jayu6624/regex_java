import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class lexeme {
    public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\Administrator\\Downloads\\complier-main\\src\\test.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        // read a line from program
        String data = myReader.nextLine();
        // seperate lexems from the line
        String lexems[] = data.split("[ \\n\\t,(){}=+\\-;]");
        
        //System.out.println("Reading a line" + data);
        System.out.println("Lexemes are " + Arrays.toString(lexems));
        // check the token
        for (String lexem : lexems) {
          //identifier
           if(lexem.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$")){
                System.out.println(lexem + " is numbers");
            }else if(lexem.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?\\.$")){
                System.out.println(lexem.substring(0,lexem.length()-1)+" is number");
            }
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}