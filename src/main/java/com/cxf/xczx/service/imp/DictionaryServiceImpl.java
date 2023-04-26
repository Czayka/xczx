package com.cxf.xczx.service.imp;

import com.cxf.xczx.mapper.DictionaryMapper;
import com.cxf.xczx.pojo.Dictionary;
import com.cxf.xczx.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> getAllDictionary() {
        return dictionaryMapper.selectList(null);
    }
}
