import java.util.*;

public class candyCows {
  public static void main(String[] args) {
    ArrayList<Integer> cowHeight = new ArrayList<>();
    ArrayList<Integer> candyHeight = new ArrayList<>();

    int cows = askInput("Cow", 0, cowHeight);
    int candies = askInput("Candy", 0, candyHeight);


    // Running Program 
    for (int i = 0; i < cows; i++) {

      System.out.println("Cow " + (i+1) + " begins to eat the candy");
      int remainingCandyHeight=candyHeight.get(0);

      if (remainingCandyHeight < cowHeight.get(i)){
        for (int j = 0; j < candies; j++) {
          amountToBeDeducted = cowHeight.get(i) - candyHeight.get(j);
          remainingCandyHeight = remainingCandyHeight - amountToBeDeducted;
          remainingCandyHeight = Math.max(0, remainingCandyHeight);
          candyHeight.set(j, remainingCandyHeight);
          cowHeight.get(i) = cowHeight.get(i) + amountToBeDeducted;
        }
      } else {
        if (i == 0){
          if (remainingCandyHeight > cowHeight.get(i)){
            for (int j = 0; j < candies; j++) {
              remainingCandyHeight = candyHeight.get(j) - cowHeight.get(i);
              remainingCandyHeight = Math.max(0,remainingCandyHeight);
              candyHeight.set(j, remainingCandyHeight);

              cowHeight.get(i) = cowHeight.get(i) + Math.abs();

              System.out.println("Candy # " + (j+1) + " is now " + candyHeight.get(j));
            }
          } else {
            continue;
          }
        } else {
          continue;   
        }
      }
    }
    System.out.println(cowHeight);
    System.out.println(candyHeight);
  }
  public static int askInput(String name, int varName,  ArrayList<Integer> arrayName){
    System.out.print("Please Input # of " + name + " : ");
    Scanner sc = new Scanner(System.in);
    varName = sc.nextInt();

    for (int i = 0; i < varName; i++) { 
      System.out.print("Please Input Height of " + name +" #" + (i+1) + ": ");
      int height = sc.nextInt();
      arrayName.add(height); 
    }

    System.out.println(arrayName);
    return varName;
  }
}
