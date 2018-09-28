public class gitTest{
   public static void main(String[] args){
      gitTest gt = new gitTest();
      gt.run();
      int x =2;
      
      System.out.println("Nikas starter");
   
      System.out.println("Jesper er nummer " + x);
   
      System.out.println("Mads Bryde");
   
      System.out.println("Mads glemte at skrive at han var nummer "+ ++x);
   
      System.out.print("derfor blev mads");
   
      System.out.println(" bekymret da han ville overtage verdens herdømmet");
   
      System.out.println("Istedet kunne Jesper overtage verdens herdømmet \"Muhahahaha\"");
   
      System.out.println("Hvad Jesper dog ikke vidste var at Nikas ogsaa ville overtage verdens herdømmet");
   
      System.out.println("Derfor blev Nikas konge over verden og jesper blev hans lille bitch buhuhuhuhu");
   
      System.out.println("Test af git");
   }

   public void run(){
      System.out.println("method");
      
      if(newWorldOrder("mads")){
         System.out.println("Mads is the new leader of the next world order");
      }
   }
   public boolean newWorldOrder(String awesomeness){
      if(awesomeness == "mads"){ 
         return true;
      }else{
         return false;
      }
   }
}
