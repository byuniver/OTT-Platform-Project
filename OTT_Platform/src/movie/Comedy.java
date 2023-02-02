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
		f.setResizable(false);//창의 크기를 변경하지 못하게
		   f.setLocationRelativeTo(null);//창이 가운데 나오게
		//영화 포스터
		JButton btn_Comedy1 = new JButton(new ImageIcon("이미지/코미디_과속스캔들.png"));
		JButton btn_Comedy2 = new JButton(new ImageIcon("이미지/코미디_극한직업.png"));
		JButton btn_Comedy3 = new JButton(new ImageIcon("이미지/코미디_스물.png"));
		JButton btn_Comedy4 = new JButton(new ImageIcon("이미지/코미디_피끓는 청춘.png"));
		
		//포스터 크기
		btn_Comedy1.setBounds(50, 270, 250, 330);
		btn_Comedy2.setBounds(330, 270, 250, 330);
		btn_Comedy3.setBounds(50, 630, 250, 330);
		btn_Comedy4.setBounds(330, 630, 250, 330);
		
		//추가
		f.add(btn_Comedy1);
		f.add(btn_Comedy2);
		f.add(btn_Comedy3);
		f.add(btn_Comedy4);
		
		//뒤로가기
		JButton btn_logout = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_logout.setBounds(50, 75, 50, 50);
		f.add(btn_logout);
		btn_logout.setBorderPainted(false);
		btn_logout.setContentAreaFilled(false);
		
		//외곽선 지우기
		btn_Comedy1.setBorderPainted(false);
		btn_Comedy2.setBorderPainted(false);
		btn_Comedy3.setBorderPainted(false);
		btn_Comedy4.setBorderPainted(false);
		
		//배경
		ImageIcon img = new ImageIcon("이미지/코미디영화배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 630, 1000);
		f.add(jl);
		
		// 과속스캔들 선택
		btn_Comedy1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_SpeedScanda();
				f.dispose();
			}

		});
		
		// 극한직업 선택
		btn_Comedy2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_ExtremeJob();
				f.dispose();
			}

		});
		
		// 스물 선택
		btn_Comedy3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_Twenty();
				f.dispose();
			}

		});
		
		// 피끓는 청춘 선택
		btn_Comedy4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_HotYoungBloods();
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
		
		//종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//정말 종료? 팝업창
				new PupupFrame();
			}
		});
		}
}
