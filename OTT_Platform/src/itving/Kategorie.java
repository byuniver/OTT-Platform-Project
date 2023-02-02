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

		Frame f = new Frame("장르선택");
		f.setLayout(null);
		f.setBounds(500, 600, 630, 900);
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게

		JButton btn_action = new JButton(new ImageIcon("이미지/액션.png"));
		JButton btn_comedy = new JButton(new ImageIcon("이미지/코미디.png"));
		JButton btn_romance = new JButton(new ImageIcon("이미지/로맨스.png"));
		JButton btn_horror = new JButton(new ImageIcon("이미지/공포.png"));
		JButton btn_sf = new JButton(new ImageIcon("이미지/SF.png"));
		JButton btn_animation = new JButton(new ImageIcon("이미지/애니.png"));
		JButton btn_logout = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		
		// 버튼 위치 지정 
		btn_action.setBounds(50, 325, 250, 150);
		btn_comedy.setBounds(330, 325, 250, 150);
		btn_romance.setBounds(50, 500, 250, 150);
		btn_horror.setBounds(330, 500, 250, 150);
		btn_sf.setBounds(50, 675, 250, 150);
		btn_animation.setBounds(330, 675, 250, 150);
		btn_logout.setBounds(50, 75, 50, 50);
		
		//버튼 구현
		f.add(btn_action);
		f.add(btn_comedy);
		f.add(btn_romance);
		f.add(btn_horror);
		f.add(btn_sf);
		f.add(btn_animation);
		f.add(btn_logout);

		// 외곽선 지우기
		btn_action.setBorderPainted(false);
		btn_comedy.setBorderPainted(false);
		btn_romance.setBorderPainted(false);
		btn_horror.setBorderPainted(false);
		btn_sf.setBorderPainted(false);
		btn_animation.setBorderPainted(false);
		btn_logout.setBorderPainted(false);

		// 내용영역 채우기 안함
		btn_action.setContentAreaFilled(false);
		btn_comedy.setContentAreaFilled(false);
		btn_romance.setContentAreaFilled(false);
		btn_horror.setContentAreaFilled(false);
		btn_sf.setContentAreaFilled(false);
		btn_animation.setContentAreaFilled(false);
		btn_logout.setContentAreaFilled(false);

		ImageIcon img = new ImageIcon("이미지/카테고리배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 900);
		f.add(jl);

		f.setVisible(true);

		// 액션 영화 선택
		btn_action.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action();
				f.dispose();
			}

		});
		// 코미디 영화 선택
		btn_comedy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy();
				f.dispose();
			}

		});
		// 로맨스 영화 선택
		btn_romance.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance();
				f.dispose();
			}

		});
		// 호러 영화 선택
		btn_horror.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller();
				f.dispose();
			}

		});
		// SF 영화 선택
		btn_sf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SF();
				f.dispose();
			}

		});
		// 애니 영화 선택
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
				// 정말 종료? 팝업창
				new PupupFrame();
			}
		});

	}
}
