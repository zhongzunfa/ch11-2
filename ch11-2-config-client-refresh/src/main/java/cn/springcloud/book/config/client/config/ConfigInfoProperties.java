package cn.springcloud.book.config.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/16
 * @time: 23:55
 * @description : 配置信息, 这里需要注意的是这个单独的配置类， 需要在上面添加refresh 注解
 */
@Component
@ConfigurationProperties(prefix = "cn.springcloud.book")
@RefreshScope
public class ConfigInfoProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
