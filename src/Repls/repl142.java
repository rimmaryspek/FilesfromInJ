package Repls;

public class repl142 {
    static String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    repl142(String schoolName,int batch,int year){

    }

    repl142(){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }

    void display (){
        System.out.println("schoolName" + schoolName + " batch " + batch+ "year " + year+ " lastDayOfClass " + lastDayOfClass);
    }

        public static void main(String [] args){
          repl142 mn= new repl142();
            mn.display();


        }

    }



