package br.com.celinamax.easyfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.celinamax.easyfood.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
