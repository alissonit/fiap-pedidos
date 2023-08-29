package br.com.fiap.api.pedidos.dataprovider.repository;

import br.com.fiap.api.pedidos.dataprovider.repository.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, UUID> {

    List<ProductEntity> findAllByCategory(String category);
}
