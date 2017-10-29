package com.yoga.gym.model;

import com.yoga.gym.model.constants.Gender;
import com.yoga.gym.model.constants.Privalage;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by cimbonda on 10/29/2017.
 */
public class User implements Serializable{
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private LocalDate birthDate;
    private Privalage privalage;
}
