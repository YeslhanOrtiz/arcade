package soloJuegos;
import java.util.*;

public class losMillonarios extends arcade{

    private int opMen, opAns, pts;

    public losMillonarios(){}

    public losMillonarios(int opMen,int opAns,int pts){

        this.opMen = opMen;
        this.opAns = opAns;
        this.pts = pts;

    }

    public int getOpMen() {
        return opMen;
    }


    public void setOpMen(int opMen) {
        this.opMen = opMen;
    }


    public int getOpAns() {
        return opAns;
    }


    public void setOpAns(int opAns) {
        this.opAns = opAns;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }


    public void juego(){

        pts = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a quien quiere ser millonario SENA");
        System.out.println("\n-------------------------------------------");
        System.out.println("\n--------- El juego consta de un total de cinco preguntas con tres opciones de repuesta\n--------- Si gana tiene la posibilidad de repetir el juego\n--------- Si pierde no tendrá opción de volver a intentar");
        System.out.println("\n-------------------------------------------");

        do {
            System.out.println("1. Qué es lo primero que se tiene que crear en una clase antes de empezar con la codificación");
            System.out.println("1. El package\n2. El método main\n 3. Los imports de las diferentes librerias");
            opAns = sc.nextInt();

            if (opAns == 2) {

                pts = pts + 20;
                System.out.println("----------------------------\nFelicidades has pasado la primera pregunta + 20 puntos\n------------------------------");
                System.out.println("Usted tiene actualmente " + pts +" puntos");
                System.out.println("2. Cuál es la librería que se debe importar para hacer uso del método scanner?");
                System.out.println("1. java.util.Scanner\n2. java.util.*\n3. java.*");
                opAns = sc.nextInt();

                    if (opAns == 1)
                {
                    pts = pts + 30;
                    System.out.println("----------------------------\nFelicidades has pasado la segunda pregunta + 30 puntos\n------------------------------");
                    System.out.println("Usted tiene actualmente " + pts +" puntos");
                    System.out.println("3. Cuál es la estrutura para hacer un arreglo?");
                    System.out.println("1. string nnn = next.int\n2. String nn = String\n3. String [] nnn = {y,y,y};");
                    opAns = sc.nextInt();
                        if (opAns == 3)
                    {
                        pts = pts + 50;
                        System.out.println("Usted terminó con " + pts +" puntos");
                        System.out.println("Más 50 puntos\nYa que usted ganó tiene la posibilidad de jugar otra vez\n1. si\n2.no");
                        
                        
                    }else{
                        System.out.println("-------------------------\nYa que usted perdió será expulsado del juego y no tendrá opción de volver a repetirlo\nBuena suerte para la proxima");
                        
                    }
                }else {
                    System.out.println("-------------------------\nYa que usted perdió será expulsado del juego y no tendrá opción de volver a repetirlo\nBuena suerte para la proxima");
                    
                }
                
            } else {
                System.out.println("-------------------------\nYa que usted perdió será expulsado del juego y no tendrá opción de volver a repetirlo\nBuena suerte para la proxima");
                
            }
            
            opMen = sc.nextInt();

        } while (opMen != 2);
            
        sc.close();

    }
    
}
