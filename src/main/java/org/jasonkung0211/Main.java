package org.jasonkung0211;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jasonkung0211.Utils.PoiUtils;
import org.jasonkung0211.model.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.manufacturer = "Mercedes-Benz";
        car.model = "S 560 4Matic";
        car.color = "Bordeaux";
        car.year = 2019;
        car.price = 78456.78;
        car.date = new java.util.Date();
        car.available = true;

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        PoiUtils.toSheet(sheet, cars);

        FileOutputStream out = new FileOutputStream("ExcelCars.xlsx");
        wb.write(out);
        out.close();
        wb.close();

        Workbook workbook = WorkbookFactory.create(new FileInputStream("ExcelCars.xlsx"));
        sheet = workbook.getSheetAt(0);
        cars = PoiUtils.sheetTo(sheet, Car.class);
        System.out.println(cars);
    }

}