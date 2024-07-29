package com.nambb.socialindex.adapter.in.rest.category;

import com.nambb.socialindex.application.port.in.category.CategoryCreate;
import com.nambb.socialindex.application.port.in.category.CreateCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/categories")
@RequiredArgsConstructor
public class CreateCategoryController {
    private final CreateCategoryUseCase createCategoryUseCase;

    @PostMapping
    public ResponseEntity<String> createCategory(CategoryCreate categoryCreate) {
        createCategoryUseCase.addCategory(categoryCreate);
        return new ResponseEntity<>("Category created", HttpStatus.OK);
    }
}
