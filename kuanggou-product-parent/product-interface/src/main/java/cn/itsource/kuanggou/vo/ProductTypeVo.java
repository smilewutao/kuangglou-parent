package cn.itsource.kuanggou.vo;

import cn.itsource.kuanggou.domain.ProductType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductTypeVo {

    /**
     * 当前类型
     */
    private ProductType currentType;

    /**
     * 同级别的其他类型
     */
    private List<ProductType> otherTypes = new ArrayList<>();

}
