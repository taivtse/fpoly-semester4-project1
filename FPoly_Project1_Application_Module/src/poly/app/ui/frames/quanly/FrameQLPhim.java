/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.app.ui.frames.quanly;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import poly.app.core.daoimpl.PhimDaoImpl;
import poly.app.core.entities.Phim;
import poly.app.core.helper.DialogHelper;
import poly.app.ui.custom.ClosableTabbedPane;
import poly.app.ui.dialogs.capnhat.DialogCapNhatPhim;
import poly.app.ui.dialogs.them.DialogThemPhim;
import poly.app.ui.utils.TableRendererUtil;

/**
 *
 * @author vothanhtai
 */
public class FrameQLPhim extends javax.swing.JFrame  implements ClosableTabbedPane.ClosableTabbedPaneMethod{

    List<Phim> listPhim;
    Map<String, Phim> mapPhim = new TreeMap<>();

    public FrameQLPhim() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setTitle("Quản lý phim");
        reRenderUI();
    }

    private void reRenderUI() {
        //        Render lại giao diện cho table
        TableRendererUtil tblRenderer = new TableRendererUtil(tblPhim);
        tblRenderer.setCellEditable(false);
        tblRenderer.changeHeaderStyle();

        tblRenderer.setColoumnWidthByPersent(0, 5);
        tblRenderer.setColoumnWidthByPersent(2, 35);

        tblRenderer.setColumnAlignment(1, TableRendererUtil.CELL_ALIGN_CENTER);
        tblRenderer.setColumnAlignment(3, TableRendererUtil.CELL_ALIGN_RIGHT);
        tblRenderer.setColumnAlignment(4, TableRendererUtil.CELL_ALIGN_CENTER);
        tblRenderer.setColumnAlignment(5, TableRendererUtil.CELL_ALIGN_CENTER);
    }

    public JPanel getMainPanel() {
        synchronizedData();
        return this.pnlMain;
    }
    
    public void synchronizedData(){
        this.loadAllDataToTable();
        loadDataToTable(searchAdvance());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkTenPhim = new javax.swing.JCheckBox();
        chkKhoangThoiGian = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        dcTuNgay = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dcDenNgay = new com.toedter.calendar.JDateChooser();
        txtTenPhim = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhim = new javax.swing.JTable();
        btnCollapse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 83, 104));
        jLabel1.setText("Tra cứu phim");

        chkTenPhim.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        chkTenPhim.setSelected(true);
        chkTenPhim.setText("Theo tên phim");
        chkTenPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTenPhimActionPerformed(evt);
            }
        });

        chkKhoangThoiGian.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        chkKhoangThoiGian.setText("Theo ngày công chiếu");
        chkKhoangThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKhoangThoiGianActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày");

        dcTuNgay.setDateFormatString("dd-MM-yyyy");
        dcTuNgay.setEnabled(false);
        dcTuNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcTuNgayPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");

        dcDenNgay.setDateFormatString("dd-MM-yyyy");
        dcDenNgay.setEnabled(false);
        dcDenNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcDenNgayPropertyChange(evt);
            }
        });

        txtTenPhim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenPhimKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(chkKhoangThoiGian)
                                    .addComponent(chkTenPhim))))
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenPhim))))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(chkTenPhim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(chkKhoangThoiGian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setOpaque(false);

        btnThem.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnSua.setText("Cập nhật");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        tblPhim.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        tblPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã phim", "Tên phim", "Thời lượng", "Giới hạn tuổi", "Ngày chiếu", "Ngôn ngữ", "Quốc gia", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhim.setRowHeight(20);
        tblPhim.setSelectionBackground(new java.awt.Color(96, 116, 129));
        tblPhim.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPhim.setShowHorizontalLines(false);
        tblPhim.setShowVerticalLines(false);
        tblPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhimMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhim);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        btnCollapse.setBackground(new java.awt.Color(52, 83, 104));
        btnCollapse.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCollapse.setForeground(new java.awt.Color(255, 255, 255));
        btnCollapse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCollapse.setText("<<");
        btnCollapse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCollapse.setOpaque(true);
        btnCollapse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCollapseMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnCollapse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnCollapse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollapseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCollapseMouseReleased
        if (btnCollapse.getText().equals("<<")) {
            jPanel2.setVisible(false);
            btnCollapse.setText(">>");
        } else {
            jPanel2.setVisible(true);
            btnCollapse.setText("<<");
        }
    }//GEN-LAST:event_btnCollapseMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadAllDataToTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int beforeInsertSize = listPhim.size();

        new DialogThemPhim(this, true).setVisible(true);
        loadAllDataToTable();

        if (beforeInsertSize != listPhim.size()) {
            int lastIndex = tblPhim.getRowCount() - 1;
            tblPhim.setRowSelectionInterval(lastIndex, lastIndex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhimMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblPhim.getSelectedRow();
            String id = tblPhim.getValueAt(index, 1) + "";
            new DialogCapNhatPhim(this, true, id).setVisible(true);
            listPhim = new PhimDaoImpl().getPhimHienCo();
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_tblPhimMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int index = tblPhim.getSelectedRow();
        if (index < 0) {
            new DialogHelper().message(this, "Vui lòng chọn phim!", DialogHelper.ERROR_MESSAGE);
        } else {
            String id = tblPhim.getValueAt(index, 1) + "";
            new DialogCapNhatPhim(this, true, id).setVisible(true);
            loadAllDataToTable();

            for (int i = 0; i < tblPhim.getRowCount(); i++) {
                String currentKey = tblPhim.getValueAt(i, 1).toString();
                if (currentKey.equals(id)) {
                    tblPhim.setRowSelectionInterval(i, i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        boolean checkDelete = DialogHelper.confirm(this, "Bạn chắc chắn muốn xóa phim?");
        if (!checkDelete) {
            return;
        }
        int index = tblPhim.getSelectedRow();
        if (index >= 0) {
            if (deletePhim(index)) {
                listPhim = new PhimDaoImpl().getPhimHienCo();
                loadDataToTable(searchAdvance());
                new DialogHelper().message(this, "Xóa dữ liệu thành công!", DialogHelper.INFORMATION_MESSAGE);
            } else {
                new DialogHelper().message(this, "Xóa dữ liệu thất bại!", DialogHelper.ERROR_MESSAGE);
            }
        } else {
            new DialogHelper().message(this, "Vui lòng chọn phim!", DialogHelper.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void chkTenPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTenPhimActionPerformed
        // TODO add your handling code here:
        if (chkTenPhim.isSelected()) {
            txtTenPhim.setEnabled(true);
        } else {
            txtTenPhim.setEnabled(false);
            txtTenPhim.setText("");
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_chkTenPhimActionPerformed

    private void chkKhoangThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKhoangThoiGianActionPerformed
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            dcTuNgay.setEnabled(true);
            dcDenNgay.setEnabled(true);
            dcTuNgay.setDate(new Date());
            dcDenNgay.setDate(new Date());
        } else {
            dcTuNgay.setDate(null);
            dcDenNgay.setDate(null);
            dcTuNgay.setEnabled(false);
            dcDenNgay.setEnabled(false);
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_chkKhoangThoiGianActionPerformed

    private void dcTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcTuNgayPropertyChange
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            Date min = dcTuNgay.getDate();
            Date max = dcDenNgay.getDate();
            if (min != null && max != null) {
                if (min.compareTo(max) > 0) {
                    dcTuNgay.setDate(max);
                }
            }
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_dcTuNgayPropertyChange

    private void dcDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcDenNgayPropertyChange
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            Date min = dcTuNgay.getDate();
            Date max = dcDenNgay.getDate();
            if (min != null && max != null) {
                if (min.compareTo(max) > 0) {
                    dcDenNgay.setDate(min);
                }
            }
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_dcDenNgayPropertyChange

    private void txtTenPhimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenPhimKeyReleased
        loadDataToTable(searchAdvance());
    }//GEN-LAST:event_txtTenPhimKeyReleased

    public Map<String, Phim> searchAdvance() {
        Map<String, Phim> mapTimKiem = new TreeMap<>();
        Date min = dcTuNgay.getDate(), max = dcDenNgay.getDate();

        min = min == null ? dcTuNgay.getMinSelectableDate() : min;
        max = max == null ? dcDenNgay.getMaxSelectableDate() : max;

        LocalDate localDate = min.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        min = java.sql.Date.valueOf(localDate);

        localDate = max.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        max = java.sql.Date.valueOf(localDate);

        for (Map.Entry<String, Phim> phim : mapPhim.entrySet()) {
            if (phim.getValue().getTen().toLowerCase().contains(txtTenPhim.getText().toLowerCase())
                    && phim.getValue().getNgayCongChieu().compareTo(min) >= 0
                    && phim.getValue().getNgayCongChieu().compareTo(max) <= 0) {
                mapTimKiem.put(phim.getValue().getId(), phim.getValue());
            }
        }
        return mapTimKiem;
    }

    public void loadDataToTable(Map<String, Phim> map) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        DefaultTableModel modelTable = (DefaultTableModel) tblPhim.getModel();
        modelTable.setRowCount(0);
        int i = 1;
        for (Map.Entry<String, Phim> p : map.entrySet()) {
            Object[] record = new Object[]{
                i++,
                p.getKey(),
                p.getValue().getTen(),
                p.getValue().getThoiLuong(),
                p.getValue().getGioiHanTuoi(),
                sdf.format(p.getValue().getNgayCongChieu()),
                p.getValue().getNgonNgu(),
                p.getValue().getQuocGia(),
                p.getValue().getTrangThai()
            };

            modelTable.addRow(record);
        }
    }

    public boolean deletePhim(int id) {
        Phim phim = listPhim.get(id);
        phim.setDaXoa(true);
        try {
            return new PhimDaoImpl().update(phim);
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void loadAllDataToTable() {
        listPhim = new PhimDaoImpl().getPhimHienCo();
        for (Phim phim : listPhim) {
            mapPhim.put(phim.getId(), phim);
        }
        loadDataToTable(mapPhim);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameQLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameQLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameQLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameQLPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameQLPhim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCollapse;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox chkKhoangThoiGian;
    private javax.swing.JCheckBox chkTenPhim;
    private com.toedter.calendar.JDateChooser dcDenNgay;
    private com.toedter.calendar.JDateChooser dcTuNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable tblPhim;
    private javax.swing.JTextField txtTenPhim;
    // End of variables declaration//GEN-END:variables
}
