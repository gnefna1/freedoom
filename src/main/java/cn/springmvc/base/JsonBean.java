
package cn.springmvc.base;

import java.util.HashMap;

@SuppressWarnings({"serial", "rawtypes", "unchecked"})
public class JsonBean extends HashMap {

    private Integer code;
    private String success = "1";
    private String message;

    private Integer errCode;
    private String errMsg;

    public JsonBean() {
        setSuccess("1");
        setMessage("");
    }

    public JsonBean(Integer errCode) {
        if (errCode == null)
            errCode = 0;
        setErrCode(errCode);
        setErrMsg("ok");
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        put("code", code);
        this.code = code;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        put("errCode", errCode);
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        put("errMsg", errMsg);
        this.errMsg = errMsg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        put("success", success);
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        put("message", message);
        this.message = message;
    }

    public void put(String key, Object value) {
        super.put(key, value);
    }
}
