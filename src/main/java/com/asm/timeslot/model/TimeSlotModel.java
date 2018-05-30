package com.asm.timeslot.model;

import com.asm.timeslot.entity.TimeSlots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimeSlotModel extends PagingAndSortingRepository<TimeSlots,Integer> {
}
