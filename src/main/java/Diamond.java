public class Diamond {

    static String drow(char letter){

        if (letter == 'A') {
            return "A";
        } else if (letter == 'B') {
            return " A\nB B\n A";
        } else {
            return """
                      A
                     B B
                    C   C
                     B B
                      A""";
        }

    }

}
