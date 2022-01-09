package com.orm.demo.tb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品描述表
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("tb_item_desc")
public class TbItemDesc implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 商品ID
     */
        private Long itemId;

      /**
     * 商品描述
     */
      private String itemDesc;

      /**
     * 创建时间
     */
      private LocalDateTime created;

      /**
     * 更新时间
     */
      private LocalDateTime updated;


}
