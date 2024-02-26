package org.example.na_tv.model.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class DiscountRequest {

    Double percent;
    Integer days;
    String definition;
    LocalDateTime startDate;
    LocalDateTime endDate;

}
