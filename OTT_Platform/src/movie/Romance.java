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
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		// 영화 포스터
		JButton btn_Romance1 = new JButton(new ImageIcon("이미지/로맨스_너의 결혼식.png"));
		JButton btn_Romance2 = new JButton(new ImageIcon("이미지/로맨스_늑대소년.png"));
		JButton btn_Romance3 = new JButton(new ImageIcon("이미지/로맨스_반창꼬.png"));
		JButton btn_Romance4 = new JButton(new ImageIcon("이미지/로맨스_뷰티인사이드.png"));

		// 포스터 크기
		btn_Romance1.setBounds(50, 270, 250, 330);
		btn_Romance2.setBounds(330, 270, 250, 330);
		btn_Romance3.setBounds(50, 630, 250, 330);
		btn_Romance4.setBounds(330, 630, 250, 330);

		// 추가
		f.add(btn_Romance1);
		f.add(btn_Romance2);
		f.add(btn_Romance3);
		f.add(btn_Romance4);

		// 뒤로가기
		JButton btn_logout = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// 외곽선 지우기
		btn_Romance1.setBorderPainted(false);
		btn_Romance2.setBorderPainted(false);
		btn_Romance3.setBorderPainted(false);
		btn_Romance4.setBorderPainted(false);

		// 배경
		ImageIcon img = new ImageIcon("이미지/로맨스영화배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		// 너의 결혼식 선택
		btn_Romance1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_YourWedding();
				f.dispose();
			}

		});

		// 늑대소년 선택
		btn_Romance2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_WolfBoy();
				f.dispose();
			}

		});

		// 반창꼬 선택
		btn_Romance3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_Love911();
				f.dispose();
			}

		});

		// 뷰티인사이드 선택
		btn_Romance4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_TheBeautyInside();
				f.dispose();
			}

		});

		// 뒤로가기
		btn_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Kategorie();
				f.dispose();
			}
		});

		f.setVisible(true);

		// 종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 정말 종료? 팝업창
				new PupupFrame();
			}
		});
	}
}
