package github.prudnikov888.controller;

import github.prudnikov888.pojo.WorkItem;
import github.prudnikov888.service.WorkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkItemController {

    @Autowired
    private WorkItemService workItemService;

    @GetMapping("/items")
    public List<WorkItem> getAllWorkItems(){
        return workItemService.findAll();
    }

    @GetMapping("/items/{id}")
    public WorkItem getSingleWorkItem(@PathVariable String id){
        return workItemService.findSingleWorkItem(id);
    }

    @PostMapping("/items")
    public void createWorkItem(@RequestBody WorkItem workItem){
        workItemService.saveWorkItem(workItem);
    }

    @PutMapping("/items/{id}")
    public void updateWorkItem(@PathVariable String id, @RequestBody WorkItem workItem) {
        workItem.setId(id);
        workItemService.saveWorkItem(workItem);
    }

    @DeleteMapping("/items/{id}")
    public void deleteWorkItem(@PathVariable String id) {
        workItemService.deleteWorkItem(id);
    }
}
