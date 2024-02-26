package org.example.na_tv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.na_tv.base.BaseDto;
import org.example.na_tv.model.entity.Channel;
import org.example.na_tv.model.entity.Discount;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class DiscountChannelDTO extends BaseDto {

    Discount discount;
    Channel channel;

}
