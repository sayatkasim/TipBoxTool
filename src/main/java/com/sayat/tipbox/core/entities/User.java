package com.sayat.tipbox.core.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.sun.istack.NotNull;
@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int UserId;

    @Column(name="identity_number")
    @NotBlank
    @NotNull
    private String identityNumber;

    @Column(name="password")
    @NotBlank
    @NotNull
    private String password;
}
