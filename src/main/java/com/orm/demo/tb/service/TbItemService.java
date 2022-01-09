package com.orm.demo.tb.service;

import java.util.List;

import com.orm.demo.tb.dto.ItemDto;
import com.orm.demo.tb.entity.TbItem;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
public interface TbItemService extends IService<TbItem> {

    List<ItemDto> selectItemDtoByIdIn(List<Long> ids);
}
