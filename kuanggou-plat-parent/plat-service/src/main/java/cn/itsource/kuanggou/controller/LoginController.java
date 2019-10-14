package cn.itsource.kuanggou.controller;

import cn.itsource.kuanggou.util.AjaxResult;
import cn.itsource.kuanggou.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "登录的Controller")
public class LoginController {

    /**
     * 登录接口
     * @return
     */
    /*@ApiOperation(value = "登录的接口")
    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){

        String name = "admin";
        String password = "admin";

        if(name.equals(user.getUsername())&&password.equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功!").setObject(user);
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败!");
    }*/
    @ApiOperation(value = "登录的接口")
    @PostMapping("/login")
    public AjaxResult login(String name,String paassword){

        String name1 = "admin";
        String password = "admin";

        if(name1.equals(name)&&password.equals(paassword)){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功!").setObject(name);
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败!");
    }
}
