package com.zj.entity;

import com.zj.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Boat_rs")
public class Boat_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道 */
    private String bookingid_p = "";/* Yun平台订单号 */
    private String interfaceid_p = "";/* 第三方订单号 */
    private String status_p = "";/* 状态 空-预定  F-完成 C-取消 */
    private String colno_p = "";/* 平台综合预订号 */
    private String name_p = "";/* 姓名 */
    private String telephone_p = "";/* 电话号码 */
    private Date date_p = sdf;/* 下单时间 */
    private String ticketgroup_p = "";/* 票务组 */
    private String ticket_p = "";/* 票型 */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 数量 */
    private BigDecimal person_p = BigDecimal.valueOf(0.00);/* 人数 */
    private String sales_p = "";/* 销售员 */
    private String info_p = "";/* 备注 */
    private Date createdate_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 价格 */
    private BigDecimal orgprice_p = BigDecimal.valueOf(0.00);/* 原价 */
    private BigDecimal deposit_p = BigDecimal.valueOf(0.00);/* 定金 */
    private BigDecimal totalprice_p = BigDecimal.valueOf(0.00);/* 总价 */
    private String ratecode_p = "";/* 价格代码 */
    private String payment_p = "";/* 付款方式微信,淘宝等 */
    private String profileid_p = "";/* 档案号 */
    private Boolean fix_p = false;/* 固定价格 */
    private String kitcode_p = "";/* 套餐代码 */

    @Id
    @SequenceGenerator(name = "Boat_rs", sequenceName = "Boat_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Boat_rs")
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

    @Column(length = 20, nullable = true, name = "[channel]")
    public String getChannel_p() {
        return EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    public void setChannel_p(String channel_p) {
        this.channel_p = EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    @Column(length = 20, nullable = true, name = "[bookingid]")
    public String getBookingid_p() {
        return EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    public void setBookingid_p(String bookingid_p) {
        this.bookingid_p = EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    @Column(length = 20, nullable = true, name = "[interfaceid]")
    public String getInterfaceid_p() {
        return EntityUtil.cutOffStr(interfaceid_p, this.getClass(), "interfaceid_p");
    }

    public void setInterfaceid_p(String interfaceid_p) {
        this.interfaceid_p = EntityUtil.cutOffStr(interfaceid_p, this.getClass(), "interfaceid_p");
    }

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 60, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(nullable = true, name = "[date]")
    public Date getDate_p() {
        return null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    public void setDate_p(Date date_p) {
        this.date_p = null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    @Column(length = 20, nullable = true, name = "[ticketgroup]")
    public String getTicketgroup_p() {
        return EntityUtil.cutOffStr(ticketgroup_p, this.getClass(), "ticketgroup_p");
    }

    public void setTicketgroup_p(String ticketgroup_p) {
        this.ticketgroup_p = EntityUtil.cutOffStr(ticketgroup_p, this.getClass(), "ticketgroup_p");
    }

    @Column(length = 20, nullable = true, name = "[ticket]")
    public String getTicket_p() {
        return EntityUtil.cutOffStr(ticket_p, this.getClass(), "ticket_p");
    }

    public void setTicket_p(String ticket_p) {
        this.ticket_p = EntityUtil.cutOffStr(ticket_p, this.getClass(), "ticket_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[num]")
    public BigDecimal getNum_p() {
        return num_p == null ? new BigDecimal(0.00) : num_p;
    }

    public Integer getNum_p(int i) {
        return num_p == null ? new BigDecimal(0.00).intValue() : num_p.intValue();
    }

    public void setNum_p(Object num_p) {
        if (num_p == null || "".equals(num_p))
            this.num_p = new BigDecimal("0");
        else
            this.num_p = new BigDecimal(num_p.toString());
        this.num_p = EntityUtil.cutOffDecimal(this.num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "num_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[person]")
    public BigDecimal getPerson_p() {
        return person_p == null ? new BigDecimal(0.00) : person_p;
    }

    public Integer getPerson_p(int i) {
        return person_p == null ? new BigDecimal(0.00).intValue() : person_p.intValue();
    }

    public void setPerson_p(Object person_p) {
        if (person_p == null || "".equals(person_p))
            this.person_p = new BigDecimal("0");
        else
            this.person_p = new BigDecimal(person_p.toString());
        this.person_p = EntityUtil.cutOffDecimal(this.person_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "person_p");
    }

    @Column(length = 20, nullable = true, name = "[sales]")
    public String getSales_p() {
        return EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    public void setSales_p(String sales_p) {
        this.sales_p = EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[info]")
    public String getInfo_p() {
        return EntityUtil.cutOffStr(info_p, this.getClass(), "info_p");
    }

    public void setInfo_p(String info_p) {
        this.info_p = EntityUtil.cutOffStr(info_p, this.getClass(), "info_p");
    }

    @Column(nullable = true, name = "[createdate]")
    public Date getCreatedate_p() {
        return null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    public void setCreatedate_p(Date createdate_p) {
        this.createdate_p = null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    @Column(length = 10, nullable = true, name = "[createtime]")
    public String getCreatetime_p() {
        return EntityUtil.cutOffStr(createtime_p, this.getClass(), "createtime_p");
    }

    public void setCreatetime_p(String createtime_p) {
        this.createtime_p = EntityUtil.cutOffStr(createtime_p, this.getClass(), "createtime_p");
    }

    @Column(length = 20, nullable = true, name = "[creator]")
    public String getCreator_p() {
        return EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    public void setCreator_p(String creator_p) {
        this.creator_p = EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[price]")
    public BigDecimal getPrice_p() {
        return price_p == null ? new BigDecimal(0.00) : price_p;
    }

    public Double getPrice_p(int i) {
        return Double.valueOf(price_p.toString());
    }

    public void setPrice_p(Object price_p) {
        if (price_p == null || "".equals(price_p))
            this.price_p = new BigDecimal("0");
        else
            this.price_p = new BigDecimal(price_p.toString());
        this.price_p = EntityUtil.cutOffDecimal(this.price_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "price_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[orgprice]")
    public BigDecimal getOrgprice_p() {
        return orgprice_p == null ? new BigDecimal(0.00) : orgprice_p;
    }

    public Double getOrgprice_p(int i) {
        return Double.valueOf(orgprice_p.toString());
    }

    public void setOrgprice_p(Object orgprice_p) {
        if (orgprice_p == null || "".equals(orgprice_p))
            this.orgprice_p = new BigDecimal("0");
        else
            this.orgprice_p = new BigDecimal(orgprice_p.toString());
        this.orgprice_p = EntityUtil.cutOffDecimal(this.orgprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "orgprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[deposit]")
    public BigDecimal getDeposit_p() {
        return deposit_p == null ? new BigDecimal(0.00) : deposit_p;
    }

    public Double getDeposit_p(int i) {
        return Double.valueOf(deposit_p.toString());
    }

    public void setDeposit_p(Object deposit_p) {
        if (deposit_p == null || "".equals(deposit_p))
            this.deposit_p = new BigDecimal("0");
        else
            this.deposit_p = new BigDecimal(deposit_p.toString());
        this.deposit_p = EntityUtil.cutOffDecimal(this.deposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "deposit_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[totalprice]")
    public BigDecimal getTotalprice_p() {
        return totalprice_p == null ? new BigDecimal(0.00) : totalprice_p;
    }

    public Double getTotalprice_p(int i) {
        return Double.valueOf(totalprice_p.toString());
    }

    public void setTotalprice_p(Object totalprice_p) {
        if (totalprice_p == null || "".equals(totalprice_p))
            this.totalprice_p = new BigDecimal("0");
        else
            this.totalprice_p = new BigDecimal(totalprice_p.toString());
        this.totalprice_p = EntityUtil.cutOffDecimal(this.totalprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "totalprice_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 1, nullable = true, name = "[fix]")
    public Boolean getFix_p() {
        return null == fix_p ? false : fix_p;
    }

    public void setFix_p(Boolean fix_p) {
        this.fix_p = null == fix_p ? false : fix_p;
    }

    @Column(length = 30, nullable = true, name = "[kitcode]")
    public String getKitcode_p() {
        return EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    public void setKitcode_p(String kitcode_p) {
        this.kitcode_p = EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }
}