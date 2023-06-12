package org.jasonkung0211.model;

import org.jasonkung0211.Utils.ExcelColumn;

import java.text.DateFormat;
import java.time.LocalDateTime;

public class Car {
    @ExcelColumn(name = "Manufacturer")
    public String manufacturer;

    @ExcelColumn(name = "Model")
    public String model;

    @ExcelColumn(name = "Color")
    public String color;

    @ExcelColumn(name = "Year", numberFormat = "0")
    public Integer year;

    @ExcelColumn(name = "Price", numberFormat = "$#,##0.00")
    public Double price;

    @ExcelColumn(name = "Date", numberFormat = "YYYY-MM-DD")
    public java.util.Date date;

    @ExcelColumn(name = "Available")
    public Boolean available;

    public String toString() {
        String result = ""
                + "Manufacturer=" + this.manufacturer
                + " Model=" + this.model
                + " Color=" + this.color
                + " Year=" + this.year
                + " Price=" + this.price
                + " Date=" + this.date
                + " Available=" + this.available
                + "";
        return result;
    }
}
