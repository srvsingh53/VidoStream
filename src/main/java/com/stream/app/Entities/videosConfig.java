package com.stream.app.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "configOfVid")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class videosConfig {
    @Id
    private String vidId;
    private String title;
    private String description;
    private String contentType;
    private String vidPath;

    // @ManyToOne
    // private courses course;

    
}
