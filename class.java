import java.util.Scanner;
class employee 
{
int salary;
int YOJ;
String name;
String address;
}

public class Main{
public static void main(String args[]) {

Scanner gc = new Scanner(System.in);
System.out.print("no of employee ");
int n = gc.nextInt();
employee emp[] = new employee[n];
for (int i = 0; i < n; i++)
{
emp[i] = new employee();
System.out.println("\nEnter " + (i + 1) + " Employee data :");
System.out.print("Enter employee year of joining :");
emp[i].YOJ = gc.nextInt();
System.out.print("Enter employee name :");
emp[i].name = gc.next();
System.out.print("Enter employee address :");
emp[i].address = gc.next();
System.out.print("Enter employee salary :");
emp[i].salary = gc.nextInt();
}
            
System.out.println("\n Employee Details :\n");
System.out.println("Name, Year of joining, Address, salary:");
for (int i = 0; i < n; i++) 
{
System.out.println(  emp[i].name + " " + emp[i].YOJ + " " + emp[i].address + " " + emp[i].salary);
}
}
}
