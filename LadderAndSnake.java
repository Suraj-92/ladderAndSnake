import java.util.*;

class LadderAndSnake{

    public static void main(String[] args){

      int position=0;
      System.out.println("Start with position "+position);
      Random r=new Random();
      int x=r.nextInt(7);
      System.out.println("Rolling the dice " +x);

      Random r1=new Random();
      int y=r1.nextInt(3);
      System.out.println("Steps" +y);

      if(y==0)
      {
         System.out.println("Player is in same position....");
      }
      else if(y==1)
      {
         System.out.println("Player move behind");
         position=position-x;
         System.out.println("Current position of player is:"+position);
      }
      else if(y==2)
      {
         System.out.println("Player Move ahead");
         position=position-x;
         System.out.println("Current position of the player is:"+position);
      }

   }

}

