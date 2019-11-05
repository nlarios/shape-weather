package dk.shape.weather.application.configuration

import dk.shape.weather.client.configuration.WeatherClientsProperties
import dk.shape.weather.client.provider.WeatherClientPropertiesProvider
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import java.time.Duration.ofMillis
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate
import java.time.Duration


@Configuration
@Import(value = [WeatherClientsProperties::class])
open class AppConfig {

    @Bean
    open fun restTemplate(builder: RestTemplateBuilder): RestTemplate {

        return builder
            .setConnectTimeout(Duration.ofMillis(3000))
            .setReadTimeout(Duration.ofMillis(3000))
            .build()
    }

}