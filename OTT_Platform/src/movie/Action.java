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

public class Action {
	public Action() {
		// TODO Auto-generated constructor stub
		Frame f = new Frame("Action");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 1000);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������
		// ��ȭ ������
		JButton btn_action1 = new JButton(new ImageIcon("�̹���/�׼�_����.png"));
		JButton btn_action2 = new JButton(new ImageIcon("�̹���/�׼�_������.png"));
		JButton btn_action3 = new JButton(new ImageIcon("�̹���/�׼�_����ġ.png"));
		JButton btn_action4 = new JButton(new ImageIcon("�̹���/�׼�_������,���۳�,�̻��ѳ�.png"));

		// ������ ũ��
		btn_action1.setBounds(50, 270, 250, 330);
		btn_action2.setBounds(330, 270, 250, 330);
		btn_action3.setBounds(50, 630, 250, 330);
		btn_action4.setBounds(330, 630, 250, 330);

		// �߰�
		f.add(btn_action1);
		f.add(btn_action2);
		f.add(btn_action3);
		f.add(btn_action4);

		// �ڷΰ���
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// �ܰ��� �����
		btn_action1.setBorderPainted(false);
		btn_action2.setBorderPainted(false);
		btn_action3.setBorderPainted(false);
		btn_action4.setBorderPainted(false);

		// ���
		ImageIcon img = new ImageIcon("�̹���/�׼ǿ�ȭ���.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		// ���� ����
		btn_action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheAgeOfShadows();
				f.dispose();
			}

		});
		// ������ ����
		btn_action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_SecretReunion();
				f.dispose();
			}

		});
		// ����ġ ����
		btn_action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_JeonWoochi();
				f.dispose();
			}

		});
		// ������,���۳�,�̻��ѳ� ����
		btn_action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheGoodTheBadTheWeird();
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
