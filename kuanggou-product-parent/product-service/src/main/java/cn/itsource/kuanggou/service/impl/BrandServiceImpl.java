package cn.itsource.kuanggou.service.impl;

import cn.itsource.kuanggou.domain.Brand;
import cn.itsource.kuanggou.mapper.BrandMapper;
import cn.itsource.kuanggou.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author wutao
 * @since 2019-10-12
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
