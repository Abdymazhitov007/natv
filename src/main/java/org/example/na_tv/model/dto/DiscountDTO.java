package org.example.na_tv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.na_tv.base.BaseDto;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class DiscountDTO extends BaseDto {

    Double percent;
    Integer days;
    String definition;
    LocalDateTime startDate;
    LocalDateTime endDate;

}
