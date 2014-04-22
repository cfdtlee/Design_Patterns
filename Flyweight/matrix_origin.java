/*************************************************************************
	> @File Name: matrix_origin.java
	> @Author: 李爽 13111247
	> @Mail: cfdtlee@gmail.com 
	> @Created Time: Thu 06 Mar 2014 10:10:02 PM CST
 ************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Man //人的抽象类
{
    String Name;        //姓名
    String Apperience;  //长相
    String Thought;     //思维

    String Action;      //行为
    String Emotion;     //喜怒哀乐
    String Organ;       //身体器官
    public Man(String name, String apperience, String thought, String action, String emotion, String organ)
    {
        Name = name;
        Apperience = apperience;
        Thought = thought;
        Action = action;
        Emotion = emotion;
        Organ = organ;
    }
}


public class client
{
    public static void main(String[] args)
    {
        int population = 0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入"); 
        for (int i = 0; i < 20000; i++)
        {
            Man man = new Man("test", "ugly", "idiot", "吃喝拉撒睡", "喜怒哀乐", "七大器官");
            //
        }
        String a=br.readLine();

    }
}


