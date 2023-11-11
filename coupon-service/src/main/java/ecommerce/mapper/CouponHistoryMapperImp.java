package ecommerce.mapper;


import ecommerce.dto.CouponHistoryDto;
import ecommerce.entity.CouponHistory;

import java.util.ArrayList;
import java.util.List;
public class CouponHistoryMapperImp implements CouponHistoryMapper {
   public List<CouponHistoryDto> couponHistoryDtoList(List<CouponHistory> couponHistories){
        List<CouponHistoryDto> couponHistoryDtos = new ArrayList<>();
        couponHistories.forEach(item -> {
            CouponHistoryDto couponHistoryDto = new CouponHistoryDto(item.getId() , item.getCoupon().getCode() , item.getOrderId() , item.getDate());
            couponHistoryDtos.add(couponHistoryDto);
        });
        return couponHistoryDtos;
    }
}
