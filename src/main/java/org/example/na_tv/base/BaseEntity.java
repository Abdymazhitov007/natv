package org.example.na_tv.base;


import jakarta.persistence.PreUpdate;
import lombok.Data;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    protected LocalDateTime createdDate;
    protected LocalDateTime updatedDate;
    protected boolean active;

    @PrePersist
    protected void onCreate(){
        createdDate = LocalDateTime.now();
        updatedDate = LocalDateTime.now();
        active = true;
    }

    @PreUpdate
    protected void onUpdate(){
        updatedDate = LocalDateTime.now();
    }
}
