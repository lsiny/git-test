package com.lixing.controller;

import com.ctc.wstx.util.StringUtil;
import com.lixing.pojo.SolrData;
import com.lixing.service.SolrService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class SolrDataController {
    @Autowired
    private SolrService solrService;

    @GetMapping("/SolrDatas")
    public List<SolrData> getAllSolrData(){
        return solrService.getAllSolrData();
    }

    @GetMapping("/dataFromDB2Solr")
    public boolean dataFromDB2Solr(){
        return solrService.dataFromDB2Solr();
    }

    @GetMapping("/search")
    public List<SolrData> getDataFromSolr(@RequestParam(value = "keywords",defaultValue = "") String keywords,
                                          @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                          @RequestParam(value = "pagesize",defaultValue = "10") int pagesize) throws UnsupportedEncodingException {
        if (!StringUtils.isNullOrEmpty(keywords)){
            keywords = new String(keywords.getBytes("ISO-8859-1"),"UTF-8");
        }
        System.out.println("111111111");
        return solrService.getDataFromSolr(keywords,pageNum,pagesize);
    }
}
