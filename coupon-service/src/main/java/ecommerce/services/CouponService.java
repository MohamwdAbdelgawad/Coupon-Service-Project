package ecommerce.services;
import ecommerce.dto.CouponStatusResponse;
import ecommerce.entity.Coupon;
import ecommerce.entity.CouponHistory;
import ecommerce.repository.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CouponService {
    @Autowired
    private CouponRepo couponRepo;
    @Autowired
    private CouponHistoryService couponHistoryService ;
    public Coupon createCoupon(Coupon coupon){
       return couponRepo.save(coupon);
    }
    public Coupon updateCoupon(Coupon coupon){
        return couponRepo.save(coupon);
    }
    public Coupon findByCode(String code){
        return couponRepo.findByCode(code);
    }
    public CouponStatusResponse checkCoupon(String code){

        CouponStatusResponse couponStatusResponse = new CouponStatusResponse();
        Coupon coupon = findByCode(code);

        if(coupon.getUsages()<coupon.getMaxUsages() && coupon.getExpireDate().after(new Date()) )
        {
            couponStatusResponse.setValid(true);
            couponStatusResponse.setCode(coupon.getCode());
            couponStatusResponse.setValue(coupon.getValue());

            enum t{percentage , fixed}
            if (coupon.isPercentage()){
                couponStatusResponse.setType(t.percentage.toString());
            }
            else couponStatusResponse.setType(t.fixed.toString());

        }
        else {
            couponStatusResponse.setValid(false);
        }

        return couponStatusResponse;
    }
    public ResponseEntity<?> useCoupon(String couponCode , long orderId){
        CouponStatusResponse couponStatusResponse = checkCoupon(couponCode);
        if(couponStatusResponse.isValid()){
            Coupon coupon = findByCode(couponCode);
            coupon.setUsages(coupon.getUsages() + 1);
            CouponHistory couponHistory = new CouponHistory(coupon,orderId , new Date());
            couponHistoryService.CreateCouponHistory(couponHistory);
        }
        return ResponseEntity.ok(couponStatusResponse);
        }
    }

