package com.zj.zjserviceapi.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class Pmsfilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(OtaReqfilter.class);

    @Override
    public String filterType() { //过滤触发的生命周期
        return "pre";
        // pre 路由之前调用
        // routing 路由请求时调用
        // post routing error过滤器之后被调用
        // error 处理请求发生错误时调用
    }

    @Override
    public int filterOrder() {
        return 0; //优先级别
    }

    @Override
    public boolean shouldFilter() {
        return true;   //判断是否执行过滤逻辑
    }

    @Override
    public Object run() {  //过滤器的具体逻辑 例如.验证签名等等
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object o = request.getParameter("signid");
        if (o != null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            logger.error("禁止访问");
        }
        return null;
    }
}
