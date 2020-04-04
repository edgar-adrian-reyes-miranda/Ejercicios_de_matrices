package prueba;
import java.util.Scanner;
public class ejemplo_2 {
    public static void main(String[] args) {
    Scanner comple = new Scanner(System.in);
          System.out.println("Ingres solo numeros");
     System.out.println("Ingrese un dato para la filas: ");
   int d, w=comple.nextInt();
    System.out.println("Ingrese otro dato para la columna: ");
    d=comple.nextInt();
char matriz[][] = new char [w][d];
int t,g;
    for ( t=0; t<matriz.length; t++){
        for ( g=0; g<matriz.length; g++){
            if (t==g || t+g==matriz.length-1){
                matriz[t][g] = 'x';
            } else{
                        matriz[t][g] = ' ';
                        }
                System.out.print(matriz[t][g]+"  ");
            }
            System.out.println(" ");
        }
    }
    
}

