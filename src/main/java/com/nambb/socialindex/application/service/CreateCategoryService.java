package com.nambb.socialindex.application.service;

import com.nambb.socialindex.application.port.in.category.CategoryCreate;
import com.nambb.socialindex.application.port.in.category.CreateCategoryUseCase;
import com.nambb.socialindex.application.port.out.persistence.CategoryRepository;
import com.nambb.socialindex.model.category.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCategoryService implements CreateCategoryUseCase {

    private final CategoryRepository categoryRepository;

    @Override
    public Category addCategory(CategoryCreate categoryCreate) {
        return null;
    }
}
