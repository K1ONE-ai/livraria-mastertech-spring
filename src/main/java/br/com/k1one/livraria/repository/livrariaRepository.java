package br.com.k1one.livraria.repository;

import br.com.k1one.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {

}
