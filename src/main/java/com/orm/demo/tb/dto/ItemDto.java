package com.orm.demo.tb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {

    /**
     * 商品标题
     */
    private String title;

    private Long cid;

    /**
     * 类目名称
     */
    private String name;

    @Override
    public String toString() {
        return "ItemDto{" +
                "title='" + title + '\'' +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                '}';
    }
}
