package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        if(symbol == 'q' || symbol == 'Q' ||
            symbol == 'w' || symbol == 'W'|| symbol == 'e' || symbol == 'E'||
                symbol == 'r' || symbol == 'R'||
                symbol == 't' || symbol == 'T'||
                symbol == 'y' || symbol == 'Y'||
                symbol == 'u' || symbol == 'U'||
                symbol == 'i' || symbol == 'I'||
                symbol == 'o' || symbol == 'O'||
                symbol == 'p' || symbol == 'P'||
                symbol == 'a' || symbol == 'A'||
                symbol == 's' || symbol == 'S'||
                symbol == 'd' || symbol == 'D'||
                symbol == 'f' || symbol == 'F'||
                symbol == 'g' || symbol == 'G'||
                symbol == 'h' || symbol == 'H'||
                symbol == 'j' || symbol == 'J'||
                symbol == 'k' || symbol == 'K'||
                symbol == 'l' || symbol == 'L'||
                symbol == 'z' || symbol == 'Z'||
                symbol == 'x' || symbol == 'X'||
                symbol == 'c' || symbol == 'C'||
                symbol == 'v' || symbol == 'V'||
                symbol == 'b' || symbol == 'B'||
                symbol == 'n' || symbol == 'N'||
                symbol == 'm' || symbol == 'M'
            ){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
