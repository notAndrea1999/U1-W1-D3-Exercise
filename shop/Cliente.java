package shop;

import java.util.Random;

public class Cliente {
    private int userId;
    private String name;
    private String surname;
    private String email;
    private String registrationDate;
    public Cliente(String name, String surname, String email, String registrationDate) {
        Random rndm = new Random();
        this.userId = rndm.nextInt(1, 1000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}
