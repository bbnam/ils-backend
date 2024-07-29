package com.nambb.socialindex.application.port.out.persistence;

import com.nambb.socialindex.model.category.Category;

public interface CategoryRepository {
    Category save(Category category);
}
