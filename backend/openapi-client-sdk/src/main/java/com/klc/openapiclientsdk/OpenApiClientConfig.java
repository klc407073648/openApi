package com.klc.openapiclientsdk;

import com.klc.openapiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("openapi.client")
@Data
@ComponentScan
public class OpenApiClientConfig {
    private String accessKey;

    private String secretKey;

    @Bean
    public ApiClient yuApiClient() {
        return new ApiClient(accessKey, secretKey);
    }
}
