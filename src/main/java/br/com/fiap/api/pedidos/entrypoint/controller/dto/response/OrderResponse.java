package br.com.fiap.api.pedidos.entrypoint.controller.dto.response;

import br.com.fiap.api.pedidos.core.Order;
import br.com.fiap.api.pedidos.core.Product;
import br.com.fiap.api.pedidos.entrypoint.controller.dto.ClientDto;
import br.com.fiap.api.pedidos.dataprovider.repository.entity.ClientEntity;
import br.com.fiap.api.pedidos.dataprovider.repository.entity.ProductEntity;
import br.com.fiap.api.pedidos.dataprovider.enumeration.OrderStatusEnum;

import java.util.List;
import java.util.UUID;



    public record OrderResponse(UUID orderId, String customerOrder, Boolean active, OrderStatusEnum orderStatus,
                                List<Product> orderProducts, Double orderPrice, ClientEntity client) {

    public static OrderResponse fromEntityToRespons(Order order) {
        return new OrderResponse(order.getOrderId(), order.getCustomerOrder(), order.getActive(), order.getOrderStatus(),
                order.getOrderProducts(), order.getOrderPrice(), order.getClient() != null ?  ClientDto.fromClientToClientEntity(order.getClient()) : null);
    }
}
