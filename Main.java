public class Main {
  public static void main(String[] args) {
      Papers papers = new Papers();
      papers.startPrinting();

      PrintingBehavior mahaba = () -> {
        int z=45;
          System.out.println("Just finished printing");
          //capturing variables
         // System.out.println("x= "+x+" is an instance variable");
          System.out.println("y= "+Papers.y+" is a static variable");
          System.out.println("z= "+z+" is a local variable");

      };

      mahaba.performPrinting();
  }
}