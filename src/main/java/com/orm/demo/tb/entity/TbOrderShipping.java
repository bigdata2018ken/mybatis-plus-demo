package com.orm.demo.tb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
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
    @TableName("tb_order_shipping")
public class TbOrderShipping implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 订单ID
     */
        private String orderId;

      /**
     * 收货人全名
     */
      private String receiverName;

      /**
     * 固定电话
     */
      private String receiverPhone;

      /**
     * 移动电话
     */
      private String receiverMobile;

      /**
     * 省份
     */
      private String receiverState;

      /**
     * 城市
     */
      private String receiverCity;

      /**
     * 区/县
     */
      private String receiverDistrict;

      /**
     * 收货地址，如：xx路xx号
     */
      private String receiverAddress;

      /**
     * 邮政编码,如：310001
     */
      private String receiverZip;

    private LocalDateTime created;

    private LocalDateTime updated;


}
