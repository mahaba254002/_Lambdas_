import java.util.Scanner;
public class Referencing {
  Scanner scanner = new Scanner(System.in);

  void calculator(int a, int b) {
      System.out.print("Enter value of a: ");
      a = scanner.nextInt();
      System.out.print("Enter value of b: ");
      b = scanner.nextInt();
      int sum = a + b;
      String sumString = Integer.toString(sum);
      System.out.println("Sum of a and b is: " + sumString);
  }
  static void SCI(int x, int y){
     x=34;
     y=45;
     int z=x+y;
     System.out.println("sum of x and y is: "+z);
  }

  public static void main(String[] args) {
      Referencing ref = new Referencing();
      ref.calculator(0, 0);

      MethodReferencing Mref = ref::calculator;
      Mref.calc(0, 0);

      MethodReferencing  staticRef=Referencing::SCI;
      staticRef.calc(0,0);

  }
}