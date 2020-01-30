//Remove all occurrences of a particular element in an ArrayList
import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<Integer> test = new ArrayList<Integer>();
    test.add(1);
    test.add(2);
    test.add(2);
    test.add(3);
    test.add(4);
    for(int a = 0;a< test.size();a++){
      System.out.println(test.get(a)+" ");
    }
    System.out.println("Input a integer to take out a value");
    Scanner input2 = new Scanner(System.in);
    int search = input2.nextInt();
    for(int y: test){// for each loop
      if(test.get(y)==search){
        test.remove(y);
      }
    }
    for(int z = 0; z< test.size();z++){
      System.out.print(test.get(z)+" ");
    }
  }
}