package com.lixing.service;

import com.lixing.pojo.SolrData;
import org.apache.solr.client.solrj.impl.HttpSolrServer;

import java.util.List;

public interface SolrService {

    List<SolrData> getAllSolrData();

    boolean dataFromDB2Solr();

    List<SolrData> getDataFromSolr(String keywords, int pageNum, int pagesize);
}
