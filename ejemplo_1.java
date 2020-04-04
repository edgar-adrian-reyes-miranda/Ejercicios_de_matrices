package prueba;
import java.util.Scanner;

public class ejemplo_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
         boolean numer = false;
             int d,m;
do{

    System.out.println("Ingrese cuantas columnas quiers: ");
    d=entrada.nextInt();
    System.out.println("Ingrese  cuantas filas quires: ");
    m=entrada.nextInt();
 
    if (d%2 !=0 && m%2 !=0){
        numer=true;
       }else{
       System.out.println("Por favor ingrese un numero impar");
    }    
} while(!numer);
        int i;
char matriz[][] = new char [d][m];
for (i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if ((i==0) || (i== matriz.length-1)||(j==0)||(j==matriz.length-1)){
                matriz[i][j] = 'Y';
            }
                else{
                        matriz[i][j] = ' ';
                        }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }          
    }  
}
    

