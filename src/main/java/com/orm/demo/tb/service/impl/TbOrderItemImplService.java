package com.orm.demo.tb.service.impl;

import com.orm.demo.tb.entity.TbOrderItem;
import com.orm.demo.tb.mapper.TbOrderItemDao;
import com.orm.demo.tb.service.TbOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Service
public class TbOrderItemImplService extends ServiceImpl<TbOrderItemDao, TbOrderItem> implements TbOrderItemService {

}
