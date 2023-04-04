package com.hivedata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hivedata.mbg.mapper.DmVAsDjkfqInfoMapper;
import com.hivedata.mbg.model.DmVAsDjkfqInfo;
import com.hivedata.service.IDmVAsDjkfqInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * dm_v_as_djkfq_info 服务实现类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Service
public class DmVAsDjkfqInfoServiceImpl extends ServiceImpl<DmVAsDjkfqInfoMapper, DmVAsDjkfqInfo> implements IDmVAsDjkfqInfoService {
    @Autowired
    private DmVAsDjkfqInfoMapper mapper;

    @Override
    public BigDecimal getAmountByMonth(String yearMonth) {
        return mapper.getAmountByMonth(yearMonth);
    }
}
