import java.util.Scanner;
//import java.util.Random;

public class MoveAround{
   
   private int x = 5;
   private int y = 5;
   String playerName;
   
   public void setCoords(boolean aksel, int value){
      if(value < 0){
         System.out.println("Du kan ikke rykke ud af spillet. Du forbliver på: " + getCoords(true) + "," + getCoords(false) + ")");
      }else if(value > 10){
         System.out.println("Du kan ikke rykke ud af spillet. Du forbliver på: " + getCoords(true) + "," + getCoords(false) + ")");
      }else{
         if(aksel == true){
            this.x = value;
         }else if(aksel == false){
            this.y = value;
         }
      }
   }
   
   public int getCoords(boolean aksel){
      if(aksel == true){
         return this.x;
      }else if(aksel == false){
         return this.y;
      }
      return -1;
   }

   public static void main(String[] args){
      MoveAround ma = new MoveAround();
      ma.run();
   }
   
   public void run(){
      Scanner sc = new Scanner(System.in);
      int moveCommand;
      
      do{
         moveCommand = Integer.parseInt(sc.nextLine());
         switch(moveCommand){
            // 2 er ned
            case 2:
               System.out.println("rykker et felt ned");
               setCoords(false, (getCoords(false)-1));
               System.out.println("Du er rykket fra (" + getCoords(true) + "," + (getCoords(false)+1) + ") til (" + getCoords(true) + "," + getCoords(false) + ")");
               //System.out.println(getCoords(false));
            break;
            
            // 4 er venstre
            case 4:
               System.out.println("rykker et felt til venstre");
               setCoords(true, (getCoords(true)-1));
               System.out.println("Du er rykket fra (" + (getCoords(true)+1) + "," + getCoords(false) + ") til (" + getCoords(true) + "," + getCoords(false) + ")");
            break;
            
            // 8 er op
            case 8:
               System.out.println("rykker et felt op");
               setCoords(false, (getCoords(false)+1));
               System.out.println("Du er rykket fra (" + getCoords(true) + "," + (getCoords(false)-1) + ") til (" + getCoords(true) + "," + getCoords(false) + ")");
            break;
            
            // 6 er højre
            case 6:
               System.out.println("rykker et felt til højre");
               setCoords(true, (getCoords(true)+1));
               System.out.println("Du er rykket fra (" + (getCoords(true)-1) + "," + getCoords(false) + ") til (" + getCoords(true) + "," + getCoords(false) + ")");
            break;
            
            // 7 er skråt op til venstre
            case 7:
               setCoords(false, (getCoords(false)+1));
               setCoords(true, (getCoords(true)+1));
               System.out.println("Du er rykket til (" + getCoords(true) + "," + getCoords(false) + ")");
            break;
            
            // 3 er skåt ned til højre
            case 3:
               setCoords(false, (getCoords(false)-1));
               setCoords(true, (getCoords(true)+1));
            break;
            
            case 9: 
               setCoords(false, (getCoords(false)-1));
               setCoords(true, (getCoords(true)+1));
            break;
            
            case 1:
            
            break;
            
            // 5 "slukker" spillet
            case 5:
               System.out.println("Stopper spillet - 5 trykket");
            break;
            
            default:
               System.out.println("Du skal bruge numpads; 2, 4, 6 eller 8 til at rykke. 5 for at afslutte");
            break;
         }
      }while(moveCommand != 5);  
   }
}