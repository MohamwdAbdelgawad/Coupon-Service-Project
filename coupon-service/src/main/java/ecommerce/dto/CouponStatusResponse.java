package ecommerce.dto;

public class CouponStatusResponse {
    private String code;
    private long value;
    private String type;
    private boolean isValid;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getCode() {
        return code;
    }

    public long getValue() {
        return value;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
