package util;

import beans.Student;
import main.Config;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentUtil {
    public static Student fillStudent(){
        String name=MenuUtil.requireName();
        String surname=MenuUtil.requireSurname();
        int age=MenuUtil.requireAge();
        String groupNumber=MenuUtil.requireGroupNumber();
        Student st=new Student(name,surname,age,groupNumber);
        return st;
    }

    public static  void printAllRegisterStudent() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.size(); i++) {
            Student student = Config.students.get(i);
            System.out.println((i + 1) + " " + student.getfullInfo());
        }
    }
        public static void registerStudent(){
        int count=InputUtil.requireNumber("How many will student be ? ");
        Config.students=new ArrayList<>(count);
        for (int i=0;i<count;i++){
            System.out.println((i+1)+ "Register");
              Config.students.stream().iterator()= (Iterator<Student>) StudentUtil.fillStudent();
        }
            System.out.println("registration is completed succesfully");
            StudentUtil.printAllRegisterStudent();
    }
}
