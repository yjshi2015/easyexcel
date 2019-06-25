package com.alibaba.easyexcel.test.model;

import com.alibaba.excel.annotation.ExcelProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AssetsDetailVO extends BaseReadModel{

    @ExcelProperty(index = 0)
    private String ticketId;

    @ExcelProperty(index = 1)
    private String couponCode;

    @ExcelProperty(index = 2,format = "yyyy/MM/dd HH:mm:ss")
    private Date startTime;

    @ExcelProperty(index = 3,format = "yyyy/MM/dd HH:mm:ss")
    private Date endTime;

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }


    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return "tickentId:" + ticketId
                + ",coupon: " + couponCode
                + ",startTime: " + sdf.format(startTime)
                + ", endTime: " + sdf.format(endTime);
    }
}
