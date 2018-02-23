package github.prudnikov888.dao;

import github.prudnikov888.pojo.WorkItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkItemDao extends MongoRepository<WorkItem, String> {
}
