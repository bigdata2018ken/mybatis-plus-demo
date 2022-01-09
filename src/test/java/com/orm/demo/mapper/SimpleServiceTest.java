package com.orm.demo.mapper;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.orm.demo.tb.dto.ItemDto;
import com.orm.demo.tb.entity.TbItem;
import com.orm.demo.tb.entity.TbUser;
import com.orm.demo.tb.service.impl.TbItemImplService;
import com.orm.demo.tb.service.impl.TbUserImplService;

@SpringBootTest
public class SimpleServiceTest {

    @Autowired
    TbItemImplService tbItemImplService;

    @Autowired
    TbUserImplService tbUserImplService;

    @Test
    public void selectTest() {
        // in 查询
        List<TbItem> tbItems = tbItemImplService.listByIds(Lists.newArrayList(536563));
        // 自定义带条件的查询
        Map<String, Object> map = Maps.newHashMap();
        map.put("title","电水壶");
        List<TbItem> tbItemList = tbItemImplService.listByMap(map);
        // 分页查询
        Page<TbItem> page = tbItemImplService.page(new Page<>(2, 10));
//        page.getOrders();
        List<TbItem> records = page.getRecords();
        long pages = page.getPages();
        // 自定义mapper 查询
        List<ItemDto> itemDtos = tbItemImplService.selectItemDtoByIdIn(Lists.newArrayList(816448L, 691300L));
        System.out.println(itemDtos);

    }

    @Test
    public void addTest() {
        TbItem tbItem = TbItem.builder().num(2).barcode("test").cid(221312L).created(LocalDateTime.now()).image("lala").price(231L)
                .sellPoint("AS").status(1).title("DSA").updated(LocalDateTime.now()).build();
        tbItemImplService.save(tbItem);
    }

    @Test
    public void deleteTest() {
//        tbItemImplService.removeById(1449298278129717250L);

        // 对标有@TableLogic 的表字段逻辑删除
        tbUserImplService.removeById(32);
        // 查询时，默认排查已删除的记录
        tbUserImplService.list();
    }

    @Test
    public void wrapperTest() {
        QueryWrapper<TbItem> tbItemQueryWrapper = new QueryWrapper<>();
//        tbItemQueryWrapper.select("title, price")
//                .ge("price",22)
//                .in("id",Lists.newArrayList(1473655354,1187781));

        tbItemQueryWrapper.lambda().
                select(TbItem::getBarcode,TbItem::getPrice)
                .ge(TbItem::getPrice, 200)
                .in(TbItem::getId, Lists.newArrayList(1473655354,1187781));

        tbItemImplService.list(tbItemQueryWrapper);

    }

    @Test
    public void insertAutoFill() throws InterruptedException {
       // 插入自动填充
//        tbUserImplService.save(TbUser.builder().email("328861551@qq.com").password("1123").phone("231").username("ken").build());
//        Thread thread = Thread.currentThread();
//        thread.join(5000);
        UpdateWrapper<TbUser> updateWrapper = new UpdateWrapper<TbUser>()
                .eq("password", "1123")
                .set("phone", "122313456");
        // 直接update 不会修改 updated 时间
        tbUserImplService.update(updateWrapper);
        // saveOrUpdate 先查询，如果存在，在修改
        tbUserImplService.saveOrUpdate(TbUser.builder().id(44L).email("328861551@qq.com").password("1123").phone("231").username("ken").build());
    }

    @Test
    public void versionTest() {
        // 乐观锁仅支持 updateById(id) 与 update(entity, wrapper) 方法
        tbUserImplService.updateById(TbUser.builder().id(44L).email("328861551@qq.com").password("1123").phone("12231").version(0).username("kenn").build());
    }

    // 主键默认生成全局唯一的分布式id


}
