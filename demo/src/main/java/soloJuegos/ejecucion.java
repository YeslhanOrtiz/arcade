package soloJuegos;

import java.util.*;

public class ejecucion {

    public static void main(String[] args) {
        int opc=0;

        Scanner sc = new Scanner(System.in);

        caraSello car = new caraSello();
        losMillonarios lms = new losMillonarios();
        piedraTijera ptj = new piedraTijera();

        System.out.println();
        System.out.println("Ingrese la opción del juego al cual quiere entrar\n1. cara y sello\n2. Quien quiere ser millonario\n3. Piedra - Papel - Tijeras");
        opc = sc.nextInt();

        switch(opc){
            
            case 1:

                car.juego();

                break;

            case 2:

                lms.juego();

                break;

            case 3:

                ptj.juego();

                break;

            default:
            System.out.println("Valor incorrecto\nIngrese un valor que esté permitido para el próximo intento");
                break;

        }
        sc.close();
    }
    
}
