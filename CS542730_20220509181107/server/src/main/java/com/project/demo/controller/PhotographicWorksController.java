package com.project.demo.controller;

import com.project.demo.entity.PhotographicWorks;
import com.project.demo.service.PhotographicWorksService;
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
 *摄影作品：(PhotographicWorks)表控制层
 *
 */
@RestController
@RequestMapping("/photographic_works")
public class PhotographicWorksController extends BaseController<PhotographicWorks,PhotographicWorksService> {

    /**
     *摄影作品对象
     */
    @Autowired
    public PhotographicWorksController(PhotographicWorksService service) {
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
