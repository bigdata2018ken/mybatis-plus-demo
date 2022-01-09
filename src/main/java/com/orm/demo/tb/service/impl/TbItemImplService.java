package com.orm.demo.tb.service.impl;

import java.util.List;

import com.orm.demo.tb.dto.ItemDto;
import com.orm.demo.tb.entity.TbItem;
import com.orm.demo.tb.mapper.TbItemDao;
import com.orm.demo.tb.service.TbItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Service
public class TbItemImplService extends ServiceImpl<TbItemDao, TbItem> implements TbItemService {

    @Autowired
    TbItemDao tbItemDao;

    @Override
    public List<ItemDto> selectItemDtoByIdIn(List<Long> ids) {
        return tbItemDao.selectItemDtoByIdIn(ids);
    }
}
