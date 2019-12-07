package com.lixing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolrData {
    private String id;
    private String title;
    private long price;
    private String sellPoint;
    private String image;
    private String catName;
    private String itemDesc;
}
