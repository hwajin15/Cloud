package array;

public class twoArray {
    public static void main(String[] args) {

        int [][] arr =new int[2][3];
        int [][] arr1  ={{1,2,3},{4,5,6}};
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//        System.out.println(arr[1].length);
//
        for (int i =0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
