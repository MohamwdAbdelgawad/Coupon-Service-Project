package ecommerce.services;

import ecommerce.dto.CouponHistoryDto;
import ecommerce.entity.CouponHistory;
import ecommerce.mapper.CouponHistoryMapperImp;
import ecommerce.repository.CouponHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponHistoryService {
    @Autowired
    CouponHistoryRepo couponHistoryRepo;
    CouponHistoryMapperImp couponHistoryMapperImp = new CouponHistoryMapperImp();
    private CouponHistoryService couponHistoryService ;
    public CouponHistory CreateCouponHistory(CouponHistory couponHistory){
        return couponHistoryRepo.save(couponHistory);
    }
    public List<CouponHistoryDto> getCouponUsages(String couponCode){
       List<CouponHistory> couponHistories = couponHistoryRepo.findByCouponCode(couponCode);
        return couponHistoryMapperImp.couponHistoryDtoList(couponHistories);
    }
    public List<CouponHistoryDto> findAll(){
        List<CouponHistory> couponHistories = couponHistoryRepo.findAll();
        return couponHistoryMapperImp.couponHistoryDtoList(couponHistories);
    }
}
