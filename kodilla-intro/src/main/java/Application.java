public class Application {
    String name = "Adam";
    double age = 40.5;
    double height = 178;

    public static void main(String[] args) {
        Application candidate = new Application();

        if (candidate.name != null) {
            if (candidate.age > 30 && candidate.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");

            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

    }
    }

