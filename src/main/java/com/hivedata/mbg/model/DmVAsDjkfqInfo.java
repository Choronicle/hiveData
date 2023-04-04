package com.hivedata.mbg.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * dm_v_as_djkfq_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.dm_v_as_djkfq_info")
public class DmVAsDjkfqInfo implements Serializable {


    @TableId(value = "acct_no", type = IdType.AUTO)
    private String acctNo;

    @TableField("card_no")
    private String cardNo;

    @TableField("cust_name")
    private String custName;

    private String uid;

    @TableField("mob_phone")
    private String mobPhone;

    @TableField("mge_org")
    private String mgeOrg;

    @TableField("recom_no")
    private String recomNo;

    @TableField("mp_number")
    private String mpNumber;

    @TableField("mp_type")
    private String mpType;

    @TableField("mp_status")
    private String mpStatus;

    @TableField("purch_date")
    private String purchDate;

    @TableField("total_amt")
    private BigDecimal totalAmt;

    @TableField("total_mths")
    private Integer totalMths;

    @TableField("mth_instl")
    private BigDecimal mthInstl;

    @TableField("instl_cnt")
    private Integer instlCnt;

    @TableField("rem_ppl")
    private BigDecimal remPpl;

    @TableField("total_fee")
    private BigDecimal totalFee;

    @TableField("rem_fee")
    private BigDecimal remFee;

    @TableField("rec_fee")
    private BigDecimal recFee;

    @TableField("etl_dt")
    private String etlDt;


}
