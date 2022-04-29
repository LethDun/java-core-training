package com.ec.oop.exercises.problem13;

import com.ec.oop.exercises.problem13.entity.Employee;
import com.ec.oop.exercises.problem13.entity.Experience;
import com.ec.oop.exercises.problem13.entity.Fresher;
import com.ec.oop.exercises.problem13.service.AppManager;
import com.ec.oop.exercises.problem13.service.EmployeeManager;
import java.util.Scanner;

public class DemoApp {

    public static void main(String[] args) {

       AppManager appManager = new AppManager();

       while(true) {
           System.out.println("MENU:");
           System.out.println("1. Add");
           System.out.println("2. Delete");
           System.out.println("3. Update");
           System.out.println("4. Show Info");
           System.out.println("5. Find by ID");
           System.out.println("6. Exit");

           int i = new Scanner(System.in).nextInt();

           switch(i) {
               case 1: {
                   appManager.insertEmployeeByType();
                   break;
               }
               case 2: {
                   appManager.delete();
                   break;
               }
               case 3: {
                   appManager.update();
                   break;
               }
               case 4: {
                   appManager.showAll();
                   break;
               }
               case 5: {
                   System.out.println("Find by ID:");
                   String id = new Scanner(System.in).nextLine();
                   System.out.println(appManager.findByIdApp(id));
                   break;
               }
               case 6: {
                   System.err.println("Bye!");
                   return;
               }
               default: {
                   System.out.println("Wrong number");
                   break;
               }
           }
       }

    }
}
