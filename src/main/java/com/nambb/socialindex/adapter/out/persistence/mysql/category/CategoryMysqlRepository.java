package com.nambb.socialindex.adapter.out.persistence.mysql.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMysqlRepository extends JpaRepository<CategoryEntity, Long> {
}
