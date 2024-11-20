public class User {
    public static int count;
    String name;
    String surname;
    String email;
    public User (String name,String surname,String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
        count++;
        System.out.println("Пользователей стало: "+ count);
    }

    @Override
    public String toString() {
        return "Пользователь{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
