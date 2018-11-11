import java.util.Scanner;
public class ganteng{

private static Scanner bil2;
private static Scanner bil1;
/**
 * @param args
 */
public static void main(String[] args) {
bil1 = new Scanner(System.in);
bil2 = new Scanner(System.in);
System.out.print("input angka ke 1:");
int i = bil1.nextInt();
System.out.print("input angka ke 2:");
int x = bil2.nextInt();
System.out.print("Bilangan Bulat :");
for (int q = i; q < x + 1; q++) {
System.out.print(q +" ");
}
System.out.println(" ");
System.out.print("Bilangan Genap : ");
for (int z = i; z < x + 1; z++) {
if(z%2==0){
System.out.print(z+ " ");
}
}
System.out.println(" ");
System.out.print("Bilangan Ganjil : ");
for (int j = i; j < x + 1; j++) {
if(j%2==1){
System.out.print(j+ " ");
}
}
System.out.println(" ");
System.out.print("Fibonaci : ");
int a = i;
int b = x – 1;
for (int k = 0; k != -1; k++) {
System.out.print(a+ " ");
a = a + b;
b = a – b;
if(a >= 100){
break;
}
}
System.out.println(" ");
System.out.print("Faktorial : ");
int z = x;
for (int p = x – 1; p > 0; p–) {
z = z * p;
}
System.out.print(z);
}
}