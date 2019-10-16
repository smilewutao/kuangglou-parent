package cn.itsource.kuanggou.util;

/**
 * Ajax请求结果疯狂的工具类
 */
public class AjaxResult {

    private Boolean success = true;
    private String message = "操作成功！";
    private Object restObj;

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getRestObj() {
        return restObj;
    }

    public AjaxResult setRestObj(Object restObj) {
        this.restObj = restObj;
        return this;
    }
}
