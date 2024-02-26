package org.example.na_tv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.na_tv.base.BaseDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ChannelDTO extends BaseDto {

    String name;
    String logo;
    BigDecimal price;
    Integer rating;
}
