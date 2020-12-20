package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jinshipark_shop_user")
public class JinshiparkShopUser {
    @Id
    private Integer id;

    /**
     * 登录名称
     */
    @Column(name = "LoginName")
    private String loginname;

    /**
     * 联系人
     */
    @Column(name = "Password")
    private String password;

    /**
     * 联系电话
     */
    @Column(name = "Phone")
    private String phone;

    /**
     * 权限
     */
    @Column(name = "Role")
    private String role;

    /**
     * 商户标号
     */
    @Column(name = "ShopID")
    private String shopid;

    /**
     * 车场编号
     */
    @Column(name = "ParkID")
    private String parkid;

    /**
     * 代理商编号
     */
    @Column(name = "AgentID")
    private String agentid;

    /**
     * 区域编号
     */
    @Column(name = "AreaID")
    private String areaid;

    /**
     * 创建时间
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
     * 获取登录名称
     *
     * @return LoginName - 登录名称
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * 设置登录名称
     *
     * @param loginname 登录名称
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * 获取联系人
     *
     * @return Password - 联系人
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置联系人
     *
     * @param password 联系人
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取联系电话
     *
     * @return Phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取权限
     *
     * @return Role - 权限
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置权限
     *
     * @param role 权限
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取商户标号
     *
     * @return ShopID - 商户标号
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * 设置商户标号
     *
     * @param shopid 商户标号
     */
    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    /**
     * 获取车场编号
     *
     * @return ParkID - 车场编号
     */
    public String getParkid() {
        return parkid;
    }

    /**
     * 设置车场编号
     *
     * @param parkid 车场编号
     */
    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    /**
     * 获取代理商编号
     *
     * @return AgentID - 代理商编号
     */
    public String getAgentid() {
        return agentid;
    }

    /**
     * 设置代理商编号
     *
     * @param agentid 代理商编号
     */
    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    /**
     * 获取区域编号
     *
     * @return AreaID - 区域编号
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * 设置区域编号
     *
     * @param areaid 区域编号
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
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