package ecommerce.entity;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
@Table(name ="coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "code")
    private String code;
    @Column(name = "expire_date")
    private Date expireDate;
    @Column(name = "max_usages")
    private long maxUsages;
    @Column(name = "usages")
    private long usages;
    @Column(name = "type")
    private boolean isPercentage;

    public void setPercentage(boolean percentage) {
        isPercentage = percentage;
    }

    public boolean isPercentage() {
        return isPercentage;
    }

    @Column(name = "value")
    private long value;

    public Coupon() {
    }

    public Coupon(long id, String code, Date expireDate, long maxUsages, long usages, long value) {
        this.id = id;
        this.code = code;
        this.expireDate = expireDate;
        this.maxUsages = maxUsages;
        this.usages = usages;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public long getMaxUsages() {
        return maxUsages;
    }

    public long getUsages() {
        return usages;
    }

    public long getValue() {
        return value;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public void setMaxUsages(long maxUsages) {
        this.maxUsages = maxUsages;
    }

    public void setUsages(long usages) {
        this.usages = usages;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
