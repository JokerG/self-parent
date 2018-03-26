package com.self.base.entity;

import java.util.Date;

public class UpmsPermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.permission_id
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Integer permissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.system_id
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Integer systemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.pid
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.name
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.type
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.permission_value
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private String permissionValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.uri
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private String uri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.icon
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.status
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.orders
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Long orders;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.version
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Byte version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.created_by
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.created_time
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.last_upd_by
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private String lastUpdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_permission.last_upd_time
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    private Date lastUpdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.permission_id
     *
     * @return the value of upms_permission.permission_id
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.permission_id
     *
     * @param permissionId the value for upms_permission.permission_id
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.system_id
     *
     * @return the value of upms_permission.system_id
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Integer getSystemId() {
        return systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.system_id
     *
     * @param systemId the value for upms_permission.system_id
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.pid
     *
     * @return the value of upms_permission.pid
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.pid
     *
     * @param pid the value for upms_permission.pid
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.name
     *
     * @return the value of upms_permission.name
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.name
     *
     * @param name the value for upms_permission.name
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.type
     *
     * @return the value of upms_permission.type
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.type
     *
     * @param type the value for upms_permission.type
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.permission_value
     *
     * @return the value of upms_permission.permission_value
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public String getPermissionValue() {
        return permissionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.permission_value
     *
     * @param permissionValue the value for upms_permission.permission_value
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue == null ? null : permissionValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.uri
     *
     * @return the value of upms_permission.uri
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.uri
     *
     * @param uri the value for upms_permission.uri
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.icon
     *
     * @return the value of upms_permission.icon
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.icon
     *
     * @param icon the value for upms_permission.icon
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.status
     *
     * @return the value of upms_permission.status
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.status
     *
     * @param status the value for upms_permission.status
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.orders
     *
     * @return the value of upms_permission.orders
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Long getOrders() {
        return orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.orders
     *
     * @param orders the value for upms_permission.orders
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setOrders(Long orders) {
        this.orders = orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.version
     *
     * @return the value of upms_permission.version
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Byte getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.version
     *
     * @param version the value for upms_permission.version
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setVersion(Byte version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.created_by
     *
     * @return the value of upms_permission.created_by
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.created_by
     *
     * @param createdBy the value for upms_permission.created_by
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.created_time
     *
     * @return the value of upms_permission.created_time
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.created_time
     *
     * @param createdTime the value for upms_permission.created_time
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.last_upd_by
     *
     * @return the value of upms_permission.last_upd_by
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.last_upd_by
     *
     * @param lastUpdBy the value for upms_permission.last_upd_by
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy == null ? null : lastUpdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_permission.last_upd_time
     *
     * @return the value of upms_permission.last_upd_time
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_permission.last_upd_time
     *
     * @param lastUpdTime the value for upms_permission.last_upd_time
     *
     * @mbg.generated Mon Mar 26 23:00:04 CST 2018
     */
    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }
}