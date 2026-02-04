//given an array of integer size n in one second you can increse the value of one element by 1 find the minimum
// time required to make all elements equal
//
//to minimize time and make all element equal to the maxixmum element of array
//step1  find the mamximum number in the array
//step 2 for every element calculate how much it needs to be increase to reach the mamimum
//step3  sum all those differences
public class calculate_time {
    public static void main(String[] args){
        int max=0;
        int time=0;
        int array []={2,3,5,1};
        for (int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];

            }
        }
        
        for(int i=0;i<array.length;i++){
            time=time+(max-array[i]);
        }
        System.out.println(time+" seconds");
    }
    
}
