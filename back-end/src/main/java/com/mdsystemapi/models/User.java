package com.mdsystemapi.models;

import com.mdsystemapi.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Data
@Entity(name = "TB_USER")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userid ;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String email;
    private String password;
    private String name;
    private String lastName;

    @OneToOne(mappedBy = "user")
    private Patient patient;


}
