package cn.itsource.kuanggou.service.impl;

import cn.itsource.kuanggou.domain.ProductType;
import cn.itsource.kuanggou.mapper.ProductTypeMapper;
import cn.itsource.kuanggou.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author wutao
 * @since 2019-10-12
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
