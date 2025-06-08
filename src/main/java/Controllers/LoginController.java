/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.LoginView;
import service.AuthService;
import Models.TaiKhoan;
import main.qlsinhvien.AdminMainMenu;
import main.qlsinhvien.StudentMainMenu;

/**
 *
 * @author LNV
 */
public class LoginController {

    private final LoginView view;
    private final AuthService authService;

    public LoginController(LoginView view) {
        this.view = view;
        this.authService = new AuthService();
        this.view.addLoginListener(e -> handleLogin());

    }

    public void handleLogin() {
        String user = view.getUsername();
        String pass = view.getPassword();

        if (user.isEmpty() || pass.isEmpty()) {
            view.showMessage("Vui lòng nhập tài khoản và mật khẩu.");
            return;
        }

        try {
            TaiKhoan acc = authService.login(user, pass);
            if (acc != null) {
                view.showMessage("Đăng nhập thành công với vai trò: " + acc.getRole());
                view.dispose();

                if ("admin".equalsIgnoreCase(acc.getRole())) {
                    new AdminMainMenu().setVisible(true);
                } else if ("sinhvien".equalsIgnoreCase(acc.getRole())) {
                    new StudentMainMenu().setVisible(true);
                }
            } else {
                view.showMessage("Sai tài khoản hoặc mật khẩu!");
            }
        } catch (Exception e) {
            view.showMessage("Lỗi: " + e.getMessage());
        }
    }
}
