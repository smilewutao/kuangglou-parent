package cn.itsource.kuanggou.service;


import cn.itsource.kuanggou.domain.Brand;
import cn.itsource.kuanggou.query.BrandQuery;
import cn.itsource.kuanggou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author wutao
 * @since 2019-10-12
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页高级查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
