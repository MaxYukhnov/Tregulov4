public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double gradeMaths;
    double gradeEnglish;

    double gradeEconomic;

  //  double summa(double gradeEconomic, double gradeEnglish, double gradeMaths) {
   //     double result = (gradeEconomic + gradeEnglish + gradeMaths) / 3;
    //    return result;
   // }



}

class StudentTest {
    double srednyaOtsenka(Student st){
        double sredOtsenka = (st.gradeEconomic + st.gradeEnglish + st.gradeMaths) / 3;
        System.out.println("Average grade of " + st.name + st.surname + sredOtsenka);
        return sredOtsenka;
    }



    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Vasya";
        st1.surname = "Ivanov";
        st1.gradeEnglish = 3;
        st1.gradeEconomic = 4;
        st1.gradeMaths = 2;
       // double averageGrade = st1.summa(3,4,2);
        //.out.println(st1.name + st1.surname + " average grade " + averageGrade);

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Misha";
        st2.surname = "Petrov";
        st2.gradeEnglish = 5;
        st2.gradeEconomic = 7;
        st2.gradeMaths = 2;

        //System.out.println(st2.name + st2.surname + " average grade " + st2.summa(5,7,2));

       Student st3 = new Student();
       st3.studentId = 1;
       st3.name = "Vasya";
       st3.surname = "Ivanov";
       st3.gradeEnglish = 8;
       st3.gradeEconomic = 2;
       st3.gradeMaths = 9;

       StudentTest stTest = new StudentTest();
       stTest.srednyaOtsenka(st1);
       stTest.srednyaOtsenka(st2);
       stTest.srednyaOtsenka(st3);


        //System.out.println(st3.name + st3.surname + " average grade " + st3.summa(8,2,9));


/*
        System.out.println("Average grade of student " + st1.name + st1.surname + " = " + (st1.gradeEconomic + st1.gradeEnglish + st1.gradeMaths) / 3);

        System.out.println("Average grade of student " + st2.name + st2.surname + " = " + (st2.gradeEconomic + st2.gradeEnglish + st2.gradeMaths) / 3);

        System.out.println("Average grade of student " + st3.name + st3.surname + " = " + (st3.gradeEconomic + st3.gradeEnglish + st3.gradeMaths) / 3);
*/
    }




}

