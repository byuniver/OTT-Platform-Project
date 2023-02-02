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

public class Romance {
	public Romance() {
		// TODO Auto-generated constructor stub
		Frame f = new Frame("Romance");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 1000);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// ��ȭ ������
		JButton btn_Romance1 = new JButton(new ImageIcon("�̹���/�θǽ�_���� ��ȥ��.png"));
		JButton btn_Romance2 = new JButton(new ImageIcon("�̹���/�θǽ�_����ҳ�.png"));
		JButton btn_Romance3 = new JButton(new ImageIcon("�̹���/�θǽ�_��â��.png"));
		JButton btn_Romance4 = new JButton(new ImageIcon("�̹���/�θǽ�_��Ƽ�λ��̵�.png"));

		// ������ ũ��
		btn_Romance1.setBounds(50, 270, 250, 330);
		btn_Romance2.setBounds(330, 270, 250, 330);
		btn_Romance3.setBounds(50, 630, 250, 330);
		btn_Romance4.setBounds(330, 630, 250, 330);

		// �߰�
		f.add(btn_Romance1);
		f.add(btn_Romance2);
		f.add(btn_Romance3);
		f.add(btn_Romance4);

		// �ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// �ܰ��� �����
		btn_Romance1.setBorderPainted(false);
		btn_Romance2.setBorderPainted(false);
		btn_Romance3.setBorderPainted(false);
		btn_Romance4.setBorderPainted(false);

		// ���
		ImageIcon img = new ImageIcon("�̹���/�θǽ���ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		// ���� ��ȥ�� ����
		btn_Romance1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_YourWedding();
				f.dispose();
			}

		});

		// ����ҳ� ����
		btn_Romance2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_WolfBoy();
				f.dispose();
			}

		});

		// ��â�� ����
		btn_Romance3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_Love911();
				f.dispose();
			}

		});

		// ��Ƽ�λ��̵� ����
		btn_Romance4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_TheBeautyInside();
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

		// ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// ���� ����? �˾�â
				new PupupFrame();
			}
		});
	}
}
