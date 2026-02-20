```
import java.util.Scanner;
public class Calculator1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
int a = sc.nextInt();
System.out.print("Enter second number: ");
int b = sc.nextInt();
sc.close();
add(a,b);
sub(a,b);
mul(a,b);
div(a,b);
}
public static void add(int a,int b){
System.out.println("Addition: "+(a+b));
}

public static void sub(int a,int b){
System.out.println("Subtraction: "+(a-b));
}
public static void mul(int a,int b){
System.out.println("Multiplication: "+(a*b));
}
public static void div(int a,int b){
if(b==0)
System.out.println("Division not possible");
else
System.out.println("Division: "+(a/b));
}
}
```
<img width="164" height="79" alt="image" src="https://github.com/user-attachments/assets/7d70ba45-3b11-4e2d-86b4-9185a43a6ed2" />

