package com.stream.app.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class courses {
    @Id
    private String Id;
    private String title;

    // @OneToMany(mappedBy = "course")
    // private List<videosConfig> list = new ArrayList<>();


    
}
