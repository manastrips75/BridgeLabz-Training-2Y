public class grade {
   public static void main(String[] args){
       String Grade="c";
       switch(Grade) {
           case "A":
                System.out.println("Excellent");
                break;
           case "B":
                System.out.println("Good");
                break;
           case "C":
                System.out.println("Average");
                break;
           case "D":
                System.out.println("Pass");
                break;
           case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }  
  }   
}