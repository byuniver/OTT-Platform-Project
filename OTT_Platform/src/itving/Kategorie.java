package itving;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import movie.Action;
import movie.Animation;
import movie.Comedy;
import movie.Thriller;
import movie.Romance;
import movie.SF;

public class Kategorie {

	public Kategorie() {
		// TODO Auto-generated constructor stub

		Frame f = new Frame("�帣����");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 900);
		f.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);// â�� ��� ������

		JButton btn_action = new JButton(new ImageIcon("�̹���/�׼�.png"));
		JButton btn_comedy = new JButton(new ImageIcon("�̹���/�ڹ̵�.png"));
		JButton btn_romance = new JButton(new ImageIcon("�̹���/�θǽ�.png"));
		JButton btn_horror = new JButton(new ImageIcon("�̹���/����.png"));
		JButton btn_sf = new JButton(new ImageIcon("�̹���/SF.png"));
		JButton btn_animation = new JButton(new ImageIcon("�̹���/�ִ�.png"));
		JButton btn_logout = new JButton(new ImageIcon("�̹���/�ڷΰ���.png"));
		
		// ��ư ��ġ ���� 
		btn_action.setBounds(50, 325, 250, 150);
		btn_comedy.setBounds(330, 325, 250, 150);
		btn_romance.setBounds(50, 500, 250, 150);
		btn_horror.setBounds(330, 500, 250, 150);
		btn_sf.setBounds(50, 675, 250, 150);
		btn_animation.setBounds(330, 675, 250, 150);
		btn_logout.setBounds(50, 75, 50, 50);
		
		//��ư ����
		f.add(btn_action);
		f.add(btn_comedy);
		f.add(btn_romance);
		f.add(btn_horror);
		f.add(btn_sf);
		f.add(btn_animation);
		f.add(btn_logout);

		// �ܰ��� �����
		btn_action.setBorderPainted(false);
		btn_comedy.setBorderPainted(false);
		btn_romance.setBorderPainted(false);
		btn_horror.setBorderPainted(false);
		btn_sf.setBorderPainted(false);
		btn_animation.setBorderPainted(false);
		btn_logout.setBorderPainted(false);

		// ���뿵�� ä��� ����
		btn_action.setContentAreaFilled(false);
		btn_comedy.setContentAreaFilled(false);
		btn_romance.setContentAreaFilled(false);
		btn_horror.setContentAreaFilled(false);
		btn_sf.setContentAreaFilled(false);
		btn_animation.setContentAreaFilled(false);
		btn_logout.setContentAreaFilled(false);

		ImageIcon img = new ImageIcon("�̹���/ī�װ����.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 900);
		f.add(jl);

		f.setVisible(true);

		// �׼� ��ȭ ����
		btn_action.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action();
				f.dispose();
			}

		});
		// �ڹ̵� ��ȭ ����
		btn_comedy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy();
				f.dispose();
			}

		});
		// �θǽ� ��ȭ ����
		btn_romance.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance();
				f.dispose();
			}

		});
		// ȣ�� ��ȭ ����
		btn_horror.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller();
				f.dispose();
			}

		});
		// SF ��ȭ ����
		btn_sf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SF();
				f.dispose();
			}

		});
		// �ִ� ��ȭ ����
		btn_animation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Animation();
				f.dispose();
			}

		});

		btn_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new LogoMain();
			}

		});

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// ���� ����? �˾�â
				new PupupFrame();
			}
		});

	}
}
