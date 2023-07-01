public class ToText {
    public static String ConvertCodeToText(int input){
        switch (input){
            case 0:{
                return "Rock";
            }
            case 1:{
                return "Paper";
            }
            case 2:{
                return "Scissors";
            }

        }
        return "UNAVAILABLE";
    }
}
