package com.childsafety.childsafety.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChildSafeResponse {
    private String name;
    private String email;
    private String who;
}
