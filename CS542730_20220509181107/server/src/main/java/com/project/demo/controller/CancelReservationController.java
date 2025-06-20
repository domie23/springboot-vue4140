package com.project.demo.controller;

import com.project.demo.entity.CancelReservation;
import com.project.demo.service.CancelReservationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *取消预约：(CancelReservation)表控制层
 *
 */
@RestController
@RequestMapping("/cancel_reservation")
public class CancelReservationController extends BaseController<CancelReservation,CancelReservationService> {

    /**
     *取消预约对象
     */
    @Autowired
    public CancelReservationController(CancelReservationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
