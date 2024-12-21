package com.pb_booking.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="USERS")
public class USER {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String password;
    private String phone;
    //private String Registration_date;
    private String role;
}
