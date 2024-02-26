package org.example.na_tv.model.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChannelRequest {

    String name;
    String logo;
    BigDecimal price;
    Integer rating;

}
