package com.asm.timeslot.model;

import com.asm.timeslot.entity.Class;
import com.asm.timeslot.entity.Student;
import com.asm.timeslot.entity.Student_Class;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface Student_ClassModel extends PagingAndSortingRepository<Student_Class,Integer> {
    Page<Student_Class> findStudent_ClassByClassId(String s, Pageable pageable);
}
