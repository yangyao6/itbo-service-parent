package com.chizuko.itbo.router.ruul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName BaseFilter
 * @Description
 * @Author yangyao
 * @Date 2018/10/30 0030 16:27
 * @Version 1.0
 **/

@Component
public class BaseFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(BaseFilter.class);

    @Override
    public String filterType() {
        return "pre";   //定义filter的类型，有pre、route、post、error四种
    }

    @Override
    public int filterOrder() {
        return 0;   //定义filter顺序，数字越小表示顺序越高，越先执行
    }

    @Override
    public boolean shouldFilter() {
        return true;   //表示是否执行该filter，true表示执行，false表示不执行
    }

    @Override
    public Object run() throws ZuulException {
        //filter需执行的具体操作
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("token");
        System.out.println(token);

        if (null == token){
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("ok");
        return null;
    }
}
