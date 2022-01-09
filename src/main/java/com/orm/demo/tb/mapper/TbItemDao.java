package com.orm.demo.tb.mapper;

import java.util.List;

import com.orm.demo.tb.dto.ItemDto;
import com.orm.demo.tb.entity.TbItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
public interface TbItemDao extends BaseMapper<TbItem> {

    List<ItemDto> selectItemDtoByIdIn(List<Long> ids);
}
