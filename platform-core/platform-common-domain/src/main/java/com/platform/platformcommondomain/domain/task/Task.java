package com.platform.platformcommondomain.domain.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    private Integer taskId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Integer priority;
    private String status;
}
