package com.practise.course.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table( name= "\"course\"")
public class Course {
   @Id
   private long id;
@NotBlank
   private String title;
private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Course()
    {}

}
