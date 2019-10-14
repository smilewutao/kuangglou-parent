package cn.itsource.kuanggou.service;

import cn.itsource.kuanggou.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author wutao
 * @since 2019-10-12
 */
public interface IProductTypeService extends IService<ProductType> {

    /**
     * 加载树
     * @return
     */
    List<ProductType> loadTypeTree();
}
