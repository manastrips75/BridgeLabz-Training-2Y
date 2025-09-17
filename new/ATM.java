public class ATM {
    public static void main(String[] args) {
        int[] arr = {2000, -500, 1000, -200, -700}

        for(int i=0;i<=arr.length;i++){
           if (arr[i]<0){
              System.out.println("Withdraw");
           }else if(arr[i]>0){
              System.out.println("Deposite");
           }else 
              System.out.println("Overdraft!")
        int finalbalance=