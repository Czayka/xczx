package com.cxf.xczx.controller;

import com.cxf.xczx.pojo.Dictionary;
import com.cxf.xczx.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "字典查询接口", tags = "字典查询接口")
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;


    @ApiOperation("字典查询接口")
    @GetMapping("/all")
    public ResponseEntity<List<Dictionary>> getAllDictionary(){
        return ResponseEntity.ok(dictionaryService.getAllDictionary());
    }
}
