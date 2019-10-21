package cn.itsource.kuanggou.mapper;

import cn.itsource.kuanggou.domain.Product;
import cn.itsource.kuanggou.query.ProductQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author wutao
 * @since 2019-10-17
 */
public interface ProductMapper extends BaseMapper<Product> {

    IPage queryPage(Page page, @Param("query") ProductQuery query);

    /**
     * 修改显示属性
     * mapper接口中如果有多个参数需要在sql中获取作为参数
     * 需要参数绑定，使用@Param注解
     * @param productId
     * @param viewProperties
     */
    void updateViewProperties(@Param("productId") Long productId,@Param("viewProperties") String viewProperties);

    //修改商品的sku属性
    void updateSkuProperties(@Param("productId") Long productId, @Param("skuProperties") String skuPropertiesJSON);

    /**
     * 批量上架
     * @param ids
     * @param onSaleTime
     */
    void onSale(@Param("ids") List<Long> ids, @Param("onSaleTime") long onSaleTime);

    /**
     * 批量下架
     * @param ids
     * @param offSaleTime
     */
    void offSale(@Param("ids") List<Long> ids,@Param("offSaleTime") long offSaleTime);
}


