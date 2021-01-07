package br.com.celinamax.easyfood.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.celinamax.easyfood.dto.ProductDTO;
import br.com.celinamax.easyfood.entities.Product;
import br.com.celinamax.easyfood.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = productRepository.findAllByOrderByNameAsc();		
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

}
