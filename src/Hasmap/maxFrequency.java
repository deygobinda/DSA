package Hasmap;
import  java.util.*;

public class maxFrequency {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,2,1,35,4,3,4,5,13,4,33,1};
        Map<Integer , Integer> frq = new HashMap<>();
        for (int i : arr){
            if (frq.containsKey(i)){
                frq.put(i,frq.get(i)+1);
            }else {
                frq.put(i,1);
            }
        }
        int maxfrq = 0 , ansKey = -1;
        for(var e : frq.entrySet()){
            if (e.getValue() > maxfrq) {
                maxfrq = e.getValue();
                ansKey = e.getKey();
            }
        }


        System.out.println("The maximum frequency is "+maxfrq+ " and key is "+ ansKey);
    }
}
