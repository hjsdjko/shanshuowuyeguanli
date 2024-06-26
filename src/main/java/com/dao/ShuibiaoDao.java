package com.dao;

import com.entity.ShuibiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuibiaoView;

/**
 * 售水 Dao 接口
 *
 * @author 
 * @since 2021-04-23
 */
public interface ShuibiaoDao extends BaseMapper<ShuibiaoEntity> {

   List<ShuibiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
