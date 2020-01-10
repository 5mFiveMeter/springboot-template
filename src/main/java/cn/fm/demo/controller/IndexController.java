package cn.fm.demo.controller;

import cn.fm.demo.common.VerifyCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(tags = "系统入口")
public class IndexController {

    @GetMapping("/")
    @ApiOperation("系统根接口")
    public String index(){
        return "0.0";
    }

    @GetMapping("/test")
    @ApiOperation("系统测试接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="count",value="数字",defaultValue = "1",required = true)
    })
    public String test(int count){
        return Integer.toString(count);
    }

    @GetMapping("/getVerifyCode")
    @ApiOperation("验证码获取")
    public void getVerifyCode(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        resp.setContentType("image/jpeg");
        resp.setHeader("pragma","no-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expire", 0);
        try {
            new VerifyCode().setWidth(115).setHeight(30).getRandCode(req,resp);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
