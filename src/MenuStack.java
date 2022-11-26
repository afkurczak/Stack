import java.util.Scanner;
import java.util.Stack;

public class MenuStack {
    public static void menuStack() {
        MyStack myStack = new MyStack();
        boolean stackMenuLoop = true;
        while (stackMenuLoop){

            System.out.println("1. Dodaj element na stos");
            System.out.println("2. Usuń górny element");
            System.out.println("3. Wyświetl górny element");
            System.out.println("4. Wyświetl wszystkie elementy");
            System.out.println("0. Wyjście");

            Scanner scanner = new Scanner(System.in);
            int MenuStackChoice = scanner.nextInt();

            switch (MenuStackChoice) {
                case 1: {
                    Stack stack = new Stack<>();
                    Scanner scanner1 = new Scanner(System.in);
                    String newData = scanner1.nextLine();
                    myStack.push(newData);
                    break;
                }
                case 2 : {myStack.pop(); break;}
                case 3 : {myStack.peek(); break;}
                case 4 : {myStack.allStack(); break;}
                case 0 : {stackMenuLoop = false; break;}
            }
        }
    }
}



