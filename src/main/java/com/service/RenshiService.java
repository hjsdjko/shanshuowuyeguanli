package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshiEntity;
import java.util.Map;

/**
 * 人事信息 服务类
 * @author 
 * @since 2021-04-23
 */
public interface RenshiService extends IService<RenshiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}