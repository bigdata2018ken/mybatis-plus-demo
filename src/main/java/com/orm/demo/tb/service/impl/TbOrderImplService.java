package com.orm.demo.tb.service.impl;

import com.orm.demo.tb.entity.TbOrder;
import com.orm.demo.tb.mapper.TbOrderDao;
import com.orm.demo.tb.service.TbOrderService;
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
public class TbOrderImplService extends ServiceImpl<TbOrderDao, TbOrder> implements TbOrderService {

}
