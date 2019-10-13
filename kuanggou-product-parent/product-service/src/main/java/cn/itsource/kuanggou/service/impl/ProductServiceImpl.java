package cn.itsource.kuanggou.service.impl;

import cn.itsource.kuanggou.domain.Product;
import cn.itsource.kuanggou.mapper.ProductMapper;
import cn.itsource.kuanggou.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author wutao
 * @since 2019-10-12
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
