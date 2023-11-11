package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 120, message = "Only 120 characters allowed")
    public String description;

    @ManyToMany(mappedBy = "skills")
//    @JoinColumn(name = "skill_id")
    private final List<Job> jobs = new ArrayList<>();
    public Skill(String description) {
        this.description = description;
    }

    public Skill() {
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
