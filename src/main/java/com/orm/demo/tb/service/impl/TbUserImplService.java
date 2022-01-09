package com.orm.demo.tb.service.impl;

import com.orm.demo.tb.entity.TbUser;
import com.orm.demo.tb.mapper.TbUserDao;
import com.orm.demo.tb.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Service
public class TbUserImplService extends ServiceImpl<TbUserDao, TbUser> implements TbUserService {

}
