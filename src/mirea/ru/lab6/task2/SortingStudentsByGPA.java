package mirea.ru.lab6.task2;
import mirea.ru.lab6.task2.*;

public class SortingStudentsByGPA{
    examStudent[] student = new examStudent[10];
    SortingStudentsByGPA(){
        for(int i=0;i<10;i++){
            student[i] = new examStudent(i);
        }


        for(int i=0;i<10;i++){
            System.out.println(student[i].examScore);
        }


    }





}
