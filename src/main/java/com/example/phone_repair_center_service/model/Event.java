package com.example.phone_repair_center_service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Getter
@Setter
@Entity
@Table(name="table", schema="events")
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    @NotEmpty(message = "Title must not be empty")
    private String title;
    @Column(name="text")
    @NotEmpty(message = "Text must not be empty")
    private String text;
}
