package ecommerce.dto;

import java.util.Date;

public class CouponHistoryDto {
    private long id;
    private String couponCode;
    private long orderId;
    private Date date;

    public CouponHistoryDto(long id, String couponCode, long orderId, Date date) {
        this.id = id;
        this.couponCode = couponCode;
        this.orderId = orderId;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
