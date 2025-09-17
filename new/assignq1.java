import java.util.*;
public class assignq1{
    public static void main(String[] args){
        int[] student= new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of 10");
        for(int i=0;i < student.length ;i++){
             System.out.println("enter stu"+(i+1)+"Age");
             student[i] = sc.nextInt();
        }
       
        for(int Age : student){
           if(Age < 0){
              System.out.println("Invalid Age");
           }else if(Age <= 18){
              System.out.println("student Cannot vote");
           }else{
              System.out.println("student can vote");
           }
   }
  }
}