package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jinshipark_coupon")
public class JinshiparkCoupon {
    @Id
    private Integer id;

    /**
     * 优惠券id
     */
    @Column(name = "CouponID")
    private String couponid;

    /**
     * 优惠券名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     */
    @Column(name = "Type")
    private Integer type;

    /**
     * 优惠券总张数
     */
    @Column(name = "Count")
    private Integer count;

    /**
     * 优惠券剩余数量
     */
    @Column(name = "RemainCount")
    private String remaincount;

    /**
     * 开始时间
     */
    @Column(name = "StartDate")
    private Date startdate;

    /**
     * 结束时间
     */
    @Column(name = "EndDate")
    private Date enddate;

    /**
     * 每天几点开始
     */
    @Column(name = "StartTime")
    private String starttime;

    /**
     * 每天几点结束
     */
    @Column(name = "EndTime")
    private String endtime;

    /**
     * 每张优惠券减免时长(单位为分钟)Type=1
     */
    @Column(name = "ReductionTime")
    private Integer reductiontime;

    /**
     * 每张优惠券减免金额(单元为元)Type=2
     */
    @Column(name = "ReductionMoney")
    private Integer reductionmoney;

    /**
     * 创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 商户id
     */
    @Column(name = "ShopID")
    private String shopid;

    /**
     * 区域id
     */
    @Column(name = "AreaID")
    private String areaid;

    /**
     * 车场id
     */
    @Column(name = "ParkID")
    private String parkid;

    /**
     * 代理商id
     */
    @Column(name = "AgentID")
    private String agentid;

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
     * 获取优惠券id
     *
     * @return CouponID - 优惠券id
     */
    public String getCouponid() {
        return couponid;
    }

    /**
     * 设置优惠券id
     *
     * @param couponid 优惠券id
     */
    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    /**
     * 获取优惠券名称
     *
     * @return Name - 优惠券名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置优惠券名称
     *
     * @param name 优惠券名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     *
     * @return Type - 优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     *
     * @param type 优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取优惠券总张数
     *
     * @return Count - 优惠券总张数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置优惠券总张数
     *
     * @param count 优惠券总张数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取优惠券剩余数量
     *
     * @return RemainCount - 优惠券剩余数量
     */
    public String getRemaincount() {
        return remaincount;
    }

    /**
     * 设置优惠券剩余数量
     *
     * @param remaincount 优惠券剩余数量
     */
    public void setRemaincount(String remaincount) {
        this.remaincount = remaincount;
    }

    /**
     * 获取开始时间
     *
     * @return StartDate - 开始时间
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * 设置开始时间
     *
     * @param startdate 开始时间
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * 获取结束时间
     *
     * @return EndDate - 结束时间
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 设置结束时间
     *
     * @param enddate 结束时间
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 获取每天几点开始
     *
     * @return StartTime - 每天几点开始
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置每天几点开始
     *
     * @param starttime 每天几点开始
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取每天几点结束
     *
     * @return EndTime - 每天几点结束
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置每天几点结束
     *
     * @param endtime 每天几点结束
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取每张优惠券减免时长(单位为分钟)Type=1
     *
     * @return ReductionTime - 每张优惠券减免时长(单位为分钟)Type=1
     */
    public Integer getReductiontime() {
        return reductiontime;
    }

    /**
     * 设置每张优惠券减免时长(单位为分钟)Type=1
     *
     * @param reductiontime 每张优惠券减免时长(单位为分钟)Type=1
     */
    public void setReductiontime(Integer reductiontime) {
        this.reductiontime = reductiontime;
    }

    /**
     * 获取每张优惠券减免金额(单元为元)Type=2
     *
     * @return ReductionMoney - 每张优惠券减免金额(单元为元)Type=2
     */
    public Integer getReductionmoney() {
        return reductionmoney;
    }

    /**
     * 设置每张优惠券减免金额(单元为元)Type=2
     *
     * @param reductionmoney 每张优惠券减免金额(单元为元)Type=2
     */
    public void setReductionmoney(Integer reductionmoney) {
        this.reductionmoney = reductionmoney;
    }

    /**
     * 获取创建时间
     *
     * @return CreateTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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