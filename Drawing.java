public class Drawing {
  public static void main(String[] args) {
    Drawable dr=new Drawable() {  //with inner class
      public void draw(){
        System.out.println("Am drawing");
      }
    };
    dr.draw();

    Drawable dre=()->{
        System.out.println("Am drawing you "); //lambda
      
    };
    dre.draw();
  }
}
