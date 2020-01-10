package cn.fm.demo.common;

public class HttpResultContent {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }
    public HttpResultContent setCode(Integer code) {
        this.code = code;
        return this;
    }
    public String getMsg() {
        return msg;
    }
    public HttpResultContent setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public Object getData() {
        return data;
    }
    public HttpResultContent setData(Object data) {
        this.data = data;
        return this;
    }

    public static HttpResultContent success() {
        HttpResultContent result = new HttpResultContent();
        result.setCode(200);
        result.setMsg("ÇëÇó³É¹¦");
        return result;
    }

    public static HttpResultContent fail() {
        HttpResultContent result = new HttpResultContent();
        result.setCode(500);
        result.setMsg("ÇëÇóÊ§°Ü");
        return result;
    }
}
