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
    @NotEmpty(message = "Title must not be empty")
    private String firstName;
    @Column(name="lastName")
    @NotEmpty(message = "Title must not be empty")
    private String lastName;
    @Column(name="phoneNumber")
    @NotEmpty(message = "Title must not be empty")
    private String phoneNumber;

    @Column(name="phoneModel")
    @NotEmpty(message = "Title must not be empty")
    private String phoneModel;

    @Column(name="description")
    @NotEmpty(message = "Title must not be empty")
    private String description;
}
