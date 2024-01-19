public class Main {
  public static void main(String[] args) {
      Papers papers = new Papers();
      papers.startPrinting();

      PrintingBehavior mahaba = () -> {
          System.out.println("Just finished printing");
      };

      mahaba.performPrinting();
  }
}