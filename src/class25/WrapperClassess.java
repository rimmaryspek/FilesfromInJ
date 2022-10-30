package class25;

public class WrapperClassess {
    public static void main(String[] args) {
        int num =10;
       // Integer wrappednum =Integer.valueOf(num);// called manual boxing converting from primitive to wrapper type
        // AutoBoxing automatically converted by java guys primitive to a wrapper type
        Integer wrappednum =num;
        System.out.println(wrappednum);
         // called unboxing is converting a wrapper type to a corresponding primitive type.
        //also called autoboxing.
        int num2=wrappednum;

    }
}
