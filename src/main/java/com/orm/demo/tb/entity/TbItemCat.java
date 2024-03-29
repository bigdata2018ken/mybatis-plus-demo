package com.orm.demo.tb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品类目
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("tb_item_cat")
public class TbItemCat implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 类目ID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 父类目ID=0时，代表的是一级的类目
     */
      private Long parentId;

      /**
     * 类目名称
     */
      private String name;

      /**
     * 状态。可选值:1(正常),2(删除)
     */
      private Integer status;

      /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
      private Integer sortOrder;

      /**
     * 该类目是否为父类目，1为true，0为false
     */
      private Boolean isParent;

      /**
     * 创建时间
     */
      private LocalDateTime created;

      /**
     * 创建时间
     */
      private LocalDateTime updated;


}
