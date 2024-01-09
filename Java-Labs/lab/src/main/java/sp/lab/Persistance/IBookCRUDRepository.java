package sp.lab.Persistance;

import org.springframework.data.repository.CrudRepository;

import sp.lab.Models.Book;

public interface IBookCRUDRepository extends CrudRepository<Book, Long>{
    
}
