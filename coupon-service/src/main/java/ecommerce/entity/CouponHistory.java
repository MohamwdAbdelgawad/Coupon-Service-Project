package ecommerce.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="coupon_history")
public class CouponHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "coupon_id")
     private Coupon coupon;
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "date")
    private Date date;

    public long getId() {
        return id;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public long getOrderId() {
        return orderId;
    }

    public Date getDate() {
        return date;
    }

    public CouponHistory() {
    }

    public CouponHistory(Coupon coupon, long orderId, Date date) {
        this.coupon = coupon;
        this.orderId = orderId;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
