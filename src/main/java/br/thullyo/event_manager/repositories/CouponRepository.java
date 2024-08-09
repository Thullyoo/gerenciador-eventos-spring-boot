package br.thullyo.event_manager.repositories;

import br.thullyo.event_manager.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository  extends JpaRepository<Coupon, UUID> {
}
