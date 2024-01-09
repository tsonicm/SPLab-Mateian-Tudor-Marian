package sp.lab.Persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import sp.lab.Models.Book;

public interface IBookJPARepository extends JpaRepository<Book, Long>{
    
}
