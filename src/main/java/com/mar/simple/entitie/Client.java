package com.mar.simple.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    //    @Id
//    @Column(nullable = false)
//    @UuidGenerator
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private Status status;
    private Date birth;

    @Transient
    public String getFormatedBirth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(Open.pattern);
        return dateFormat.format(birth);
    }
}
