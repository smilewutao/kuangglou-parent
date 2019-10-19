package cn.itsource.kuanggou.service;

import cn.itsource.kuanggou.domain.Product;
import cn.itsource.kuanggou.domain.Specification;
import cn.itsource.kuanggou.query.ProductQuery;
import cn.itsource.kuanggou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author wutao
 * @since 2019-10-17
 */
public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);

    //根据商品ID查询商品的显示属性
    List<Specification> getViewProperties(Long productId);

    //保存显示属性
    void saveViewProperties(Long productId, List<Specification> viewProperties);

    //根据商品ID查询商品的sku属性
    List<Specification> getSkuProperties(Long productId);
}
