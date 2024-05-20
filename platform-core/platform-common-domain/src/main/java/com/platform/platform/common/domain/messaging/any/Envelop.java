package com.platform.platform.common.domain.messaging.any;

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
