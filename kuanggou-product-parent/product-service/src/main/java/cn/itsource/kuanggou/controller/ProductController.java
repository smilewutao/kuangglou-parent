package cn.itsource.kuanggou.controller;

import cn.itsource.kuanggou.domain.Specification;
import cn.itsource.kuanggou.service.IProductService;
import cn.itsource.kuanggou.domain.Product;
import cn.itsource.kuanggou.query.ProductQuery;
import cn.itsource.kuanggou.util.AjaxResult;
import cn.itsource.kuanggou.util.PageList;
import cn.itsource.kuanggou.util.StrUtils;
import cn.itsource.kuanggou.vo.SkusVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    public IProductService productService;

    /**
    * 保存和修改公用的
    * @param product  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Product product){
        try {
            if(product.getId()!=null){
                productService.updateById(product);
            }else{
                productService.save(product);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！"+e.getMessage());
        }
    }

    /**
    * 删除对象信息
    * @param id
    * @return
    */
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Integer id){
        try {
            productService.removeById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id)
    {
        return productService.getById(id);
    }


    /**
    * 查看所有
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Product> list(){

        return productService.list(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<Product> json(@RequestBody ProductQuery query)
    {
        return productService.queryPage(query);
    }

    /**
     * 根据商品ID查询商品的显示属性
     * @param productId
     * @return
     */
    @GetMapping("/viewProperties/{productId}")
    public List<Specification> getViewProperties(@PathVariable("productId") Long productId){
        return productService.getViewProperties(productId);
    }

    /**
     * 保存属性
     * @param productId
     * @param viewProperties
     * @return
     */
    @PostMapping("/updateViewProperties")
    public AjaxResult updateViewProperties(@RequestParam("productId")Long productId,
                                           @RequestBody List<Specification> viewProperties){
        try {
            productService.saveViewProperties(productId,viewProperties);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("保存失败！"+e.getMessage());
        }
    }

    /**
     * 根据商品ID查询商品的显示属性
     * @param productId
     * @return
     */
    @GetMapping("/skuProperties/{productId}")
    public List<Specification> getSkuProperties(@PathVariable("productId") Long productId){
        return productService.getSkuProperties(productId);
    }

    /**
     * 保存sku
     * @return
     */
    @PostMapping("//updateSkuProperties")
    public AjaxResult updateSkuProperties(@RequestParam("productId")Long productId,
                                          @RequestBody SkusVO skusvo){

        productService.saveSkuProperties(productId,skusvo.getSkuproperties(),skusvo.getSkus());

        return AjaxResult.me();

    }

    /**
     * 批量上架
     * @param ids
     * @return
     */
    @GetMapping("/onSale")
    public AjaxResult onSale(@RequestParam("ids")String ids){
        try {
            List<Long> idList = StrUtils.splitStr2LongArr(ids);
            productService.onSale(idList);
            return AjaxResult.me().setMessage("上架成功!");

        }catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("上架失败!"+e.getMessage());
        }
    }
    /**
     * 批量下架
     * @param ids
     * @return
     */
    @GetMapping("/offSale")
    public AjaxResult offSale(@RequestParam("ids")String ids){

        try {
            List<Long> idList = StrUtils.splitStr2LongArr(ids);
            productService.offSale(idList);
            return AjaxResult.me().setMessage("下架成功!");

        }catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("下架失败!"+e.getMessage());
        }
    }


}
