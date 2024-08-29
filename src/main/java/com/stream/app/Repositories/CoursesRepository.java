package com.stream.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stream.app.Entities.courses;

public interface CoursesRepository extends JpaRepository<courses, String> {
}
