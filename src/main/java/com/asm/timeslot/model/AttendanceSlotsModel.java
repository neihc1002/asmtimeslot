package com.asm.timeslot.model;

import com.asm.timeslot.entity.AttendanceSlots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttendanceSlotsModel extends PagingAndSortingRepository<AttendanceSlots, Integer> {

}
