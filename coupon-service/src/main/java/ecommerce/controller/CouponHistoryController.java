package ecommerce.controller;


import ecommerce.dto.CouponHistoryDto;
import ecommerce.services.CouponHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/couponHistory")

public class CouponHistoryController {
    @Autowired
    CouponHistoryService couponHistoryService;

    @GetMapping("/coupon/{code}")
    public List<CouponHistoryDto> getCouponUsages(@PathVariable String code) {
        return couponHistoryService.getCouponUsages(code);
    }
    @GetMapping
    public List<CouponHistoryDto> findAll(){
        return couponHistoryService.findAll();
    }
}
