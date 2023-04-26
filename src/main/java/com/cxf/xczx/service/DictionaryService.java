package com.cxf.xczx.service;


import com.cxf.xczx.pojo.Dictionary;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DictionaryService {
    List<Dictionary> getAllDictionary();
}
