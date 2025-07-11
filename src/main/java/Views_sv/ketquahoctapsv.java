/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views_sv;

import DTO.DiemSinhVienDTO;
import Models.HocKy;
import Models.SinhVien;
import Models.TaiKhoan;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LNV
 */
public class ketquahoctapsv extends javax.swing.JPanel {

    private java.util.HashMap<String, String> hkMap = new java.util.HashMap<>(); // key = tên hk, value = mã hk
    private java.util.HashMap<String, String> hkMapReverse = new java.util.HashMap<>();  // key = mã hk, value = tên hk
    private TaiKhoan tk;

    /**
     * Creates new form Ketquahoctapsv
     */
    public ketquahoctapsv() {
        initComponents();
        loadhocky();
    }

    public ketquahoctapsv(TaiKhoan tk) {
        initComponents();
        this.tk = tk;
        loadhocky();
        txtsv.setText(tk.getHoten());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttongtin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdiemhe10 = new javax.swing.JTextField();
        cbxhocky = new javax.swing.JComboBox<>();
        txtdiemhe4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnxemdiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtsv = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        txttongtin.setEditable(false);

        jLabel2.setText("Sinh viên: ");

        jLabel5.setText("Điểm trung bình hệ 10");

        jLabel4.setText("Chọn học kỳ:");

        jLabel6.setText("Điển trung bình hệ 4");

        txtdiemhe10.setEditable(false);

        cbxhocky.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn học kỳ---" }));

        txtdiemhe4.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Kết quả học tập");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ", "Điểm", "Điểm chữ", "Trang thái"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnxemdiem.setText("Xem điểm");
        btnxemdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemdiemActionPerformed(evt);
            }
        });

        jLabel3.setText("Tổng số tín");

        txtsv.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxhocky, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnxemdiem)
                            .addComponent(txtsv)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttongtin)
                            .addComponent(txtdiemhe10)
                            .addComponent(txtdiemhe4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxhocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnxemdiem)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtdiemhe10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdiemhe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private void loadhocky() {
        try {
            URL url = new URL("http://localhost:8080/api/hocky");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            Gson gson = new Gson();
            HocKy[] list = gson.fromJson(response.toString(), HocKy[].class);

            cbxhocky.removeAllItems();
            cbxhocky.addItem("---Chọn học kỳ---");

            for (HocKy hk : list) {
                cbxhocky.addItem(hk.getTenhk());
                hkMap.put(hk.getTenhk(), hk.getMahk());
                hkMapReverse.put(hk.getMahk(), hk.getTenhk());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi nạp dữ liệu học kỳ!");
        }
    }

    private void btnxemdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemdiemActionPerformed
        loadtb();
    }//GEN-LAST:event_btnxemdiemActionPerformed

    public void loadtb() {

        int hkIndex = cbxhocky.getSelectedIndex();

        if (hkIndex <= 0) {
            System.out.println("Vui lòng chọn học kỳ hợp lệ.");
            return;
        }
        String masv = tk.getUsername();
        String mahk = hkMap.get(cbxhocky.getSelectedItem().toString());

        try {

            String apiUrl = "http://localhost:8080/api/diem/sinhvien?masv=" + URLEncoder.encode(masv, "UTF-8")
                    + "&mahk=" + URLEncoder.encode(mahk, "UTF-8");

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP error: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                json.append(line);
            }
            conn.disconnect();

            Gson gson = new Gson();
            DiemSinhVienDTO[] diemList = gson.fromJson(json.toString(), DiemSinhVienDTO[].class);

            // Đổ vào JTable
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"Mã môn", "Tên môn", "SỐ TC", "Điểm", "Điểm chữ", "Trạng thái"}, 0
            );
            model.setRowCount(0);

            double tongDiem = 0;
            double tongDiemHe4 = 0;
            int tongTinChi = 0;

            for (DiemSinhVienDTO d : diemList) {
                double diem = d.getDiem();
                int tinchi = d.getSotinchi();
                tongDiem += diem * tinchi;
                tongDiemHe4 += chuyenDiemHe4(diem) * tinchi;
                tongTinChi += tinchi;

                String diemChu;
                String trangThai;

                if (diem >= 8.5) {
                    diemChu = "A";
                    trangThai = "Đạt";
                } else if (diem >= 7.0) {
                    diemChu = "B";
                    trangThai = "Đạt";
                } else if (diem >= 5.5) {
                    diemChu = "C";
                    trangThai = "Đạt";
                } else if (diem >= 4.0) {
                    diemChu = "D";
                    trangThai = "Không đạt";
                } else {
                    diemChu = "F";
                    trangThai = "Không đạt";
                }
                model.addRow(new Object[]{
                    d.getMamon(), d.getTenmon(), d.getSotinchi(), d.getDiem(), diemChu, trangThai
                });
            }
            double gpaHe10 = tongTinChi > 0 ? tongDiem / tongTinChi : 0;
            double gpaHe4 = tongTinChi > 0 ? tongDiemHe4 / tongTinChi : 0;

            jTable1.setModel(model);
            txtdiemhe10.setText(String.format("%.2f", gpaHe10));
            txtdiemhe4.setText(String.format("%.2f", gpaHe4));
            txttongtin.setText(String.valueOf(tongTinChi));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi tải dữ liệu điểm!");
        }
    }

    private double chuyenDiemHe4(double diem) {
        if (diem >= 8.5) {
            return 4.0;
        }
        if (diem >= 7.0) {
            return 3.0;
        }
        if (diem >= 5.5) {
            return 2.0;
        }
        if (diem >= 4.0) {
            return 1.0;
        }
        return 0.0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnxemdiem;
    private javax.swing.JComboBox<String> cbxhocky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdiemhe10;
    private javax.swing.JTextField txtdiemhe4;
    private javax.swing.JTextField txtsv;
    private javax.swing.JTextField txttongtin;
    // End of variables declaration//GEN-END:variables
}
