package com.meghana;
import java.util.*;

public class Task {
    private String name;
    private String description;
    private String dueDate;


    Task(String addname, String adddes, String adddate) {
        this.name = addname;
        this.description = adddes;
        this.dueDate = adddate;
    }

    public static void main(String args[]) {
        ArrayList<Task> ar = new ArrayList<Task>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    String fn = sc.next();
                    String de = sc.next();
                    String dob = sc.next();
                    ar.add(new Task(fn, de, dob));
                    break;
                case 2:
                    for (Task obj : ar) {
                        System.out.println(obj.name);
                        System.out.println(obj.description);
                        System.out.println(obj.dueDate);
                    }

                    break;

                case 3:
                    String stri = sc.next();
                    int check = 0;
                    for (Task obj : ar) {
                        if (obj.name.equals(stri)) {
                            System.out.println(obj.name);
                            System.out.println(obj.description);
                            System.out.println(obj.dueDate);
                            check++;
                            break;

                        }
                    }
                    if (check == 0) {
                        System.out.println("not found");
                    }
                case 4:
                    int abc= sc.nextInt();

                            ar.remove(abc);
                    break;


            }

        }
    }
}
