public class Greeting {
    public static void main(String[] args) {
        // Check if the array has any names
        if (args.length > 0) {
            // Loop through each name provided in the arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            // Default fallback if no names are provided
            System.out.println("Hello World");
        }
    }   
}
