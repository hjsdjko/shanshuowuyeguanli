package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 物业费
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("wuyefei")
public class WuyefeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 年份
     */

    @TableField(value = "wuyefei_time")
    private String wuyefeiTime;


    /**
     * 物业费单价
     */

    @TableField(value = "wuyefei_danjia")
    private Integer wuyefeiDanjia;


    /**
     * 应收金额
     */

    @TableField(value = "wuyefei_yingshou_number")
    private Integer wuyefeiYingshouNumber;


    /**
     * 缴费金额
     */

    @TableField(value = "wuyefei_number")
    private Integer wuyefeiNumber;


    /**
     * 是否缴费
     */

    @TableField(value = "wuyefei_types")
    private Integer wuyefeiTypes;


    /**
     * 缴费时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：年份
	 */
    public String getWuyefeiTime() {
        return wuyefeiTime;
    }


    /**
	 * 获取：年份
	 */

    public void setWuyefeiTime(String wuyefeiTime) {
        this.wuyefeiTime = wuyefeiTime;
    }
    /**
	 * 设置：物业费单价
	 */
    public Integer getWuyefeiDanjia() {
        return wuyefeiDanjia;
    }


    /**
	 * 获取：物业费单价
	 */

    public void setWuyefeiDanjia(Integer wuyefeiDanjia) {
        this.wuyefeiDanjia = wuyefeiDanjia;
    }
    /**
	 * 设置：应收金额
	 */
    public Integer getWuyefeiYingshouNumber() {
        return wuyefeiYingshouNumber;
    }


    /**
	 * 获取：应收金额
	 */

    public void setWuyefeiYingshouNumber(Integer wuyefeiYingshouNumber) {
        this.wuyefeiYingshouNumber = wuyefeiYingshouNumber;
    }
    /**
	 * 设置：缴费金额
	 */
    public Integer getWuyefeiNumber() {
        return wuyefeiNumber;
    }


    /**
	 * 获取：缴费金额
	 */

    public void setWuyefeiNumber(Integer wuyefeiNumber) {
        this.wuyefeiNumber = wuyefeiNumber;
    }
    /**
	 * 设置：是否缴费
	 */
    public Integer getWuyefeiTypes() {
        return wuyefeiTypes;
    }


    /**
	 * 获取：是否缴费
	 */

    public void setWuyefeiTypes(Integer wuyefeiTypes) {
        this.wuyefeiTypes = wuyefeiTypes;
    }
    /**
	 * 设置：缴费时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：缴费时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
