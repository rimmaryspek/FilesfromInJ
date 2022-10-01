package Class14;

public class HomeWork7 {
    //Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F

    void getGrade(int num){
        if (num>=90 && num==100){
            System.out.println("Grade is A");
        } else if (num>=80 && num<=89) {
            System.out.println("Grade is B");
        }else if (num>=70 && num<=79){
            System.out.println("Grade is C");
        }else if (num>=50 && num<=59){
            System.out.println("Grade is D");
        }else{
            System.out.println("invalid grade");
        }
    }
    public static void main(String[] args) {
        HomeWork7 gr=new HomeWork7();
        gr.getGrade(100);
    }

}
