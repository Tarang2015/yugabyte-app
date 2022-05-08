package com.wellsfargo.yugabyteapp.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long userId;


    private String firstName;


    private String lastName;

    private String email;

    private String fileName;

    private String fileType;

    @Type(type="org.hibernate.type.BinaryType")
    private byte[] data;


    public User(String fileName, String fileType, byte[] bytes) {
        this.fileName =fileName;
        this.fileType = fileType;
        this.data = bytes;
    }

    public User(){

    }
}
