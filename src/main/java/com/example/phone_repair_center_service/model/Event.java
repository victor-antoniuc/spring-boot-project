package com.example.phone_repair_center_service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name="events", schema="public")
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="firstName")
    @NotEmpty(message = "First Name must not be empty")
    private String firstName;
    @Column(name="lastName")
    @NotEmpty(message = "Last Name must not be empty")
    private String lastName;
    @Column(name="phoneNumber")
    private String phoneNumber;

    @Column(name="phoneModel")
    @NotEmpty(message = "Phone Model must not be empty")
    private String phoneModel;

    @Column(name="description")
    @NotEmpty(message = "Description must not be empty")
    private String description;
}
