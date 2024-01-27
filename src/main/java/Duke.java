import java.util.Scanner;
public class Duke {
    public static void main(String[] args) {
        Task taskList = new Task();
        String line;
        Scanner in = new Scanner(System.in);
        boolean userSaidBye = false;
        System.out.println("    ____________________________________________________________");
        System.out.println("    Hello! I'm PoratoBot");
        System.out.println("    How can I assist you mortal?");
        System.out.println("    ____________________________________________________________");
        while (!userSaidBye) {
            line = in.nextLine();
            if (line.equals("bye")) {
                userSaidBye = true;
            } else if(line.equals("list")) {
                System.out.println("    ____________________________________________________________");
                taskList.listTasks();
                System.out.println("    ____________________________________________________________");
            } else {
                taskList.addTask(line);
                System.out.println("    ____________________________________________________________");
                System.out.println("    " + " added: " + line);
                System.out.println("    ____________________________________________________________");
            }
        }
        System.out.println("     Bye. Hope to see you again soon!");
        System.out.println("    ____________________________________________________________");
    }
}

