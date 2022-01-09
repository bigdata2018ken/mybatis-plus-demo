package com.orm.demo.tb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author liu.kang
 * @since 2021-10-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("tb_order_item")
public class TbOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

      private String id;

      /**
     * 商品id
     */
      private String itemId;

      /**
     * 订单id
     */
      private String orderId;

      /**
     * 商品购买数量
     */
      private Integer num;

      /**
     * 商品标题
     */
      private String title;

      /**
     * 商品单价
     */
      private Long price;

      /**
     * 商品总金额
     */
      private Long totalFee;

      /**
     * 商品图片地址
     */
      private String picPath;


}
