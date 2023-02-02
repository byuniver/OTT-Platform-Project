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
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		// 영화 포스터
		JButton btn_action1 = new JButton(new ImageIcon("이미지/액션_밀정.png"));
		JButton btn_action2 = new JButton(new ImageIcon("이미지/액션_의형제.png"));
		JButton btn_action3 = new JButton(new ImageIcon("이미지/액션_전우치.png"));
		JButton btn_action4 = new JButton(new ImageIcon("이미지/액션_좋은놈,나쁜놈,이상한놈.png"));

		// 포스터 크기
		btn_action1.setBounds(50, 270, 250, 330);
		btn_action2.setBounds(330, 270, 250, 330);
		btn_action3.setBounds(50, 630, 250, 330);
		btn_action4.setBounds(330, 630, 250, 330);

		// 추가
		f.add(btn_action1);
		f.add(btn_action2);
		f.add(btn_action3);
		f.add(btn_action4);

		// 뒤로가기
		JButton btn_logout = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);

		// 외곽선 지우기
		btn_action1.setBorderPainted(false);
		btn_action2.setBorderPainted(false);
		btn_action3.setBorderPainted(false);
		btn_action4.setBorderPainted(false);

		// 배경
		ImageIcon img = new ImageIcon("이미지/액션영화배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);

		// 밀정 선택
		btn_action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheAgeOfShadows();
				f.dispose();
			}

		});
		// 의형제 선택
		btn_action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_SecretReunion();
				f.dispose();
			}

		});
		// 전우치 선택
		btn_action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_JeonWoochi();
				f.dispose();
			}

		});
		// 좋은놈,나쁜놈,이상한놈 선택
		btn_action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheGoodTheBadTheWeird();
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
