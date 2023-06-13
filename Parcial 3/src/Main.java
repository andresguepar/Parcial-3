import Model.Asig;
import Rep.Imp;
import Rep.Int;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.stream.Collectors;


public class Main{

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        String opt = "1";
        Int repo = new Imp();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Menu =^._.^=  \n 1. Add  \n 2. List \n 3. Edit " +
                    "\n 4. Delete  \n 5. Search  \n 6. Exit \n =>");
            opt = sc.next();
            switch (opt){
                case "1":
                    System.out.println("Id ");
                    int ln = sc.nextInt();
                    System.out.println("Subjetc:  ");
                    String sub = sc.next();
                    System.out.println("Teacher:  ");
                    String te = sc.next();
                    System.out.println("Classroom:   ");
                    String cl = sc.next();
                    System.out.println("Students Number ");
                    int sn = sc.nextInt();
                    repo.save(new Asig(ln,sub,te,cl,sn));
                    break;

                case "2": {
                    List<Asig> locals = repo.findAll();
                    locals.forEach(System.out::println);
                    break;
                }

                case "3": {
                    System.out.println("----Edit----");
                    System.out.println("Type Id: ");
                    Integer lnn = sc.nextInt();
                    System.out.println("Type Subjetc::  ");
                    sub = sc.next();
                    System.out.println("Type Teacher:  ");
                    te = sc.next();
                    System.out.println("Classroom:   ");
                    cl = sc.next();
                    System.out.println("Students Number: ");
                    Integer st = sc.nextInt();
                    Asig upd = new Asig(lnn,sub,te,cl,st);
                    repo.update(upd);
                    break;

                }

                case "4": {
                    System.out.println("===== Delete ======");
                    System.out.print("Type Id: ");
                    int lp = sc.nextInt();
                    repo.delete(repo.findByNum(lp));
                    break;
                }

                case "5": {
                    System.out.println("===== Search ======");
                    System.out.print("Type Id: ");
                    Integer lp = sc.nextInt();
                    System.out.println(repo.findByNum(lp));
                    break;
                }
                
                case "6": {
                    opt = "6";
                    break;
                }

            }
        }while (opt != "6");
    }
    }
