package my.edu.utem.ftmk.dad.project.luggagesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.project.luggagesystem.model.Luggage;

@Repository
public interface LuggageRepository extends JpaRepository<Luggage, Long> {

}
