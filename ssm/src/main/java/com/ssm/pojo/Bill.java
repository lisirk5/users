package com.ssm.pojo;
import java.math.BigDecimal;
import java.util.Date;

    public class Bill {
        private Integer id;

        private String billcode;

        private String productname;
        private String providername;

        private String productdesc;

        private String productunit;

        private BigDecimal productcount;

        private BigDecimal totalprice;

        private Integer ispayment = 0;

        private Long createdby;

        private Date creationdate;

        private Long modifyby;

        private Date modifydate;

        private Long providerid;

        public String getProvidername() {
            return providername;
        }

        public void setProvidername(String providername) {
            this.providername = providername;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getBillcode() {
            return billcode;
        }

        public void setBillcode(String billcode) {
            this.billcode = billcode == null ? null : billcode.trim();
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname == null ? null : productname.trim();
        }

        public String getProductdesc() {
            return productdesc;
        }

        public void setProductdesc(String productdesc) {
            this.productdesc = productdesc == null ? null : productdesc.trim();
        }

        public String getProductunit() {
            return productunit;
        }

        public void setProductunit(String productunit) {
            this.productunit = productunit == null ? null : productunit.trim();
        }

        public BigDecimal getProductcount() {
            return productcount;
        }

        public void setProductcount(BigDecimal productcount) {
            this.productcount = productcount;
        }

        public BigDecimal getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(BigDecimal totalprice) {
            this.totalprice = totalprice;
        }

        public Integer getIspayment() {
            return ispayment;
        }

        public void setIspayment(Integer ispayment) {
            this.ispayment = ispayment;
        }

        public Long getCreatedby() {
            return createdby;
        }

        public void setCreatedby(Long createdby) {
            this.createdby = createdby;
        }

        public Date getCreationdate() {
            return creationdate;
        }

        public void setCreationdate(Date creationdate) {
            this.creationdate = creationdate;
        }

        public Long getModifyby() {
            return modifyby;
        }

        public void setModifyby(Long modifyby) {
            this.modifyby = modifyby;
        }

        public Date getModifydate() {
            return modifydate;
        }

        public void setModifydate(Date modifydate) {
            this.modifydate = modifydate;
        }

        public Long getProviderid() {
            return providerid;
        }

        public void setProviderid(Long providerid) {
            this.providerid = providerid;
        }

        @Override
        public String toString() {
            return "SmbmsBill{" +
                    "id=" + id +
                    ", billcode='" + billcode + '\'' +
                    ", productname='" + productname + '\'' +
                    ", providername='" + providername + '\'' +
                    ", productdesc='" + productdesc + '\'' +
                    ", productunit='" + productunit + '\'' +
                    ", productcount=" + productcount +
                    ", totalprice=" + totalprice +
                    ", ispayment=" + ispayment +
                    ", createdby=" + createdby +
                    ", creationdate=" + creationdate +
                    ", modifyby=" + modifyby +
                    ", modifydate=" + modifydate +
                    ", providerid=" + providerid +
                    '}';
        }
    }