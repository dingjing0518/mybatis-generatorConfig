package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jinshipark_coupon_order")
public class JinshiparkCouponOrder {
    @Id
    private Integer id;

    /**
     * 车牌号
     */
    @Column(name = "Plate")
    private String plate;

    /**
     * 订单类型 0-未使用  1-已使用 2-手动删除
     */
    @Column(name = "State")
    private String state;

    /**
     * 订单号
     */
    @Column(name = "OrderID")
    private String orderid;

    /**
     * 停车时长
     */
    @Column(name = "ParkTime")
    private String parktime;

    /**
     * 进场时间
     */
    @Column(name = "InTime")
    private Date intime;

    /**
     * 出场时间
     */
    @Column(name = "OutTime")
    private Date outtime;

    /**
     * 创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

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
     * 优惠券id
     */
    @Column(name = "CouponID")
    private String couponid;

    /**
     * 优惠券生成id
     */
    @Column(name = "jco_coupon_generate_id")
    private Integer jcoCouponGenerateId;

    /**
     * 优惠券所属商户id
     */
    @Column(name = "ShopID")
    private String shopid;

    /**
     * 优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     */
    @Column(name = "Type")
    private String type;

    /**
     * 减免时长
     */
    @Column(name = "ReductionTime")
    private String reductiontime;

    /**
     * 减免金额
     */
    @Column(name = "ReductionMoney")
    private String reductionmoney;

    /**
     * 签名
     */
    @Column(name = "Sign")
    private String sign;

    /**
     * 订单允许扫码次数
     */
    @Column(name = "Num")
    private Integer num;

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
     * 获取车牌号
     *
     * @return Plate - 车牌号
     */
    public String getPlate() {
        return plate;
    }

    /**
     * 设置车牌号
     *
     * @param plate 车牌号
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * 获取订单类型 0-未使用  1-已使用 2-手动删除
     *
     * @return State - 订单类型 0-未使用  1-已使用 2-手动删除
     */
    public String getState() {
        return state;
    }

    /**
     * 设置订单类型 0-未使用  1-已使用 2-手动删除
     *
     * @param state 订单类型 0-未使用  1-已使用 2-手动删除
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取订单号
     *
     * @return OrderID - 订单号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 设置订单号
     *
     * @param orderid 订单号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取停车时长
     *
     * @return ParkTime - 停车时长
     */
    public String getParktime() {
        return parktime;
    }

    /**
     * 设置停车时长
     *
     * @param parktime 停车时长
     */
    public void setParktime(String parktime) {
        this.parktime = parktime;
    }

    /**
     * 获取进场时间
     *
     * @return InTime - 进场时间
     */
    public Date getIntime() {
        return intime;
    }

    /**
     * 设置进场时间
     *
     * @param intime 进场时间
     */
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    /**
     * 获取出场时间
     *
     * @return OutTime - 出场时间
     */
    public Date getOuttime() {
        return outtime;
    }

    /**
     * 设置出场时间
     *
     * @param outtime 出场时间
     */
    public void setOuttime(Date outtime) {
        this.outtime = outtime;
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
     * 获取优惠券生成id
     *
     * @return jco_coupon_generate_id - 优惠券生成id
     */
    public Integer getJcoCouponGenerateId() {
        return jcoCouponGenerateId;
    }

    /**
     * 设置优惠券生成id
     *
     * @param jcoCouponGenerateId 优惠券生成id
     */
    public void setJcoCouponGenerateId(Integer jcoCouponGenerateId) {
        this.jcoCouponGenerateId = jcoCouponGenerateId;
    }

    /**
     * 获取优惠券所属商户id
     *
     * @return ShopID - 优惠券所属商户id
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * 设置优惠券所属商户id
     *
     * @param shopid 优惠券所属商户id
     */
    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    /**
     * 获取优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     *
     * @return Type - 优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     */
    public String getType() {
        return type;
    }

    /**
     * 设置优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     *
     * @param type 优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取减免时长
     *
     * @return ReductionTime - 减免时长
     */
    public String getReductiontime() {
        return reductiontime;
    }

    /**
     * 设置减免时长
     *
     * @param reductiontime 减免时长
     */
    public void setReductiontime(String reductiontime) {
        this.reductiontime = reductiontime;
    }

    /**
     * 获取减免金额
     *
     * @return ReductionMoney - 减免金额
     */
    public String getReductionmoney() {
        return reductionmoney;
    }

    /**
     * 设置减免金额
     *
     * @param reductionmoney 减免金额
     */
    public void setReductionmoney(String reductionmoney) {
        this.reductionmoney = reductionmoney;
    }

    /**
     * 获取签名
     *
     * @return Sign - 签名
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置签名
     *
     * @param sign 签名
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 获取订单允许扫码次数
     *
     * @return Num - 订单允许扫码次数
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置订单允许扫码次数
     *
     * @param num 订单允许扫码次数
     */
    public void setNum(Integer num) {
        this.num = num;
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