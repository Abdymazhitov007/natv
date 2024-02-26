package org.example.na_tv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.na_tv.base.BaseDto;
import org.example.na_tv.model.entity.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class OrderDTO extends BaseDto {

    String text;
    BigDecimal totalPrice;
    User user;

}
