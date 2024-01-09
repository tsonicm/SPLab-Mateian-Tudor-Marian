package sp.lab.Persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import sp.lab.Models.Author;

public interface IAuthorsRepository extends JpaRepository<Author, Integer>{

}