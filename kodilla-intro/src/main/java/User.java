public class User {
    private String name;
    private int age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
        int sum = 0;
    public String getName() {
            return this.name;
        }
    public int getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        User michal = new User("Michał", 22);
        User dorota = new User("Dorota", 34);
        User piotr = new User("Piotr", 19);
        User monika = new User("Monika", 45);
        User[] users = {michal, dorota, piotr, monika};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
            System.out.println(sum);
        }
        int average;
        average = sum / users.length;
        System.out.println(average);

        int belowAvrg == average;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < belowAvrg){
                System.out.println(users[i].name);
            }
        }

    }
}