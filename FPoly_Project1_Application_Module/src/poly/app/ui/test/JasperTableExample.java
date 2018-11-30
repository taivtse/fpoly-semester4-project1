package poly.app.ui.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import poly.app.ui.custom.HoaDonReport;

public class JasperTableExample {

    public static void main(String[] args) {
        try {
            /* List to hold Items */
            List<HoaDonReport> listItems = new ArrayList<>();
            listItems.add(new HoaDonReport("ahihi", 10, 99, 999));
            

            /* Convert List to JRBeanCollectionDataSource */
            JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);

            /* Map to hold Jasper report Parameters */
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("ItemDataSource", itemsJRBean);
            parameters.put("InvoiceID", "HD9212341");
            parameters.put("EmployeeName", "Võ Thành Tài");
            parameters.put("CreatedDate", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));

            File f = new File("src/poly/app/ui/custom/HoaDonReportTemplate.jasper");
            if (!f.exists()) {
                JasperCompileManager.compileReportToFile("src/poly/app/ui/custom/HoaDonReportTemplate.jrxml", "src/poly/app/ui/custom/HoaDonReportTemplate.jasper");
                f = new File("src/poly/app/ui/custom/HoaDonReportTemplate.jasper");
            }
            
            JasperReport jr = (JasperReport) JRLoader.loadObject(f);


            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, parameters, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            ex.printStackTrace();
        } 
    }
}