package be.dhs.persistence.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import be.dhs.api.role.document.Component;

@NoRepositoryBean
public interface ComponentRepo<T extends Component> extends MongoRepository<T, String> {
	
}