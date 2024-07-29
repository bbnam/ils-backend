package com.nambb.socialindex.application.port.in.category;

import com.nambb.socialindex.model.user.UserId;
import lombok.Data;

@Data
public class CategoryCreate {
    private String name;
    private Integer status;
    private UserId creatorId;
}
