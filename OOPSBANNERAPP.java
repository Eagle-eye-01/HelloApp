import java.util.HashMap;
import java.util.Map;

public class BannerAppUC7 {

    public static void main(String[] args) {

        String word = "OOPS";
        CharacterPatternMap patternMap = new CharacterPatternMap();

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                CharacterPattern pattern = patternMap.getPattern(ch);
                if (pattern != null) {
                    line.append(pattern.getPattern()[row]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {

        private Map<Character, CharacterPattern> patternMap = new HashMap<>();

        public CharacterPatternMap() {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*     *",
                    "*      ",
                    " ***** ",
                    "      *",
                    "*     *",
                    " ***** "
            }));
        }

        public CharacterPattern getPattern(char character) {
            return patternMap.get(character);
        }
    }
}
