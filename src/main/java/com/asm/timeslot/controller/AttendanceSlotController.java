package com.asm.timeslot.controller;

import com.asm.timeslot.entity.AttendanceSlots;
import com.asm.timeslot.entity.Class;
import com.asm.timeslot.entity.Student_Class;
import com.asm.timeslot.entity.TimeSlots;
import com.asm.timeslot.model.AttendanceSlotsModel;
import com.asm.timeslot.model.ClassModel;
import com.asm.timeslot.model.Student_ClassModel;
import com.asm.timeslot.model.TimeSlotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.Optional;

@Controller
public class AttendanceSlotController {
    @Autowired
    private AttendanceSlotsModel attendanceSlotsModel;
    @Autowired
    private Student_ClassModel studentClassModel;
    @Autowired
    private ClassModel classModel;
    @RequestMapping(path = "/timeslot", method = RequestMethod.GET)
    public String getAttendanceSlotsModel(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        Page<AttendanceSlots> pagination = attendanceSlotsModel.findAll(PageRequest.of(page - 1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        return "timeslot";
    }
    @RequestMapping(path = "/details/{id}", method = RequestMethod.GET)
    public  String getAttendanceDetails(@PathVariable String id, Model model,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        Optional<Class> aClass = classModel.findById(id);
        if(aClass!=null){
            String classId = aClass.get().getId();
            Page<Student_Class> pagination = studentClassModel.findStudent_ClassByClassId(aClass.get().getId(),PageRequest.of(page - 1, limit));
            model.addAttribute("pagination", pagination);
            model.addAttribute("page", page);
            model.addAttribute("limit", limit);
        }
        return "details";
    }
}
