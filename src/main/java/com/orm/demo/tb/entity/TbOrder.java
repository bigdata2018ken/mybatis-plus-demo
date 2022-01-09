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
    @TableName("tb_order")
public class TbOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 订单id
     */
        private String orderId;

      /**
     * 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
      private String payment;

      /**
     * 支付类型，1、在线支付，2、货到付款
     */
      private Integer paymentType;

      /**
     * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
      private String postFee;

      /**
     * 状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
     */
      private Integer status;

      /**
     * 订单创建时间
     */
      private LocalDateTime createTime;

      /**
     * 订单更新时间
     */
      private LocalDateTime updateTime;

      /**
     * 付款时间
     */
      private LocalDateTime paymentTime;

      /**
     * 发货时间
     */
      private LocalDateTime consignTime;

      /**
     * 交易完成时间
     */
      private LocalDateTime endTime;

      /**
     * 交易关闭时间
     */
      private LocalDateTime closeTime;

      /**
     * 物流名称
     */
      private String shippingName;

      /**
     * 物流单号
     */
      private String shippingCode;

      /**
     * 用户id
     */
      private Long userId;

      /**
     * 买家留言
     */
      private String buyerMessage;

      /**
     * 买家昵称
     */
      private String buyerNick;

      /**
     * 买家是否已经评价
     */
      private Integer buyerRate;


}
