package sample;

public class StackProblem {

    private final static  String input = "ab(c(d){3}){2}e";

    public static void main(String[] args) {
        int length = input.length();
        int i=0;
        StringBuffer outputString = new StringBuffer();

        while(i != length-1){

            Character c  = input.charAt(i);
            if(c == '{'){
                // get the number until '}' found , push number to num stack
            }
            if( c == '}') {
                // pop number from num stack
                // pop string from str stack
                //append it to main string.
                System.out.println("aa");
                

            }
            if(Character.isAlphabetic(c)){
               outputString.append(c);

            }

            if(c== '('){
                // push character till next alpha numeric character
            }

        }

    }




    private String output = "abcdddcddde";
}
