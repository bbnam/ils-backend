package com.nambb.socialindex.application.service;

import com.nambb.socialindex.application.port.in.category.CategoryCreate;
import com.nambb.socialindex.application.port.in.category.CreateCategoryUseCase;
import com.nambb.socialindex.model.category.Category;
import org.springframework.stereotype.Service;

@Service
public class CreateCategoryService implements CreateCategoryUseCase {

    @Override
    public Category addCategory(CategoryCreate categoryCreate) {
        return null;
    }
}
