package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String name;
@Column(name="last_name")
String lastName;
String address;
String email;
byte age;

    public User(String name, String lastName, String address, String email, byte age) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
    }
}
