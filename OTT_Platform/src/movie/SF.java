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

public class SF {
	public SF() {
		// TODO Auto-generated constructor stub
		
		Frame f = new Frame("SF");
		f.setLayout(null);
		f.setBounds( 500, 600, 630, 1000);
		f.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		   f.setLocationRelativeTo(null);//â�� ��� ������
		//��ȭ ������
		JButton btn_sf1 = new JButton(new ImageIcon("�̹���/sf_��������.png"));
		JButton btn_sf2 = new JButton(new ImageIcon("�̹���/sf_�¸�ȣ.png"));
		JButton btn_sf3 = new JButton(new ImageIcon("�̹���/sf_�ζ�.png"));
		JButton btn_sf4 = new JButton(new ImageIcon("�̹���/sf_�ʴɷ���.png"));
		
		//������ ũ��
		btn_sf1.setBounds(50, 270, 250, 330);
		btn_sf2.setBounds(330, 270, 250, 330);
		btn_sf3.setBounds(50, 630, 250, 330);
		btn_sf4.setBounds(330, 630, 250, 330);
		
		//�߰�
		f.add(btn_sf1);
		f.add(btn_sf2);
		f.add(btn_sf3);
		f.add(btn_sf4);
		
		//�ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);
		
		//�ܰ��� �����
		btn_sf1.setBorderPainted(false);
		btn_sf2.setBorderPainted(false);
		btn_sf3.setBorderPainted(false);
		btn_sf4.setBorderPainted(false);
		
		//���
		ImageIcon img = new ImageIcon("�̹���/SF��ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);
		
		// �������� ����
		btn_sf1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new SF_SnowPiercer();
						f.dispose();
					}

				});
				
				// �¸�ȣ ����
		btn_sf2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new SF_SpaceSweepers();
						f.dispose();
					}

				});
				
				// �ζ� ����
		btn_sf3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new SF_ILLANG();
						f.dispose();
					}

				});
				
				// �ʴɷ��� ����
		btn_sf4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new SF_Haunters();
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
