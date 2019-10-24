package cn.itsource.kuanggou.service.impl;


import cn.itsource.kuanggou.domain.Brand;
import cn.itsource.kuanggou.mapper.BrandMapper;
import cn.itsource.kuanggou.query.BrandQuery;
import cn.itsource.kuanggou.service.IBrandService;
import cn.itsource.kuanggou.util.LetterUtil;
import cn.itsource.kuanggou.util.PageList;
import cn.itsource.kuanggou.vo.BrandVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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


    @Override
    public boolean save(Brand brand) {
        //创建时间
        brand.setCreateTime(System.currentTimeMillis());
        //首字母
        String firstLetter = LetterUtil.getFirstLetter(brand.getName()).toUpperCase();
        brand.setFirstLetter(firstLetter);
        //商品类型
        brand.setProductTypeId(brand.getProductType().getId());
        return super.save(brand);
    }

    @Override
    public boolean updateById(Brand brand) {
        //修改时间
        brand.setUpdateTime(System.currentTimeMillis());
        //首字母
        String firstLetter = LetterUtil.getFirstLetter(brand.getName()).toUpperCase();
        brand.setFirstLetter(firstLetter);
        //商品类型
        brand.setProductTypeId(brand.getProductType().getId());
        return super.updateById(brand);
    }


    /**
     * 根据类型加载品牌信息
     * @param productTypeId
     * @return
     */
    @Override
    public BrandVo getByProductTypeId(Long productTypeId) {

        BrandVo vo = new BrandVo();
        List<Brand> brands = baseMapper.selectList(new QueryWrapper<Brand>().eq("product_type_id", productTypeId));
        vo.setBrands(brands);
        //首字母  排序 去重
        Set<String> letters = new TreeSet<>();
        for (Brand brand : brands) {
            letters.add(brand.getFirstLetter());
        }
        vo.setLetters(letters);
        return vo;
    }

    
}
