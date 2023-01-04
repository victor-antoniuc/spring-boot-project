package com.example.phone_repair_center_service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="table", schema="events")
public class Events {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="text")
    private String text;

}
