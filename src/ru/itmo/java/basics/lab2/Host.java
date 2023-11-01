package ru.itmo.java.basics.lab2;

// класс "Ведущий" игры "Своя игра"
public class Host {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer dob;
    private Boolean registration;

    // Конструктор без параметров
    public Host() {
    }

    // Конструктор со всеми параметрами
    public Host(int id, String firstName, String lastName, String email, String password, Integer dob, Boolean registration) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.registration = registration;
    }

    // Конструктор с обязательными параметрами
    public Host(int id, String firstName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDob() {
        return dob;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration(Boolean registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Host{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", registration=" + registration +
                '}';
    }
}

