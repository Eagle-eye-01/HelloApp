public class BannerAppUC6 {

    public static void main(String[] args) {

        String[][] letters = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        for (int i = 0; i < 7; i++) {
            System.out.println(
                    letters[0][i] + "  " +
                    letters[1][i] + "  " +
                    letters[2][i] + "  " +
                    letters[3][i]
            );
        }
    }

    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}
