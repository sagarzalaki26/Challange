package Day2;

public class MissingNo {

    public static int find(int []arr){
        int n=arr.length;
        int totalsum=(n+1)*(n+2)/2;
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
             sum=sum + arr[i];
        }

        int result=totalsum-sum;
       return result;
    }

    public static void main(String[] args) {
        int [] arr={1,2,4,5,6};

        System.out.println(find(arr)); 
    }
    
}
