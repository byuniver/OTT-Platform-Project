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

public class Comedy {
		public Comedy() {
			// TODO Auto-generated constructor stub
		Frame f = new Frame("Comedy");
		f.setLayout(null);
		f.setBounds( 500, 600, 630, 1000);
		f.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		   f.setLocationRelativeTo(null);//â�� ��� ������
		//��ȭ ������
		JButton btn_Comedy1 = new JButton(new ImageIcon("�̹���/�ڹ̵�_���ӽ�ĵ��.png"));
		JButton btn_Comedy2 = new JButton(new ImageIcon("�̹���/�ڹ̵�_��������.png"));
		JButton btn_Comedy3 = new JButton(new ImageIcon("�̹���/�ڹ̵�_����.png"));
		JButton btn_Comedy4 = new JButton(new ImageIcon("�̹���/�ڹ̵�_�ǲ��� û��.png"));
		
		//������ ũ��
		btn_Comedy1.setBounds(50, 270, 250, 330);
		btn_Comedy2.setBounds(330, 270, 250, 330);
		btn_Comedy3.setBounds(50, 630, 250, 330);
		btn_Comedy4.setBounds(330, 630, 250, 330);
		
		//�߰�
		f.add(btn_Comedy1);
		f.add(btn_Comedy2);
		f.add(btn_Comedy3);
		f.add(btn_Comedy4);
		
		//�ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);
		
		//�ܰ��� �����
		btn_Comedy1.setBorderPainted(false);
		btn_Comedy2.setBorderPainted(false);
		btn_Comedy3.setBorderPainted(false);
		btn_Comedy4.setBorderPainted(false);
		
		//���
		ImageIcon img = new ImageIcon("�̹���/�ڹ̵�ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);
		
		// ���ӽ�ĵ�� ����
		btn_Comedy1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_SpeedScanda();
				f.dispose();
			}

		});
		
		// �������� ����
		btn_Comedy2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_ExtremeJob();
				f.dispose();
			}

		});
		
		// ���� ����
		btn_Comedy3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_Twenty();
				f.dispose();
			}

		});
		
		// �ǲ��� û�� ����
		btn_Comedy4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_HotYoungBloods();
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
