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
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		// 영화 포스터
		JButton btn_thriller1 = new JButton(new ImageIcon("이미지/스릴러_검은사제들.png"));
		JButton btn_thriller2 = new JButton(new ImageIcon("이미지/스릴러_곡성.png"));
		JButton btn_thriller3 = new JButton(new ImageIcon("이미지/스릴러_곤지암.png"));
		JButton btn_thriller4 = new JButton(new ImageIcon("이미지/스릴러_숨바꼭질.png"));

		// 포스터 크기
		btn_thriller1.setBounds(50, 270, 250, 330);
		btn_thriller2.setBounds(330, 270, 250, 330);
		btn_thriller3.setBounds(50, 630, 250, 330);
		btn_thriller4.setBounds(330, 630, 250, 330);

		// 추가
		f.add(btn_thriller1);
		f.add(btn_thriller2);
		f.add(btn_thriller3);
		f.add(btn_thriller4);

		// 뒤로가기
		JButton btn_logout = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// 외곽선 지우기
		btn_thriller1.setBorderPainted(false);
		btn_thriller2.setBorderPainted(false);
		btn_thriller3.setBorderPainted(false);
		btn_thriller4.setBorderPainted(false);

		// 배경
		ImageIcon img = new ImageIcon("이미지/스릴러영화배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		// 검은사제들 선택
		btn_thriller1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_ThePriests();
				f.dispose();
			}

		});

		// 곡성 선택
		btn_thriller2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_TheWailing();
				f.dispose();
			}

		});

		// 곤지암 선택
		btn_thriller3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_Gonjiam();
				f.dispose();
			}

		});

		// 숨바꼭질 선택
		btn_thriller4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_HideAndSeek();
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
