package com.hivedata.controller;

import com.alibaba.fastjson2.JSONObject;
import com.hivedata.service.IDmVAsDjkfqInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hive")
public class VisualController {
    @Autowired
    private IDmVAsDjkfqInfoService installmentService;

    @RequestMapping(value = "/byMonth", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getAmountByMonth(@Param("year") Integer year){
        BigDecimal[] installmentAmountList = new BigDecimal[12];
        for(int month = 1; month <= 12; month++){
            StringBuilder yearMonth = new StringBuilder();
            yearMonth.append(year);
            if(month < 10)yearMonth.append('0');
            yearMonth.append(month);
            String yearMonthString = yearMonth.toString();
            installmentAmountList[month - 1] = installmentService.getAmountByMonth(yearMonthString);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("installmentList", installmentAmountList);
        return new JSONObject(map);
    }
}