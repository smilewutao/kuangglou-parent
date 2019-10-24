package cn.itsource.kuanggou.service;

import cn.itsource.kuanggou.domain.ProductType;
import cn.itsource.kuanggou.vo.ProductTypeVo;
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

    void genHomePage();

    /**
     * 加载面包屑
     * @param productTypeId
     * @return
     */
    List<ProductTypeVo> loadTypeCrumb(Long productTypeId);
}
