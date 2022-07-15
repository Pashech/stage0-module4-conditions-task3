package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if(character == 'e' || character == 'E'||
        character == 'y' || character == 'Y' ||
                character == 'u' || character == 'U' ||
                character == 'i' || character == 'I' ||
                character == 'o' || character == 'O' ||
                character == 'a' || character == 'A' ||
                character == 'u' || character == 'U'
        ){
            System.out.println("Vowel");
        } else if(character == 'q' || character == 'Q'||
            character == 'w' || character == 'W' ||
                character == 'r' || character == 'R' ||
                character == 't' || character == 'T' ||
                character == 'p' || character == 'P' ||
                character == 's' || character == 'S' ||
                character == 'd' || character == 'D' ||
                character == 'f' || character == 'F' ||
                character == 'g' || character == 'G' ||
                character == 'h' || character == 'H' ||
                character == 'j' || character == 'J' ||
                character == 'k' || character == 'K' ||
                character == 'l' || character == 'L' ||
                character == 'z' || character == 'Z' ||
                character == 'x' || character == 'X' ||
                character == 'c' || character == 'C' ||
                character == 'v' || character == 'V' ||
                character == 'b' || character == 'B' ||
                character == 'n' || character == 'N' ||
                character == 'm' || character == 'M'
        ){
            System.out.println("Consonant");
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}
