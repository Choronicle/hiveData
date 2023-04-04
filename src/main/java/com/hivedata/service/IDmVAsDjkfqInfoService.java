package com.hivedata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hivedata.mbg.model.DmVAsDjkfqInfo;

import java.math.BigDecimal;

/**
 * <p>
 * dm_v_as_djkfq_info 服务类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface IDmVAsDjkfqInfoService extends IService<DmVAsDjkfqInfo> {
    BigDecimal getAmountByMonth(String yearMonth);
}
