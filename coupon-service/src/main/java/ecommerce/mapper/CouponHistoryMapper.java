package ecommerce.mapper;

import ecommerce.dto.CouponHistoryDto;
import ecommerce.entity.CouponHistory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CouponHistoryMapper {

    List<CouponHistoryDto> couponHistoryDtoList(List<CouponHistory> couponHistories);

}

