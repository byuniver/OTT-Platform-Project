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

public class Thriller {

	public Thriller() {
		// TODO Auto-generated constructor stub
		Frame f = new Frame("Thriller");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 1000);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// ��ȭ ������
		JButton btn_thriller1 = new JButton(new ImageIcon("�̹���/������_����������.png"));
		JButton btn_thriller2 = new JButton(new ImageIcon("�̹���/������_�.png"));
		JButton btn_thriller3 = new JButton(new ImageIcon("�̹���/������_������.png"));
		JButton btn_thriller4 = new JButton(new ImageIcon("�̹���/������_���ٲ���.png"));

		// ������ ũ��
		btn_thriller1.setBounds(50, 270, 250, 330);
		btn_thriller2.setBounds(330, 270, 250, 330);
		btn_thriller3.setBounds(50, 630, 250, 330);
		btn_thriller4.setBounds(330, 630, 250, 330);

		// �߰�
		f.add(btn_thriller1);
		f.add(btn_thriller2);
		f.add(btn_thriller3);
		f.add(btn_thriller4);

		// �ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// �ܰ��� �����
		btn_thriller1.setBorderPainted(false);
		btn_thriller2.setBorderPainted(false);
		btn_thriller3.setBorderPainted(false);
		btn_thriller4.setBorderPainted(false);

		// ���
		ImageIcon img = new ImageIcon("�̹���/��������ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		// ���������� ����
		btn_thriller1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_ThePriests();
				f.dispose();
			}

		});

		// � ����
		btn_thriller2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_TheWailing();
				f.dispose();
			}

		});

		// ������ ����
		btn_thriller3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_Gonjiam();
				f.dispose();
			}

		});

		// ���ٲ��� ����
		btn_thriller4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_HideAndSeek();
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
