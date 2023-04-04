package com.hivedata.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hivedata.mbg.model.DmVAsDjkfqInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * <p>
 * dm_v_as_djkfq_info Mapper 接口
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Repository
public interface DmVAsDjkfqInfoMapper extends BaseMapper<DmVAsDjkfqInfo> {
    @Select("SELECT SUM(total_amt) " +
            "FROM dm.dm_v_as_djkfq_info " +
            "WHERE purch_date LIKE '${yearMonth}%'")
    BigDecimal getAmountByMonth(@Param("yearMonth") String yearMonth);
}
