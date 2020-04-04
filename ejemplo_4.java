package prueba;
import java.util.Scanner;
public class ejemplo_4 {
    public static void main(String[] args) {
        Scanner ejemplo4 = new Scanner(System.in);
        
        System.out.println("Ingrese cuanras filas quiere: ");
        int f, z=ejemplo4.nextInt();
        System.out.println("Ingrese cuentas columnas quiere: ");
  f = ejemplo4.nextInt();
    String matriz [][]= new String [z][f];
   int c,b;
    for(c=0;c<z;c++){
            for(b=0;b<f;b++){
               matriz[c][b]=" W ";   }}
    for(c=0;c<z;c++){ for(b=0;b<f;b++){
                if((c==0) && (b>0) && (b<6)){
                    matriz[c][b]="1"; }
                if((c==1) && (b>1) && (b<5)){
                    matriz[c][b]="1";  }
                if((c==2) && (b>2) && (b<4)){
                    matriz[c][b]="1";   } }
        }for(c=0;c<z;c++){
            for(b=0;b<f;b++){
                if((c==6) && (b>0) && (b<6)){
                    matriz[c][b]="3"; }
                if((c==5) && (b>1) && (b<5)){
                    matriz[c][b]="3"; }
                if((c==4) && (b>2) && (b<4)){
                    matriz[c][b]="3";}}
        } for(c=0;c<z;c++){
            for(b=0;b<f;b++){
                if((c==6) && (b>0) && (b<6)){
                    matriz[c][b]="2"; }
                if((b==5) && (c>1) && (c<5)){
                    matriz[c][b]="2"; }
                if((b==4) && (c>2) && (c<4)){
                    matriz[c][b]="2"; }}
        } for(c=0;c<z;c++){
            for(b=0;b<f;b++){
                if((b==0) && (c>0) && (c<6)){
                    matriz[c][b]="4"; }
                if((b==1) && (c>1) && (c<5)){
                    matriz[c][b]="4";  }
                if((b==2) && (c>2) && (c<4)){
                    matriz[c][b]="4"; } }
        } for(c=0;c<z;c++){
            for(b=0;b<f;b++){
                if(c==b){
                    matriz[c][b]="0";}
                if((c+b)==(z-1)){
                    matriz[c][b]="0";} }
        } for(c=0; c<z;c++){
        for(b=0;b<f;b++){
          System.out.print(" [ " + matriz[c][b] + "  ] ");
        } System.out.println();
     }
    }
}
