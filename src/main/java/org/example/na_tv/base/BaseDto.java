package org.example.na_tv.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@MappedSuperclass
@Setter
@Getter
public abstract class BaseDto {
    protected Long id;
    protected LocalDateTime createdDate;
    protected LocalDateTime updatedDate;
    protected boolean active;
}
