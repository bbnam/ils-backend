package com.nambb.socialindex.application.port.in.category;

import com.nambb.socialindex.model.category.Category;

public interface CreateCategoryUseCase {
    Category addCategory(CategoryCreate categoryCreate);
}
