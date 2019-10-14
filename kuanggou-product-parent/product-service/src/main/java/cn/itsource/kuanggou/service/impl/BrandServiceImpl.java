package cn.itsource.kuanggou.service.impl;


import cn.itsource.kuanggou.domain.Brand;
import cn.itsource.kuanggou.mapper.BrandMapper;
import cn.itsource.kuanggou.query.BrandQuery;
import cn.itsource.kuanggou.service.IBrandService;
import cn.itsource.kuanggou.util.PageList;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public PageList<Brand> queryPage(BrandQuery query) {

        IPage<Brand> brandIPage =
                baseMapper.queryPage(new Page(query.getPage(), query.getRows()), query);
        PageList<Brand> pageList = new PageList<>(brandIPage.getTotal(),brandIPage.getRecords());
        return pageList;
    }
}
