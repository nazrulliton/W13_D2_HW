package com.codeclan.example.mtrack.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private int size;

    @JsonIgnoreProperties("filed")
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;






}
