package br.com.celinamax.easyfood.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.celinamax.easyfood.dto.OrderDTO;
import br.com.celinamax.easyfood.entities.Order;
import br.com.celinamax.easyfood.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrderWithProducts();		
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

}
