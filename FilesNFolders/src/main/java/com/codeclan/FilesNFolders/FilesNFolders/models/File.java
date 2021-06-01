package com.codeclan.FilesNFolders.FilesNFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "file_extension")
    private String fileExtension;

    @Column(name = "file_size")
    private float fileSize;

    @ManyToOne
    @JsonIgnoreProperties({"files"})
    @JoinColumn(name="folder_id", nullable = false)
    private Folder folder;

    public File() {
    }

    public File(String name, String fileExtension, float fileSize, Folder folder) {
        this.name = name;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.folder = folder;
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

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public float getFileSize() {
        return fileSize;
    }

    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
