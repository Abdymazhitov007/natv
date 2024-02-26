package org.example.na_tv.model.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DiscountResponse {

    Long id;
    Double percent;
    Integer days;
    String definition;
    LocalDateTime startDate;
    LocalDateTime endDate;

}
