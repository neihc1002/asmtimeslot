package com.asm.timeslot.model;

import com.asm.timeslot.entity.Class;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassModel extends PagingAndSortingRepository<Class,String> {
    Class findClassById(String id);
}
