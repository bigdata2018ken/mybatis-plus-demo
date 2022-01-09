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
 * 商品规格和商品的关系表
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("tb_item_param_item")
public class TbItemParamItem implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 商品ID
     */
      private Long itemId;

      /**
     * 参数数据，格式为json格式
     */
      private String paramData;

    private LocalDateTime created;

    private LocalDateTime updated;


}
