public class Demo {
    public static void main(String[] args) {

        int[] nums = {4,8,12,2,15};
 
        for (int i = 0;i < nums.length; i++) {
            System.out.println(i+ " ->" + nums[i]);
         }

         //for(int x : arr){
             //System.out.println(x);}

        nums[0]=90;
        System.out.println("changing the element in array... Now the frist element is " + nums[0]);
        System.out.println("Length of the Array is " +nums.length);
 
     }

}