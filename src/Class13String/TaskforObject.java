package Class13String;

public class TaskforObject {

    public static void main(String[] args) {
        String name="Welcome to the java class";

        String[] arr = name.split(" ");

        for (int k = 0; k < arr.length; k++) {
            for (int m = arr[k].length() - 1; m >= 0; m--) {
                System.out.print(arr[k].charAt(m));
            }
            System.out.print(" ");
        }
    }    //      0     1   2      3   4
// array= {Welcome, to, the, java, class};---k
    //          w e l c o m e
//           0 1 2 3 4 5 6 --> m

//    k[o] -- welcome
//    m[6]-- e
//    m[5] --m
//    m[4]-- o
//    m[3] --c
    }



