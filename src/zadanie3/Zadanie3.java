/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author spetu
 */
//Создайте программу-тест для проверки знаний таблицы умножения.С помощью случайных чисел создайте 5 примеров.  
//При правильном ответе —на экране пишется Правильно зеленым цветом, при неправильном —Ошибка красным цветом.
//Также программа в зависимости от результата прохождения тест должна выставить оценку прохождения теста: если
//количество правильных ответов=5, то Молодец, 3 или 4, то Надо бы еще поучить, меньше 2 —Срочно нужно учить таблицу умножения.
public class Zadanie3 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello!");
        int tries = 0;
        int done = 0;
        int noDone = 0;
        while(tries <= 4) {
            Random random = new Random();
            int a = random.nextInt(11);
            int b = random.nextInt(11);
            if(a == 0){
                a += 1;
            }else if(b == 0) {
                b += 1;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("How much will?\t\t" + a + "*" + b + "=?");
            int answer = (a*b);
            int userAnswer = scanner.nextInt();
            if(answer == userAnswer){
                System.out.println(ANSI_GREEN + "Right. Well done." + ANSI_RESET);
                System.out.println("______________________________");
                done++;
            }else{
                System.out.println(ANSI_RED + "Not right." + ANSI_RESET);
                System.out.println("______________________________");
                noDone++;
            }
            tries++;
        }
        System.out.println(ANSI_GREEN + "Right answer -> " + done +  ANSI_RESET + ANSI_RED + "\tNot right -> " +noDone + ANSI_RESET);
        switch (done) {
            case 5:
                System.out.println("Good Job!");
                break;
            case 4:
            case 3:
                System.out.println("Should still teach!");
                break;
            default:
                System.out.println("It is urgent to learn the multiplication table!");
                break;
        }
//        if(done == 5) {
//            System.out.println("Good Job!");
//        }else if(done == 4 || done == 3){
//            System.out.println("Should still teach!");
//        }else{
//            System.out.println("It is urgent to learn the multiplication table!");
//        }
    }
}

// Изменение цвета строки
//public class Main {
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
//
//    public static void main(String[] args) {
//        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
//    }
//}