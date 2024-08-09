package br.thullyo.event_manager.domain.coupon;

import br.thullyo.event_manager.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Table
@Entity(name = "tb_coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "coupon_id")
    private UUID id;

    private Integer discount;

    private String code;

    private LocalDateTime valid;

    @ManyToOne
    @JoinColumn( name = "event_id")
    private Event event;


}
