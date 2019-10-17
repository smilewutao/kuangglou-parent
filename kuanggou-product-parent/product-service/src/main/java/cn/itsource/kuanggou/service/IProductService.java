package cn.itsource.kuanggou.service;

import cn.itsource.kuanggou.domain.Product;
import cn.itsource.kuanggou.query.ProductQuery;
import cn.itsource.kuanggou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
