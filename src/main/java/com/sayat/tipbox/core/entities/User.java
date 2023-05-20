package com.sayat.tipbox.core.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int UserId;

    @Column(name="identity_number",unique = true)
    @NotBlank
    @NotNull
    //@Size(min = 11, max = 11)
    @Pattern(regexp ="[0-9\\s]{11}")
    private String identityNumber;

    @Column(name="password")
    @NotBlank
    @NotNull
    private String password;
}
