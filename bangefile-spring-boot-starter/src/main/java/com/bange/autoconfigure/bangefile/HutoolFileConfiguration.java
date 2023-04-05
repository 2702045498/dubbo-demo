package com.bange.autoconfigure.bangefile;

import com.bange.entity.BangeFile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义装配类
 * 1.自动装配Class类应命名为XxxConfiguration: HutoolFileConfiguration
 * 2.自动装配package命名模式:${root-package}.autoconfigure.${module-package}
 * com.bange.autoconfigure.bangefile;
 * 3.
 */
@Configuration
public class HutoolFileConfiguration {
    // 需要创建的类BangeFile
    @Bean
    public BangeFile getBengeFile(){
        return new BangeFile();
    }


}
