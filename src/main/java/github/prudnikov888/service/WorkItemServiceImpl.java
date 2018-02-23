package github.prudnikov888.service;

import github.prudnikov888.dao.WorkItemDao;
import github.prudnikov888.pojo.WorkItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WorkItemServiceImpl implements WorkItemService {

    @Autowired
    private WorkItemDao workItemDao;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveWorkItem(WorkItem workItem) {
        workItemDao.save(workItem);
    }

    @Override
    public List<WorkItem> findAll() {
        return workItemDao.findAll();
    }

    @Override
    public WorkItem findSingleWorkItem(String id) {
        return workItemDao.findOne(id);
    }

    @Override
    public void deleteWorkItem(String id) {
        workItemDao.delete(id);
    }
}
