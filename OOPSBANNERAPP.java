 public class BannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", " ", "*"),
            String.join("", "*", " ", "T", "O", " ", "O", "O", "P", "S", " ", "*"),
            String.join("", "*", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
            String.join("", "*", " ", "A", "P", "P", " ", "U", "C", "5", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
