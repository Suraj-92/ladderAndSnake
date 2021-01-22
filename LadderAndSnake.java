public class LadderAndSnake{
      private void play(){
      int position=0;

      while(position!=100)
      {

      int dice=(int) (Math.floor(Math.random()*10 % 6 + 1));
      System.out.println("Rolling the dice" +dice);


      int diceCheck=(int)(Math.random()* dice % 3);
      System.out.println("Dice Check is :"+diceCheck);

      if(diceCheck == 0)
      {
         System.out.println("Player is in same position....");
      }
      else if(diceCheck == 1)
      {
         System.out.println("Player move ahead");
         position=position+dice;
         System.out.println("Current position of player is:"+position);
      }
      else if(diceCheck==2)
      {
         System.out.println("Player Move behind");
         position=position-dice;
         System.out.println("Current position of the player is:"+position);
         if(position < 0)
         {
            position=0;
            System.out.println("Position start again initial point i.e zero");
         }
      }
      else
      {
         System.out.println("Game Finish...");
      }
      if(position > 100 && position >0)
      {
         position=position-dice;
      }

   }
}
public static void main(String[] args)
{
   System.out.println("Starting with 0 position");
   LadderAndSnake s=new LadderAndSnake();
   s.play();
}

}
