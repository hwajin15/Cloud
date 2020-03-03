package array;

public class array1 {
    public static void main(String[] args) {
        char [] alpa = new char[26];
        char ch = 'A';
        for (int i = 0; i<alpa.length; i++){
            alpa[i] =ch++;
        }

        for (int i =0; i<alpa.length; i++){
            System.out.println(alpa[i]+","+(int)alpa[i]);
        }
    }
}
