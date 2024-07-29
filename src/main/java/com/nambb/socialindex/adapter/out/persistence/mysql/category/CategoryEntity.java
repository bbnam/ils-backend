package com.nambb.socialindex.adapter.out.persistence.mysql.category;

import com.nambb.socialindex.adapter.out.persistence.mysql.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "categories")
@Entity
public class CategoryEntity extends BaseEntity {
    private String name;
    private Long userId;
}
