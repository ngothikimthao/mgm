package com.mgmtp.internship.experiences.dto;

import com.mgmtp.internship.experiences.model.tables.tables.records.ActivityRecord;

/**
 * Activity detail.
 *
 * @author httbui.ext
 */
public class ActivityDetailDTO {

    private long id;
    private String name;
    private String description;

    public ActivityDetailDTO(ActivityRecord activityRecord) {
    }

    public ActivityDetailDTO(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
