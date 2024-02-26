package org.example.na_tv.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.na_tv.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_order_book")
public class OrderBook  extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    LocalDateTime bookDate;

    @ManyToOne
    Order order;

    @ManyToOne
    Channel channel;

    BigDecimal price;
}
