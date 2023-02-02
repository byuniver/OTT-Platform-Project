package movie;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import itving.Kategorie;
import itving.PupupFrame;

public class Animation {
		public Animation() {
			// TODO Auto-generated constructor stub
		Frame f = new Frame("Animation");
		f.setLayout(null);
		f.setBounds( 500, 600, 630, 1000);
		f.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		   f.setLocationRelativeTo(null);//â�� ��� ������
		//��ȭ ������
		JButton btn_animation1 = new JButton(new ImageIcon("�̹���/�ִ�_������� ����.png"));
		JButton btn_animation2 = new JButton(new ImageIcon("�̹���/�ִ�_�������� ����.png"));
		JButton btn_animation3 = new JButton(new ImageIcon("�̹���/�ִ�_���� ġ������ ���Ҹ�.png"));
		JButton btn_animation4 = new JButton(new ImageIcon("�̹���/�ִ�_�̿��� �����.png"));
		
		//������ ũ��
		btn_animation1.setBounds(50, 270, 250, 330);
		btn_animation2.setBounds(330, 270, 250, 330);
		btn_animation3.setBounds(50, 630, 250, 330);
		btn_animation4.setBounds(330, 630, 250, 330);
		
		//�߰�
		f.add(btn_animation1);
		f.add(btn_animation2);
		f.add(btn_animation3);
		f.add(btn_animation4);
		
		//�ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);
		
		//�ܰ��� �����
		btn_animation1.setBorderPainted(false);
		btn_animation2.setBorderPainted(false);
		btn_animation3.setBorderPainted(false);
		btn_animation4.setBorderPainted(false);
		
		//���
		ImageIcon img = new ImageIcon("�̹���/�ִϿ�ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);
		
		// ������� ���� ����
				btn_animation1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new Ani_TheCatReturns();
						f.dispose();
					}

				});
				
				// �������� ���� ����
				btn_animation2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new Ani_Ponyo();
						f.dispose();
					}

				});
				
				// ���� ġ������ ���Ҹ� ����
				btn_animation3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new Ani_SenAndChihiro();
						f.dispose();
					}

				});
				
				// �̿��� ����� ����
				btn_animation4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new Ani_Totoro();
						f.dispose();
					}

				});
		
				// �ڷΰ��� 
				btn_logout.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new Kategorie();
						f.dispose();
					}
				});
				
		f.setVisible(true);
		
		//����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//���� ����? �˾�â
				new PupupFrame();
			}
		});
		}
}
