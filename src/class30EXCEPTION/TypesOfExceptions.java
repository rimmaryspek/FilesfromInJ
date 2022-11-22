package class30EXCEPTION;

public class TypesOfExceptions {
    public static void main(String[] args) {
        String name= null;
        if (name!=null){// one of the way to fix the errors simple use If statements
            System.out.println(name.length());
        }
       int [] arr =new int[5];
        int index=10;
        try{// thying try and catch block
            System.out.println(arr[index]);
        }catch (Exception e){
            System.out.println("the issue was fixed");
        }
        if (index<arr.length){// trying to use
            System.out.println(arr[index]);
        }
    }
}
