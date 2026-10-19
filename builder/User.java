
package builder;


public class User {
    private final String firstName; // Obligatorio
    private final String lastName;  // Obligatorio
    private final int age;          // Opcional
    private final String phone;     // Opcional
    private final String address;   // Opcional

    // Constructor telescópico problemático
    public User(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }
    public User(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "");
    }
    public User(String firstName, String lastName, int age, String phone) {
        this(firstName, lastName, age, phone, "");
    }
    public User(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    // ... Getters ...
// Clase Estatica
    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age = 0;
        private String phone ="";
        private String address;
// Constructor de parametros obligatorios 
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
// Constructores opcionales
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
// Método build 
        public User build() {
            return new User(this);
        }

    }
// Constructor Privado en User
private User(Builder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.age = builder.age;
            this.phone = builder.phone;
            this.address = builder.address;
    
}
@Override
public String toString() {
        return "Usuario : \'" + firstName + '\'' + lastName + '\'' +
                ", Edad: " + age +
                ", Tel: '" + phone + '\'' +
                ", Dirección: " + address + '\'' ;
    }

}
