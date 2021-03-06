package cn.itsource.kuanggou.controller;

import cn.itsource.kuanggou.util.VelocityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/14 14:40
 */
@RestController
public class StaticPageController {

    /**
     * 公共的接口-使用模板技术静态化页面
     * 模板路径，数据，目标文件路径
     */
    @PostMapping("/page")
    public void generateStaticPage(
            @RequestParam("templatePath") String templatePath,
            @RequestParam("targetPath")String targetPath,
            @RequestBody Object model){
        VelocityUtils.staticByTemplate(model,templatePath,targetPath);
    }


}
