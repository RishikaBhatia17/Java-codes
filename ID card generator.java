/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idcardgenerator;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 *
 * @author rishika_bhatia17
 */
public class IDCardGenerator extends Applet implements ActionListener {

    Label lblTitle, lblName, lblCourse, lblAdmnNo, lblDOB, lblFName, lblAdd, lblMNo;
    TextField txtName, txtCourse, txtAdmnNo, txtDOB, txtFName, txtAdd, txtMNo;
    Button cmdViewID;

    public void init() {
        setLayout(null);
        lblTitle = new Label("Enter Student’s Details ");
        lblName = new Label("Name: ");
        lblCourse = new Label("Course : ");
        lblAdmnNo = new Label("Admission No. : ");
        lblDOB = new Label("Date of Birth : ");
        lblFName = new Label("Father's Name : ");
        lblAdd = new Label("Address : ");
        lblMNo = new Label("Contact No. : ");
        txtName = new TextField();
        txtCourse = new TextField();
        txtAdmnNo = new TextField();
        txtDOB = new TextField();
        txtFName = new TextField();
        txtAdd = new TextField();
        txtMNo = new TextField();
        cmdViewID = new Button("View Student ID Card");
        lblTitle.setBounds(100, 0, 200, 20);
        lblName.setBounds(0, 25, 100, 20);
        txtName.setBounds(120, 25, 200, 20);
        lblCourse.setBounds(0, 50, 100, 20);
        txtCourse.setBounds(120, 50, 200, 20);
        lblAdmnNo.setBounds(0, 75, 100, 20);
        txtAdmnNo.setBounds(120, 75, 200, 20);
        lblDOB.setBounds(0, 100, 100, 20);
        txtDOB.setBounds(120, 100, 200, 20);
        lblFName.setBounds(0, 125, 100, 20);
        txtFName.setBounds(120, 125, 200, 20);
        lblAdd.setBounds(0, 150, 100, 20);
        txtAdd.setBounds(120, 150, 200, 20);
        lblMNo.setBounds(0, 175, 100, 20);
        txtMNo.setBounds(120, 175, 200, 20);
        cmdViewID.setBounds(90, 210, 150, 30);
        add(lblTitle);
        add(lblCourse);
        add(txtCourse);
        add(lblName);
        add(txtName);
        add(lblAdmnNo);
        add(txtAdmnNo);
        add(lblDOB);
        add(txtDOB);
        add(lblFName);
        add(txtFName);
        add(lblAdd);
        add(txtAdd);
        add(lblMNo);
        add(txtMNo);
        add(cmdViewID);
        cmdViewID.addActionListener(this);
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    public void paint(Graphics g) {
        Color custColor = new Color(77, 0, 19);
        g.setColor(custColor);
        g.fillRoundRect(7, 280, 350, 57, 30, 30);
        g.fillRect(7, 290, 350, 47);
        g.setColor(Color.white);
        g.drawString("CLUSTER INNOVATION CENTRE", 90, 305);
        g.drawString("UNIVERSITY OF DELHI", 110, 325);
        g.setColor(Color.black);
        g.drawString("IDENTITY CARD", 125, 352);
        g.drawString("Name : " + txtName.getText(), 15, 367);
        g.drawString("Course : " + txtCourse.getText(), 15, 392);
        g.drawString("Admission No. :  " + txtAdmnNo.getText(), 15, 417);
        g.drawString("Date of Birth : " + txtDOB.getText(), 15, 442);
        g.drawString("Father's Name : " + txtFName.getText(), 15, 467);
        g.drawString("Address : " + txtAdd.getText(), 15, 492);
        g.drawString("Contact No. : " + txtMNo.getText(), 15, 517);
        g.drawRoundRect(7, 280, 350, 245, 30, 30);
    }
}
