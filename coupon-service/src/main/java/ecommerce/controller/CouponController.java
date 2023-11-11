package ecommerce.controller;


import ecommerce.dto.CouponStatusResponse;
import ecommerce.entity.Coupon;
import ecommerce.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @PostMapping
    public Coupon createCoupon(Coupon coupon){
        return couponService.createCoupon(coupon);
    }
    @PutMapping()
     public Coupon updateCoupon(Coupon coupon){
        return couponService.updateCoupon(coupon);
    }
    @GetMapping("/check/{code}")
    public CouponStatusResponse checkCoupon(@PathVariable String code){
        return couponService.checkCoupon(code);
    }
    @GetMapping("/{code}")
    public Coupon findByCode(@PathVariable String code){
        return couponService.findByCode(code);
    }
    @GetMapping ("/useCoupon/{couponCode}/{orderId}")
    public ResponseEntity<?> useCoupon(@PathVariable String couponCode ,@PathVariable long orderId){
        return couponService.useCoupon(couponCode , orderId);
    }

}
