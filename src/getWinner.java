public class getWinner {
    public static String GetWinner(int computer, int user){
        // 0 = Rock
        // 1 = Paper
        // 2 = Scissors

        if (computer == user){
            return "Tie Game, try again.";
        } else {

       switch (computer){
           case 0:{ // Rock
               if (user == 1){
                   return "You Win";
               } else {
                   return "You Lose";
               }
           }

           case 1:{ // Paper
               if (user == 2){
                   return "You Win";
               } else {
                   return "You Lose";
               }
           }

           case 2:{ // Scissors
               if (user == 0){
                   return "You Win";
               } else {
                   return "You Lose";
               }
           }


       }
return "There has been a error";
        }
    }
}
