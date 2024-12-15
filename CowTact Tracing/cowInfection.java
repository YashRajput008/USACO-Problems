import java.io.*;
import java.util.*;

public class cowInfection{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int numberOfCows = Integer.parseInt(br.readLine());
    String cowStatus = br.readLine();

    char[] arrayCowStatus = new char[numberOfCows];
    cowStatus.getChars(0,numberOfCows, arrayCowStatus, 0);
    List listCowStatus = Arrays.asList(arrayCowStatus);

    System.out.println(listCowStatus);
    br.close();
  }
}
