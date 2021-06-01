package com.codeclan.FilesNFolders.FilesNFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    //HAS AN ID & COLUMN CALLED ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //HAS A NAME & COLUMN CALLED NAME
    @Column(name = "name")
    private String name;

    //IS ASSOCIATED WITH A LIST OF FOLDERS
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"user"})
    private List<Folder> folders;

    //EMPTY CONSTRUCTOR - spring needs an empty constructor and the models setters to put the data in the database.
    public User() {
    }

    //CONSTRUCTOR
    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }

    // GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    //OTHER METHOD/S
    public void addFolder(Folder folder){
        this.folders.add(folder);
    }
}
