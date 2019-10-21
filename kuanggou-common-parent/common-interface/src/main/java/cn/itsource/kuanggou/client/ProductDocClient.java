package cn.itsource.kuanggou.client;

import cn.itsource.kuanggou.client.domain.ProductDoc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("KUANGGOU-COMMON")
public interface ProductDocClient {
    /**
     * 批量保存
     * @param productDocList
     */
    @PostMapping("/es/saveBatch")
    void saveBatch(@RequestBody List<ProductDoc> productDocList);

    /**
     * 批量删除
     * @param ids
     */
    @PostMapping("/es/deleteBatch")
    void deleteBatch(@RequestBody List<Long> ids);
}
