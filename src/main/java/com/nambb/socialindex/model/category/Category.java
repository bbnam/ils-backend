package com.nambb.socialindex.model.category;

import com.nambb.socialindex.model.user.UserId;
import lombok.Data;

@Data
public class Category {
    private CategoryId id;
    private String name;
    private Integer status;
    private UserId createId;
}
