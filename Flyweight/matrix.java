/*************************************************************************
	> @File Name: matrix.java
	> @Author: 李爽 13111247
	> @Mail: cfdtlee@gmail.com 
	> @Created Time: Thu 06 Mar 2014 10:10:02 PM CST
 ************************************************************************/

import java.util.ArrayList;
import java.util.List;


public class info_of_man
{

}

abstract class Man //
{
    public abstract void
}

public class client
{
    public static void main(String[] args)
    {
        Man_factory man_factory = new Man_factory()
    }
}






class Student{
    Student(){
        System.out.println("Error, no para!");
    }
    Student(String num, String cou)
    {
        how_many_course = 1;
        how_many_book = 1;
        ID = num;
        Course cou1 = new Course(cou);
        courses.add(cou);
    }
    Student(String num, String cou1, String cou2)
    {
        how_many_course = 2;
        how_many_book = 2;
        ID = num;
        Course cou11 = new Course(cou1);
        Course cou22 = new Course(cou2);
        courses.add(cou1);courses.add(cou2);
    }
    void print()
    {
        System.out.print(ID+" choose "+courses.get(0));
        for(int i = 1; i < courses.size(); ++i)
        {
            System.out.print(" and " + courses.get(i));
        }
        System.out.print("\n");
    }
    int how_many_book;
    int how_many_course;
    String ID;
    List courses = new ArrayList();
    List cou_list = new ArrayList();
    List book_list = new ArrayList();
}

class Course{
    Course(){};
    Course(String course_name){
        name = course_name;
    }
    String name;
}

class Book{
    Book(){};
    Book(String book_name){
        name = book_name;
    }
    String name;
}
