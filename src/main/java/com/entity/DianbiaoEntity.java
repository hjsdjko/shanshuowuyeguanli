package com.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 售电
 *
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("dianbiao")
public class DianbiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianbiaoEntity() {

	}

	public DianbiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 电表编号
     */
    @TableField(value = "dianbiao_name")

    private String dianbiaoName;


    /**
     * 电表余额
     */
    @TableField(value = "dianbiao_number")

    private Integer dianbiaoNumber;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：电表编号
	 */
    public String getDianbiaoName() {
        return dianbiaoName;
    }


    /**
	 * 获取：电表编号
	 */

    public void setDianbiaoName(String dianbiaoName) {
        this.dianbiaoName = dianbiaoName;
    }
    /**
	 * 设置：电表余额
	 */
    public Integer getDianbiaoNumber() {
        return dianbiaoNumber;
    }


    /**
	 * 获取：电表余额
	 */

    public void setDianbiaoNumber(Integer dianbiaoNumber) {
        this.dianbiaoNumber = dianbiaoNumber;
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

    @Override
    public String toString() {
        return "Dianbiao{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", dianbiaoName=" + dianbiaoName +
            ", dianbiaoNumber=" + dianbiaoNumber +
            ", createTime=" + createTime +
        "}";
    }
}