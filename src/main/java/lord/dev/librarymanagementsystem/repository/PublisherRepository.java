package lord.dev.librarymanagementsystem.repository;

import lord.dev.librarymanagementsystem.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
