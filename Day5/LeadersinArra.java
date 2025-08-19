package Day5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersinArra {
    public static List<Integer> leader(int []arr) {
        
       List<Integer> lead=new ArrayList<>();
        int n=arr.length;

        int max=arr[n-1];
        lead.add(max);

        for(int i=n-2;i>=0;i--){
            if(arr[i] > max){
                lead.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(lead);
        return lead;

    }


    public static void main(String[] args) {
        int []arr={12,13,9,3,4,2};

        
        System.out.println(leader(arr));
    }
    
}
