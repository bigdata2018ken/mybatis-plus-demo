package com.orm.demo.tb.service.impl;

import com.orm.demo.tb.entity.TbContentCategory;
import com.orm.demo.tb.mapper.TbContentCategoryDao;
import com.orm.demo.tb.service.TbContentCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容分类 服务实现类
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Service
public class TbContentCategoryImplService extends ServiceImpl<TbContentCategoryDao, TbContentCategory> implements TbContentCategoryService {

}
