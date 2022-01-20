import java.util.Scanner;

class Employee {
    int year;
    String name;
    String address;

}

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many employee:");
        int k = sc.nextInt();

        Employee emp[] = new Employee[k];
        System.out.print("Name     Year of joining   Address ");
        for (int i = 0; i < k; i++) {
        emp[i] = new Employee();
        System.out.println("Enter name:");
        emp[i].name= sc.next();
        System.out.println("Enter year of joining");
        emp[i].year = sc.nextInt();
        System.out.println("Enter Address:");
        emp[i].address= sc.next()

        }
        for (int i = 0; i < k; i++) {
            System.out.print("Name     Year of joining   Address "+emp[i].name   +emp[i].year      +emp[i].address);
        }
    }

}
