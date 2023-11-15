package Q06;
/*6) Considerando as classes abaixo, para cada chamada ao método doisValores(),
teste o programa e identifique que forma do método será chamada para cada execução do método abaixo no código.*/

public class Soma {
 public int doisValores(int a, int b)
 {
     System.out.println("M1");
     return a + b;
 }
 public double doisValores(double a, int b)
 {
     System.out.println("M2");
     return a + b;
 }
 public double doisValores(double a, double b)
 {
     System.out.println("M3");
     return a + b;
 }
}
