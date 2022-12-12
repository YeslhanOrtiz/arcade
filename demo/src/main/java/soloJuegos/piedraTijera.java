package soloJuegos;
import java.util.*;

public class piedraTijera extends arcade{

    private int player;

    public piedraTijera(){}

    public piedraTijera(int player){

        this.player = player;

    }

    public int getPlayer() {
        return player;
    }



    public void setPlayer(int player) {
        this.player = player;
    }



    public void juego(){

        player=0;
        Scanner sc = new Scanner(System.in);

        int maquina = (int)(Math.random()*3+1);
        System.out.println("Escoja \n1.Piedra\n2.Papel\n3.Tijera");
        player = sc.nextInt();
        System.out.println("\n-------------------------------------------\n");
        
        if(player == 1){
            System.out.println("Usted ha elejido Piedra");
        }else if(player == 2){
            System.out.println("Usted ha elejido Papel");
        }else{
            System.out.println("Usted ha elejido Tijera");
        }

        System.out.println("\n-------------------------------------------\n");

        if(maquina == 1){
            System.out.println("La máquina ha sacado Piedra");
        }else if(maquina == 2){
            System.out.println("La máquina ha sacado Papel");
        }else{
            System.out.println("La máquina ha sacado Tijera");
        }

        System.out.println("\n-------------------------------------------\n");

        if(player ==1 && maquina == 3)
        {
            System.out.println("Uested ha ganado");
        }else if(player == 3 && maquina == 2)
        {
            System.out.println("Usted ha ganado");
        }else if(player == 2 && maquina == 1)
        {
            System.out.println("Usted ha ganado");
        }else if(maquina == 1 && player == 3)
        {
            System.out.println("La máquina ha ganado :(");
        }else if(maquina == 3 && player == 2)
        {
            System.out.println("La máquina ha ganado :(");
        }else if(maquina == 2 && player == 1)
        {
            System.out.println("La máquina ha ganado :(");
        }else if(player == 1 && maquina == 1)
        {
            System.out.println("Han quedado empatados :o");
        }else if(player == 2 && maquina == 2)
        {
            System.out.println("Han quedado empatados :o");
        }else if(player == 3 && maquina == 3)
        {
            System.out.println("Han quedado empatados :o");
        }
        else
        { 
            System.out.println("No se pudo hacer el juego :("); 
        }
        sc.close();
    }
    
}
