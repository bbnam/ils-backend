package com.nambb.socialindex.application.service;

import com.nambb.socialindex.application.port.in.category.CategoryCreate;
import com.nambb.socialindex.application.port.in.category.CreateCategoryUseCase;
import com.nambb.socialindex.application.port.out.persistence.CategoryRepository;
import com.nambb.socialindex.model.category.Category;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateCategoryService implements CreateCategoryUseCase {

    private final CategoryRepository categoryRepository;

    @Override
    public Category addCategory(CategoryCreate categoryCreate) {
        Category category = new Category();
        category.setName(categoryCreate.getName());
        category.setCreateId(categoryCreate.getCreatorId());
        return categoryRepository.save(category);
    }
}
