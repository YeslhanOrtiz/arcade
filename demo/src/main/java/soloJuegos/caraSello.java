package soloJuegos;
import java.util.*;

public class caraSello extends arcade{

    private int num1;

    public caraSello(){}

    public caraSello(int num1){

        this.num1 = num1;

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }



    public void juego(){
        Scanner sc = new Scanner(System.in);
        num1 = (int)(Math.random()*2+1);

        System.out.println("Elija 1 si quiere sello o 2 cara");
        int opUs = sc.nextInt();
        System.out.println("\n-------------------------------------------\n");
        
        if(opUs == 1){
            System.out.println("Usted a elejido la opción "+ opUs +" Sello");
        }else{
            System.out.println("Usted a elejido la opción "+ opUs +" Cara");
        }

        System.out.println("\n-------------------------------------------\n");

        if(num1 == 1)
        {
            System.out.println("Ha salido 1. sello");
        }else
        {
            System.out.println("Ha salido 2. cara");
        }
        if(num1 == opUs){
            System.out.println("Usted a ganado felicidades");
        }else{
            System.out.println("No has tenido suerte perdiste :(");
        }
        sc.close();
    }
}
