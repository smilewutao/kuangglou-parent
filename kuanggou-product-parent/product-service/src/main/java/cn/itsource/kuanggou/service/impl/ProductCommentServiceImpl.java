package cn.itsource.kuanggou.service.impl;

import cn.itsource.kuanggou.domain.ProductComment;
import cn.itsource.kuanggou.mapper.ProductCommentMapper;
import cn.itsource.kuanggou.service.IProductCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价 服务实现类
 * </p>
 *
 * @author wutao
 * @since 2019-10-17
 */
@Service
public class ProductCommentServiceImpl extends ServiceImpl<ProductCommentMapper, ProductComment> implements IProductCommentService {

}
