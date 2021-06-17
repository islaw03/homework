
package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();


    public static void main(String[] args) {


        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Введите имя " + (i + 1) + "-го студента: ");
            students[i].name = sc.nextLine();
            if (i != 0)
                sc.nextLine();
            System.out.print("Введите фамилию " + (i + 1) + "-го студента: ");
            students[i].surName = sc.nextLine();
            System.out.print("Введите дату рождения " + (i + 1) + "-го студента: ");
            students[i].faculty = sc.nextLine();

        }
        for (int i = 0; i < students.length; i++) {
            System.out.println("Имя студента №" + (i + 1) + ": " + students[i].name);
            System.out.println("Фамилия студента №" + (i + 1) + ": " + students[i].surName);
            System.out.println("Факультет студента №" + (i + 1) + ": " + students[i].faculty);
            System.out.println("Контракт студента №" + (i + 1) + ": " + students[i].contract);
        }
              /* 1) Парадигма ООП - это метод программирования, когда в коде
              представляешь все как объект (числа, переменные)Ф
           2) Классы в JAVA это пользовательский тип данных, на основе
              которых описывается объект
           3) Свойства класса это абстрактное представление оюъекта с помощью
              переменных, или других объектов (агрегация, композиция)
           4) Название_класса Переменная_класса(объект) = new Название_класса();
           5) class animal {
                  String name; это свойства класса, которое будет хранить в себе
                                   имя определенного объекта животного
              }
           6) Объект.Свойства_объекта = его тип данных (String " ", int 1,2,3)
           7) System.out.print(Объект.Свойства_Объекта);


           П.С у меня чутка не было времени вот поэтому опоздал

         */
    }
}


