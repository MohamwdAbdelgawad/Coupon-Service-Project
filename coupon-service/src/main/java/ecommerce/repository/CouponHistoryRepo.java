package ecommerce.repository;

import ecommerce.entity.CouponHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CouponHistoryRepo extends JpaRepository<CouponHistory,Long> {
    List<CouponHistory> findByCouponCode(String  couponCode );
}
