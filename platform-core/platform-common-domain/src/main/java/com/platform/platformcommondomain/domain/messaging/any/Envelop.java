package com.platform.platformcommondomain.domain.messaging.any;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Envelop {
    private Integer id;
    private String message ;
    private Integer version;
}
