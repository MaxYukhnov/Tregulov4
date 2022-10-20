public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double gradeMaths;
    double gradeEnglish;
    double gradeEconomic;

    }

class StudentTest{
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Vasya";
        st1.surname = "Ivanov";
        st1.gradeEnglish = 3;
        st1.gradeEconomic = 4;
        st1.gradeMaths = 2;
        //double averageGrade1  = (student1.gradeEconomic + student1.gradeEnglish + student1.gradeMaths) / 3;
       // System.out.println(averageGrade1);

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Misha";
        st2.surname = "Petrov";
        st2.gradeEnglish = 5;
        st2.gradeEconomic = 7;
        st2.gradeMaths = 2;

        Student st3 = new Student();
        st3.studentId = 1;
        st3.name = "Vasya";
        st3.surname = "Ivanov";
        st3.gradeEnglish = 8;
        st3.gradeEconomic = 2;
        st3.gradeMaths = 9;

        System.out.println("Average grade of student " + st1.name + st1.surname + " = " + (st1.gradeEconomic + st1.gradeEnglish + st1.gradeMaths) / 3);

        System.out.println("Average grade of student " + st2.name + st2.surname + " = " + (st2.gradeEconomic + st2.gradeEnglish + st2.gradeMaths) / 3);

        System.out.println("Average grade of student " + st3.name + st3.surname + " = " + (st3.gradeEconomic + st3.gradeEnglish + st3.gradeMaths) / 3);





    }
}
