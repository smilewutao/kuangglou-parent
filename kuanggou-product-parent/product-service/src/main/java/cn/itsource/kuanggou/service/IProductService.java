package cn.itsource.kuanggou.service;

import cn.itsource.kuanggou.client.domain.ProductParam;
import cn.itsource.kuanggou.domain.Product;
import cn.itsource.kuanggou.domain.Specification;
import cn.itsource.kuanggou.query.ProductQuery;
import cn.itsource.kuanggou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

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

    /**
     * 保存sku
     * @param productId
     * @param skuproperties
     * @param skus
     */
    void saveSkuProperties(Long productId, List<Specification> skuproperties, List<Map<String, String>> skus);

    /**
     * 批量上架
     * @param idList
     */
    void onSale(List<Long> idList);

    /**
     * 批量下架
     * @param idList
     */
    void offSale(List<Long> idList);

    /**
     * 在线商城搜索商品
     * @param param
     * @return
     */
    PageList<Product> queryOnSale(ProductParam param);
}
