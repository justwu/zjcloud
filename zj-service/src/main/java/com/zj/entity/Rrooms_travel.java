package com.zj.entity;

import com.zj.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Rrooms_travel")
public class Rrooms_travel implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channelid_p = "";/* 渠道代码 */
    private String travelid_p = "";/* 渠道代码 */
    private String rmtype_p = "";/* 房型代码 */
    private Date datum_p = sdf;/* 日期 */
    private BigDecimal pickup_num_p = BigDecimal.valueOf(0.00);/* 已用数 */
    private BigDecimal allow_num_p = BigDecimal.valueOf(0.00);/* 预留数 */
    private Date cutdate_p = sdf;/* 释放房表时间 */

    @Id
    @SequenceGenerator(name = "Rrooms_travel", sequenceName = "Rrooms_travel_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Rrooms_travel")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
    }

    @Column(length = 20, nullable = true, name = "[section]")
    public String getSection_p() {
        return EntityUtil.cutOffStr(section_p, this.getClass(), "section_p");
    }

    public void setSection_p(String section_p) {
        this.section_p = EntityUtil.cutOffStr(section_p, this.getClass(), "section_p");
    }

    @Column(length = 20, nullable = true, name = "[channelid]")
    public String getChannelid_p() {
        return EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    public void setChannelid_p(String channelid_p) {
        this.channelid_p = EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    @Column(length = 20, nullable = true, name = "[travelid]")
    public String getTravelid_p() {
        return EntityUtil.cutOffStr(travelid_p, this.getClass(), "travelid_p");
    }

    public void setTravelid_p(String travelid_p) {
        this.travelid_p = EntityUtil.cutOffStr(travelid_p, this.getClass(), "travelid_p");
    }

    @Column(length = 20, nullable = true, name = "[rmtype]")
    public String getRmtype_p() {
        return EntityUtil.cutOffStr(rmtype_p, this.getClass(), "rmtype_p");
    }

    public void setRmtype_p(String rmtype_p) {
        this.rmtype_p = EntityUtil.cutOffStr(rmtype_p, this.getClass(), "rmtype_p");
    }

    @Column(nullable = true, name = "[datum]")
    public Date getDatum_p() {
        return null == datum_p ? EntityUtil.stringToDate("1900-01-01") : datum_p;
    }

    public void setDatum_p(Date datum_p) {
        this.datum_p = null == datum_p ? EntityUtil.stringToDate("1900-01-01") : datum_p;
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[pickup_num]")
    public BigDecimal getPickup_num_p() {
        return pickup_num_p == null ? new BigDecimal(0.00) : pickup_num_p;
    }

    public Integer getPickup_num_p(int i) {
        return pickup_num_p == null ? new BigDecimal(0.00).intValue() : pickup_num_p.intValue();
    }

    public void setPickup_num_p(Object pickup_num_p) {
        if (pickup_num_p == null || "".equals(pickup_num_p))
            this.pickup_num_p = new BigDecimal("0");
        else
            this.pickup_num_p = new BigDecimal(pickup_num_p.toString());
        this.pickup_num_p = EntityUtil.cutOffDecimal(this.pickup_num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "pickup_num_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[allow_num]")
    public BigDecimal getAllow_num_p() {
        return allow_num_p == null ? new BigDecimal(0.00) : allow_num_p;
    }

    public Integer getAllow_num_p(int i) {
        return allow_num_p == null ? new BigDecimal(0.00).intValue() : allow_num_p.intValue();
    }

    public void setAllow_num_p(Object allow_num_p) {
        if (allow_num_p == null || "".equals(allow_num_p))
            this.allow_num_p = new BigDecimal("0");
        else
            this.allow_num_p = new BigDecimal(allow_num_p.toString());
        this.allow_num_p = EntityUtil.cutOffDecimal(this.allow_num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "allow_num_p");
    }

    @Column(nullable = true, name = "[cutdate]")
    public Date getCutdate_p() {
        return null == cutdate_p ? EntityUtil.stringToDate("1900-01-01") : cutdate_p;
    }

    public void setCutdate_p(Date cutdate_p) {
        this.cutdate_p = null == cutdate_p ? EntityUtil.stringToDate("1900-01-01") : cutdate_p;
    }
}
