package github.prudnikov888.pojo;

import java.util.Date;

public class WorkItem {

    private String id;
    private String name;
    private Date plannedStartTime;
    private int plannedDuration; //minutes

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(Date plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public int getPlannedDuration() {
        return plannedDuration;
    }

    public void setPlannedDuration(int plannedDuration) {
        this.plannedDuration = plannedDuration;
    }

    @Override
    public String toString() {
        return "WorkItem [" +
                "id = " + id +
                " ,name = " + name +
                " , plannedStartTime = " + plannedStartTime +
                " , plannedDuration = " + plannedDuration+ "]";
    }
}
