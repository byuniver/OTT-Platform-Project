package itving;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PupupFrame {
	public PupupFrame() {
		
		Frame f = new Frame("����");
		f.setLayout(null);
		f.setBackground(new Color(56, 56, 56));
		f.setBounds(550, 550, 330, 200);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		
		Font font = new Font("", Font.BOLD, 20);
		
		Label q1 = new Label("���� �����Ͻðڽ��ϱ�??");
		q1.setForeground(Color.orange);
		q1.setBounds(30, 50, 250, 50);
		q1.setFont(font);
		f.add(q1);
		
		Button btn_exit = new Button("����");
		Button btn_cancel = new Button("���");
		
		btn_exit.setBounds(45, 110, 100, 50);
		btn_cancel.setBounds(185, 110, 100, 50);
		
		// ���� ��ư Ȱ��ȭ
		btn_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// ��� ��ư Ȱ��ȭ 
		btn_cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		f.add(btn_exit);
		f.add(btn_cancel);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}	
}