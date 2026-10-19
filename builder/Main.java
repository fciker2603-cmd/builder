package builder;

public class Main {
    public static void main(String[] args) {
        // Difícil de leer, ¿qué es cada parámetro?
      //  User user = new User("Juan", "Pérez", 30, "+123456789", "Calle Falsa 123");
    
        User user1 = new User.Builder("Juan", "Perez")
              .age(30)
              .phone("+123456789")
              .address("Calle Falsa 123")
              .build();
        System.out.println(user1);

        User user2 = new User.Builder("Maria", "Gomez")
                .phone("+987654321")
                .build();
            System.out.println(user2);

        User user3 = new User.Builder("Carlos", "Lopez")
                .age(25)
                .address("Avenida Siempre Viva 742")
                .build();
            System.out.println(user3);
    }
}