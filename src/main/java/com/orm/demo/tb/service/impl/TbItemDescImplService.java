package com.orm.demo.tb.service.impl;

import com.orm.demo.tb.entity.TbItemDesc;
import com.orm.demo.tb.mapper.TbItemDescDao;
import com.orm.demo.tb.service.TbItemDescService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品描述表 服务实现类
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Service
public class TbItemDescImplService extends ServiceImpl<TbItemDescDao, TbItemDesc> implements TbItemDescService {

}
