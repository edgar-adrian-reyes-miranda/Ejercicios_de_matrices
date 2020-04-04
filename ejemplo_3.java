package prueba;
import java.util.Scanner;
public class ejemplo_3 {
          public static void main(String[] args) {
           Scanner ejemplo= new Scanner(System.in);
     System.out.println("Ingrese cuntas filas : ");
  int r, o = ejemplo.nextInt();
    System.out.println("Ingresa cuantas columnas: ");
   r=ejemplo.nextInt();
char matriz[][] = new char [o][r];
 int y,n;
    for ( y=0; y<matriz.length; y++){
        for (n=0; n<matriz.length; n++){
            if (y+n<matriz.length-1 || y+n>matriz.length-1){
                matriz[y][n] = 'H';}
            else{ matriz[y][n] = ' ';}
                System.out.print(matriz[y][n]+" ");
        }System.out.println("");
        }
    }
}

