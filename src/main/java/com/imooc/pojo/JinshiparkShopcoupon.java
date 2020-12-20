package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jinshipark_shopcoupon")
public class JinshiparkShopcoupon {
    @Id
    private Integer id;

    /**
     * 优惠券名称
     */
    @Column(name = "CouponName")
    private String couponname;

    /**
     * 优惠券类型 0全免券  1减免时长 2减免金额 3当天全免券
     */
    @Column(name = "CouponType")
    private String coupontype;

    /**
     * 优惠券总数量
     */
    @Column(name = "Count")
    private Integer count;

    /**
     * 优惠券剩余数量
     */
    @Column(name = "RemainCount")
    private Integer remaincount;

    /**
     * 商户id
     */
    @Column(name = "ShopID")
    private String shopid;

    /**
     * 代理商id
     */
    @Column(name = "AgentID")
    private String agentid;

    /**
     * 车场id
     */
    @Column(name = "ParkID")
    private String parkid;

    /**
     * 区域id
     */
    @Column(name = "AreaID")
    private String areaid;

    /**
     * 优惠券开始时间
     */
    @Column(name = "StartTime")
    private Date starttime;

    /**
     * 优惠券结束时间
     */
    @Column(name = "EndTime")
    private Date endtime;

    /**
     * 优惠券创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 备注
     */
    @Column(name = "Remarks")
    private String remarks;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取优惠券名称
     *
     * @return CouponName - 优惠券名称
     */
    public String getCouponname() {
        return couponname;
    }

    /**
     * 设置优惠券名称
     *
     * @param couponname 优惠券名称
     */
    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    /**
     * 获取优惠券类型 0全免券  1减免时长 2减免金额 3当天全免券
     *
     * @return CouponType - 优惠券类型 0全免券  1减免时长 2减免金额 3当天全免券
     */
    public String getCoupontype() {
        return coupontype;
    }

    /**
     * 设置优惠券类型 0全免券  1减免时长 2减免金额 3当天全免券
     *
     * @param coupontype 优惠券类型 0全免券  1减免时长 2减免金额 3当天全免券
     */
    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype;
    }

    /**
     * 获取优惠券总数量
     *
     * @return Count - 优惠券总数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置优惠券总数量
     *
     * @param count 优惠券总数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取优惠券剩余数量
     *
     * @return RemainCount - 优惠券剩余数量
     */
    public Integer getRemaincount() {
        return remaincount;
    }

    /**
     * 设置优惠券剩余数量
     *
     * @param remaincount 优惠券剩余数量
     */
    public void setRemaincount(Integer remaincount) {
        this.remaincount = remaincount;
    }

    /**
     * 获取商户id
     *
     * @return ShopID - 商户id
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * 设置商户id
     *
     * @param shopid 商户id
     */
    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    /**
     * 获取代理商id
     *
     * @return AgentID - 代理商id
     */
    public String getAgentid() {
        return agentid;
    }

    /**
     * 设置代理商id
     *
     * @param agentid 代理商id
     */
    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    /**
     * 获取车场id
     *
     * @return ParkID - 车场id
     */
    public String getParkid() {
        return parkid;
    }

    /**
     * 设置车场id
     *
     * @param parkid 车场id
     */
    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    /**
     * 获取区域id
     *
     * @return AreaID - 区域id
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * 设置区域id
     *
     * @param areaid 区域id
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    /**
     * 获取优惠券开始时间
     *
     * @return StartTime - 优惠券开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置优惠券开始时间
     *
     * @param starttime 优惠券开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取优惠券结束时间
     *
     * @return EndTime - 优惠券结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置优惠券结束时间
     *
     * @param endtime 优惠券结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取优惠券创建时间
     *
     * @return CreateTime - 优惠券创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置优惠券创建时间
     *
     * @param createtime 优惠券创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取备注
     *
     * @return Remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}