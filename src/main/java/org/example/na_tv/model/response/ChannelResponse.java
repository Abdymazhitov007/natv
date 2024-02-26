package org.example.na_tv.model.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChannelResponse {

    Long id;
    String name;
    String logo;
    BigDecimal price;
    Integer rating;

}
