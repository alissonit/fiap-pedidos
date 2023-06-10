package br.com.fiap.api.pedidos.infra.configuration;

import br.com.fiap.api.pedidos.domain.port.repository.ClientRepositoryPort;
import br.com.fiap.api.pedidos.domain.port.repository.ProductRepositoryPort;
import br.com.fiap.api.pedidos.domain.port.usecase.ClientUseCasePort;
import br.com.fiap.api.pedidos.domain.port.usecase.ProductUseCasePort;
import br.com.fiap.api.pedidos.domain.usecase.ClientUseCase;
import br.com.fiap.api.pedidos.domain.usecase.ProductUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortConfiguration {

    @Bean
    ProductUseCasePort productUseCase(ProductRepositoryPort productRepositoryPort) {
        return new ProductUseCase(productRepositoryPort, new ModelMapper());
    }
    @Bean
    ClientUseCasePort clientUseCase(ClientRepositoryPort clientRepositoryPort) {
        return new ClientUseCase(clientRepositoryPort, new ModelMapper());
    }
}
