package com.Badia.orderService.VO;

import com.Badia.orderService.models.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private Product product;
    private Orders orders;
}
