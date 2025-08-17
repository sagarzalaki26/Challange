package Day3;

public class Duplicate {

    public static int find(int[] arr) {
        int result=-1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                    return result;
                }
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
       int duplicate= find(arr);
       if(duplicate != -1){
        System.out.println(duplicate);
       }
       else{
        System.out.println("There is NO Duplicate");
       }

    }
}
