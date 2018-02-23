package github.prudnikov888.service;

import github.prudnikov888.pojo.WorkItem;

import java.util.List;

public interface WorkItemService {

    void saveWorkItem(WorkItem workItem);
    List<WorkItem> findAll();
    WorkItem findSingleWorkItem(String id);
    void deleteWorkItem(String id);
}
