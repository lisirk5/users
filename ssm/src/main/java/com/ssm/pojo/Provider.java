package com.ssm.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Provider {
    private Long id;

    private String procode;

    private String proname;

    private String prodesc;

    private String procontact;

    private String prophone;

    private String proaddress;

    private String profax;

    private Long createdby;

    private Date creationdate;

    private Date modifydate;

    private Long modifyby;
}
