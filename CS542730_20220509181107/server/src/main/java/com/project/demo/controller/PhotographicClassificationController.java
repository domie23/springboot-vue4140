package com.project.demo.controller;

import com.project.demo.entity.PhotographicClassification;
import com.project.demo.service.PhotographicClassificationService;
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
 *摄影分类：(PhotographicClassification)表控制层
 *
 */
@RestController
@RequestMapping("/photographic_classification")
public class PhotographicClassificationController extends BaseController<PhotographicClassification,PhotographicClassificationService> {

    /**
     *摄影分类对象
     */
    @Autowired
    public PhotographicClassificationController(PhotographicClassificationService service) {
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
