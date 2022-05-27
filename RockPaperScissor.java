import java.util.*;
class RockPaperScissor
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        String rps[]={"Rock","Paper","Scissor"};
        String CompMove= rps[new Random().nextInt(rps.length)];
        String PlMove;
        while (true)
        {
            System.out.println("Enter Rock, Paper or Scissor");
            PlMove=sc.nextLine();
            if(PlMove.equals("Rock")||PlMove.equals("Paper")||PlMove.equals("Scissor"))
            break;
            else
            System.out.println("!!!!Not a valid move. Try again!!!!");
        }
        System.out.println("Move by Computer="+CompMove);
        if (CompMove.equals("Rock") )
        {
            if (PlMove.equals("Rock"))
        System.out.println("DRAW!! Neither you nor Computer wins ");
        else if (PlMove.equals("Paper"))
        System.out.println("Your Paper wrapped up the Rock. YOU WIN!!") ;
        else if (PlMove.equals("Scissor"))
        System.out.println("Oops, the Rock crashed your Scissor. YOU LOSE!") ;
    }
    
      if (CompMove.equals("Paper")) 
        {
            if (PlMove.equals("Paper"))
        System.out.println("DRAW!! Neither you nor Computer wins ");
        else if (PlMove.equals("Rock"))
        System.out.println("Your Rock has been wrapped up the Paper. YOU LOSE! ") ;
        else if (PlMove.equals("Scissor"))
        System.out.println("Your Scissor chipped up the Paper. YOU WIN!! ") ;
    }
    if (CompMove.equals("Scissor") )
        {
            if (PlMove.equals("Scissor"))
        System.out.println("DRAW!! Neither you nor Computer wins :(");
        else if (PlMove.equals("Paper"))
        System.out.println("Oops, your Paper has been chipped by the Scissor. YOU LOSE! ") ;
        else if (PlMove.equals("Rock"))
        System.out.println("Your Rock crashed the Scissor. YOU WIN!! ") ;
    }
}
}
    
    