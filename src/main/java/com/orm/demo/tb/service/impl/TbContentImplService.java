package com.orm.demo.tb.service.impl;

import com.orm.demo.tb.entity.TbContent;
import com.orm.demo.tb.mapper.TbContentDao;
import com.orm.demo.tb.service.TbContentService;
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
public class TbContentImplService extends ServiceImpl<TbContentDao, TbContent> implements TbContentService {

}
