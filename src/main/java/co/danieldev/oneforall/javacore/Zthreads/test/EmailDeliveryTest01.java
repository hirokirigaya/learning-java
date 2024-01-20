package co.danieldev.oneforall.javacore.Zthreads.test;

import co.danieldev.oneforall.javacore.Zthreads.domain.Members;
import co.danieldev.oneforall.javacore.Zthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread kirito = new Thread(new EmailDeliveryService(members), "Kirito");
        Thread asuna = new Thread(new EmailDeliveryService(members), "Asuna");

        kirito.start();
        asuna.start();

        while (true){
            String email = JOptionPane.showInputDialog("Please type your email");
            if(email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
