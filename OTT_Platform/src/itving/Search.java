package itving;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import movie.Action_JeonWoochi;
import movie.Action_SecretReunion;
import movie.Action_TheAgeOfShadows;
import movie.Action_TheGoodTheBadTheWeird;
import movie.Ani_Ponyo;
import movie.Ani_SenAndChihiro;
import movie.Ani_TheCatReturns;
import movie.Ani_Totoro;
import movie.Comedy_ExtremeJob;
import movie.Comedy_HotYoungBloods;
import movie.Comedy_SpeedScanda;
import movie.Comedy_Twenty;
import movie.Romance_Love911;
import movie.Romance_TheBeautyInside;
import movie.Romance_WolfBoy;
import movie.Romance_YourWedding;
import movie.SF_Haunters;
import movie.SF_ILLANG;
import movie.SF_SnowPiercer;
import movie.SF_SpaceSweepers;
import movie.Thriller_Gonjiam;
import movie.Thriller_HideAndSeek;
import movie.Thriller_ThePriests;
import movie.Thriller_TheWailing;

public class Search {
	// 생성자
	public Search() {
		Frame f = new Frame("SearchMovie");
		f.setBounds(500, 600, 500, 550);
		f.setBackground(new Color(56, 56, 56));
		f.setLayout(null);
		f.setResizable(false);// 창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);// 창이 가운데 나오게
		
		// text입력용
		Font font = new Font("", Font.PLAIN, 20);
		TextField tf = new TextField(10);
		tf.setBounds(100, 40, 220, 30);
		tf.setFont(font);

// 페이지로 넘기는 버튼	
//------------------------------------------------------------------------------------------------------------------------------------

		JButton btn_previous = new JButton(new ImageIcon("이미지/previous.png"));
		btn_previous.setBounds(15, 280, 50, 50);

		JButton btn_next = new JButton(new ImageIcon("이미지/next.png"));
		btn_next.setBounds(430, 280, 50, 50);

		JButton btn_previous2 = new JButton(new ImageIcon("이미지/previous.png"));
		btn_previous2.setBounds(15, 280, 50, 50);

		JButton btn_next2 = new JButton(new ImageIcon("이미지/next.png"));
		btn_next2.setBounds(430, 280, 50, 50);

		JButton btn_previous3 = new JButton(new ImageIcon("이미지/previous.png"));
		btn_previous3.setBounds(15, 280, 50, 50);

		JButton btn_next3 = new JButton(new ImageIcon("이미지/next.png"));
		btn_next3.setBounds(430, 280, 50, 50);

		JButton btn_previous4 = new JButton(new ImageIcon("이미지/previous.png"));
		btn_previous4.setBounds(15, 280, 50, 50);

		JButton btn_next4 = new JButton(new ImageIcon("이미지/next.png"));
		btn_next4.setBounds(430, 280, 50, 50);

		JButton btn_previous5 = new JButton(new ImageIcon("이미지/previous.png"));
		btn_previous5.setBounds(15, 280, 50, 50);

		JButton btn_next5 = new JButton(new ImageIcon("이미지/next.png"));
		btn_next5.setBounds(430, 280, 50, 50);

		JButton btn_previous6 = new JButton(new ImageIcon("이미지/previous.png"));
		btn_previous6.setBounds(15, 280, 50, 50);

		JButton btn_next6 = new JButton(new ImageIcon("이미지/next.png"));
		btn_next6.setBounds(430, 280, 50, 50);

		JButton btn_romance1 = new JButton(new ImageIcon("이미지/로맨스_너의결혼식.jpg"));
		btn_romance1.setBounds(90, 100, 125, 188);

		JButton btn_romance2 = new JButton(new ImageIcon("이미지/로맨스_늑대소년.jpg"));
		btn_romance2.setBounds(280, 100, 125, 188);

		JButton btn_romance3 = new JButton(new ImageIcon("이미지/로맨스_반창꼬.jpg"));
		btn_romance3.setBounds(90, 320, 125, 188);

		JButton btn_romance4 = new JButton(new ImageIcon("이미지/로맨스_뷰티인사이드.jpg"));
		btn_romance4.setBounds(280, 320, 125, 188);

		JButton btn_thriller1 = new JButton(new ImageIcon("이미지/스릴러_검은사제들.jpg"));
		btn_thriller1.setBounds(90, 100, 125, 188);

		JButton btn_thriller2 = new JButton(new ImageIcon("이미지/스릴러_곡성.jpg"));
		btn_thriller2.setBounds(280, 100, 125, 188);

		JButton btn_thriller3 = new JButton(new ImageIcon("이미지/스릴러_곤지암.jpg"));
		btn_thriller3.setBounds(90, 320, 125, 188);

		JButton btn_thriller4 = new JButton(new ImageIcon("이미지/스릴러_숨바꼭질.jpg"));
		btn_thriller4.setBounds(280, 320, 125, 188);

		JButton btn_ani1 = new JButton(new ImageIcon("이미지/애니_고양이의보은.jpg"));
		btn_ani1.setBounds(90, 100, 125, 188);

		JButton btn_ani2 = new JButton(new ImageIcon("이미지/애니_벼랑위의포뇨.jpg"));
		btn_ani2.setBounds(280, 100, 125, 188);

		JButton btn_ani3 = new JButton(new ImageIcon("이미지/애니_센과치히로의행방불명.jpg"));
		btn_ani3.setBounds(90, 320, 125, 188);

		JButton btn_ani4 = new JButton(new ImageIcon("이미지/애니_이웃집토토로.jpg"));
		btn_ani4.setBounds(280, 320, 125, 188);

		JButton btn_action1 = new JButton(new ImageIcon("이미지/액션_밀정.jpg"));
		btn_action1.setBounds(90, 100, 125, 188);

		JButton btn_action2 = new JButton(new ImageIcon("이미지/액션_의형제.jpg"));
		btn_action2.setBounds(280, 100, 125, 188);

		JButton btn_action3 = new JButton(new ImageIcon("이미지/액션_전우치.jpg"));
		btn_action3.setBounds(90, 320, 125, 188);

		JButton btn_action4 = new JButton(new ImageIcon("이미지/액션_좋은놈나쁜놈이상한놈.jpg"));
		btn_action4.setBounds(280, 320, 125, 188);

		JButton btn_comedy1 = new JButton(new ImageIcon("이미지/코미디_과속스캔들.jpg"));
		btn_comedy1.setBounds(90, 100, 125, 188);

		JButton btn_comedy2 = new JButton(new ImageIcon("이미지/코미디_극한직업.jpg"));
		btn_comedy2.setBounds(280, 100, 125, 188);

		JButton btn_comedy3 = new JButton(new ImageIcon("이미지/코미디_스물.jpg"));
		btn_comedy3.setBounds(90, 320, 125, 188);

		JButton btn_comedy4 = new JButton(new ImageIcon("이미지/코미디_피끓는청춘.jpg"));
		btn_comedy4.setBounds(280, 320, 125, 188);

		JButton btn_sf1 = new JButton(new ImageIcon("이미지/sf_설국열차.jpg"));
		btn_sf1.setBounds(90, 100, 125, 188);

		JButton btn_sf2 = new JButton(new ImageIcon("이미지/sf_승리호.jpg"));
		btn_sf2.setBounds(280, 100, 125, 188);

		JButton btn_sf3 = new JButton(new ImageIcon("이미지/sf_인랑.jpg"));
		btn_sf3.setBounds(90, 320, 125, 188);

		JButton btn_sf4 = new JButton(new ImageIcon("이미지/sf_초능력자.jpg"));
		btn_sf4.setBounds(280, 320, 125, 188);

		f.add(btn_next);
		f.add(btn_romance1);
		f.add(btn_romance2);
		f.add(btn_romance3);
		f.add(btn_romance4);

		btn_next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				f.add(btn_next2);
				f.add(btn_previous2);
				f.add(btn_thriller1);
				f.add(btn_thriller2);
				f.add(btn_thriller3);
				f.add(btn_thriller4);
				btn_next.setVisible(false);
				btn_previous.setVisible(false);
				btn_next2.setVisible(true);
				btn_previous2.setVisible(true);
				btn_thriller1.setVisible(true);
				btn_thriller2.setVisible(true);
				btn_thriller3.setVisible(true);
				btn_thriller4.setVisible(true);
				btn_romance1.setVisible(false);
				btn_romance2.setVisible(false);
				btn_romance3.setVisible(false);
				btn_romance4.setVisible(false);
			}
		});

		btn_next2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				f.add(btn_next3);
				f.add(btn_previous3);
				f.add(btn_ani1);
				f.add(btn_ani2);
				f.add(btn_ani3);
				f.add(btn_ani4);
				btn_next2.setVisible(false);
				btn_previous2.setVisible(false);
				btn_next3.setVisible(true);
				btn_previous3.setVisible(true);
				btn_ani1.setVisible(true);
				btn_ani2.setVisible(true);
				btn_ani3.setVisible(true);
				btn_ani4.setVisible(true);
				btn_thriller1.setVisible(false);
				btn_thriller2.setVisible(false);
				btn_thriller3.setVisible(false);
				btn_thriller4.setVisible(false);
			}
		});

		btn_next3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				f.add(btn_next4);
				f.add(btn_previous4);
				f.add(btn_action1);
				f.add(btn_action2);
				f.add(btn_action3);
				f.add(btn_action4);
				btn_next3.setVisible(false);
				btn_previous3.setVisible(false);
				btn_next4.setVisible(true);
				btn_previous4.setVisible(true);
				btn_action1.setVisible(true);
				btn_action2.setVisible(true);
				btn_action3.setVisible(true);
				btn_action4.setVisible(true);
				btn_ani1.setVisible(false);
				btn_ani2.setVisible(false);
				btn_ani3.setVisible(false);
				btn_ani4.setVisible(false);

			}
		});

		btn_next4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				f.add(btn_next5);
				f.add(btn_previous5);
				f.add(btn_comedy1);
				f.add(btn_comedy2);
				f.add(btn_comedy3);
				f.add(btn_comedy4);
				btn_next4.setVisible(false);
				btn_previous4.setVisible(false);
				btn_next5.setVisible(true);
				btn_previous5.setVisible(true);
				btn_comedy1.setVisible(true);
				btn_comedy2.setVisible(true);
				btn_comedy3.setVisible(true);
				btn_comedy4.setVisible(true);
				btn_action1.setVisible(false);
				btn_action2.setVisible(false);
				btn_action3.setVisible(false);
				btn_action4.setVisible(false);

			}
		});

		btn_next5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				f.add(btn_previous6);
				f.add(btn_sf1);
				f.add(btn_sf2);
				f.add(btn_sf3);
				f.add(btn_sf4);
				btn_next5.setVisible(false);
				btn_previous5.setVisible(false);
				btn_previous6.setVisible(true);

				btn_sf1.setVisible(true);
				btn_sf2.setVisible(true);
				btn_sf3.setVisible(true);
				btn_sf4.setVisible(true);
				btn_comedy1.setVisible(false);
				btn_comedy2.setVisible(false);
				btn_comedy3.setVisible(false);
				btn_comedy4.setVisible(false);

			}
		});

		btn_previous6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_next5.setVisible(true);
				btn_previous5.setVisible(true);
				btn_previous6.setVisible(false);
				btn_sf1.setVisible(false);
				btn_sf2.setVisible(false);
				btn_sf3.setVisible(false);
				btn_sf4.setVisible(false);
				btn_comedy1.setVisible(true);
				btn_comedy2.setVisible(true);
				btn_comedy3.setVisible(true);
				btn_comedy4.setVisible(true);
			}
		});

		btn_previous5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_next4.setVisible(true);
				btn_previous4.setVisible(true);
				btn_next5.setVisible(false);
				btn_previous5.setVisible(false);
				btn_comedy1.setVisible(false);
				btn_comedy2.setVisible(false);
				btn_comedy3.setVisible(false);
				btn_comedy4.setVisible(false);
				btn_action1.setVisible(true);
				btn_action2.setVisible(true);
				btn_action3.setVisible(true);
				btn_action4.setVisible(true);
			}
		});

		btn_previous4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_next3.setVisible(true);
				btn_previous3.setVisible(true);
				btn_next4.setVisible(false);
				btn_previous4.setVisible(false);
				btn_action1.setVisible(false);
				btn_action2.setVisible(false);
				btn_action3.setVisible(false);
				btn_action4.setVisible(false);
				btn_ani1.setVisible(true);
				btn_ani2.setVisible(true);
				btn_ani3.setVisible(true);
				btn_ani4.setVisible(true);
			}
		});

		btn_previous3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_next2.setVisible(true);
				btn_previous2.setVisible(true);
				btn_next3.setVisible(false);
				btn_previous3.setVisible(false);
				btn_ani1.setVisible(false);
				btn_ani2.setVisible(false);
				btn_ani3.setVisible(false);
				btn_ani4.setVisible(false);
				btn_thriller1.setVisible(true);
				btn_thriller2.setVisible(true);
				btn_thriller3.setVisible(true);
				btn_thriller4.setVisible(true);
			}
		});

		btn_previous2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn_next.setVisible(true);
				btn_next2.setVisible(false);
				btn_previous2.setVisible(false);
				btn_thriller1.setVisible(false);
				btn_thriller2.setVisible(false);
				btn_thriller3.setVisible(false);
				btn_thriller4.setVisible(false);
				btn_romance1.setVisible(true);
				btn_romance2.setVisible(true);
				btn_romance3.setVisible(true);
				btn_romance4.setVisible(true);
			}
		});
// 다음 페이지로 넘기는 코드	
//------------------------------------------------------------------------------------------------------------------------------------

		Button btn_search = new Button("입력");
		btn_search.setBounds(350, 40, 55, 30);

		btn_search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기서 검색 하면됨
				// SF
				if (tf.getText().trim().equalsIgnoreCase("설국열차")) {
					new SF_SnowPiercer();
				}
				if (tf.getText().trim().equalsIgnoreCase("승리호")) {
					new SF_SpaceSweepers();
				}
				if (tf.getText().trim().equalsIgnoreCase("인랑")) {
					new SF_ILLANG();
				}
				if (tf.getText().trim().equalsIgnoreCase("초능력자")) {
					new SF_Haunters();
				}
				// 로맨스
				if (tf.getText().trim().equalsIgnoreCase("너의결혼식")) {
					new Romance_YourWedding();
				}
				if (tf.getText().trim().equalsIgnoreCase("늑대소년")) {
					new Romance_WolfBoy();
				}
				if (tf.getText().trim().equalsIgnoreCase("반창꼬")) {
					new Romance_Love911();
				}
				if (tf.getText().trim().equalsIgnoreCase("뷰티인사이드")) {
					new Romance_TheBeautyInside();
				}
				// 스릴러
				if (tf.getText().trim().equalsIgnoreCase("검은사제들")) {
					new Thriller_ThePriests();
				}
				if (tf.getText().trim().equalsIgnoreCase("곡성")) {
					new Thriller_TheWailing();
				}
				if (tf.getText().trim().equalsIgnoreCase("곤지암")) {
					new Thriller_Gonjiam();
				}
				if (tf.getText().trim().equalsIgnoreCase("숨바꼭질")) {
					new Thriller_HideAndSeek();
				}
				// 애니
				if (tf.getText().trim().equalsIgnoreCase("벼랑위의포뇨")) {
					new Ani_Ponyo();
				}
				if (tf.getText().trim().equalsIgnoreCase("고양이의보은")) {
					new Ani_TheCatReturns();
				}
				if (tf.getText().trim().equalsIgnoreCase("센과치히로의행방불명")) {
					new Ani_SenAndChihiro();
				}
				if (tf.getText().trim().equalsIgnoreCase("이웃집토토로")) {
					new Ani_Totoro();
				}
				// 액션
				if (tf.getText().trim().equalsIgnoreCase("밀정")) {
					new Action_TheAgeOfShadows();
				}
				if (tf.getText().trim().equalsIgnoreCase("의형제")) {
					new Action_SecretReunion();
				}
				if (tf.getText().trim().equalsIgnoreCase("전우치")) {
					new Action_JeonWoochi();
				}
				if (tf.getText().trim().equalsIgnoreCase("좋은놈나쁜놈이상한놈")) {
					new Action_TheGoodTheBadTheWeird();
				}
				// 코미디
				if (tf.getText().trim().equalsIgnoreCase("과속스캔들")) {
					new Comedy_SpeedScanda();
				}
				if (tf.getText().trim().equalsIgnoreCase("극한직업")) {
					new Comedy_ExtremeJob();
				}
				if (tf.getText().trim().equalsIgnoreCase("스물")) {
					new Comedy_Twenty();
				}
				if (tf.getText().trim().equalsIgnoreCase("피끓는청춘")) {
					new Comedy_HotYoungBloods();
				}
			}
		});

		JButton btn_out = new JButton(new ImageIcon("이미지/뒤로가기.png"));
		btn_out.setBounds(10, 40, 50, 50);
		
		btn_out.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new LogoMain();
				f.dispose();

			}
		});

		// 버튼 활성화
		// SF
		btn_sf1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_SnowPiercer();
			}
		});
		btn_sf2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_SpaceSweepers();
			}
		});
		btn_sf3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_ILLANG();
			}
		});
		btn_sf4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SF_Haunters();
			}
		});
		// 로맨스
		btn_romance1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_YourWedding();
			}
		});
		btn_romance2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_WolfBoy();
			}
		});
		btn_romance3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_Love911();
			}
		});
		btn_romance4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Romance_TheBeautyInside();
			}
		});
		// 스릴러
		btn_thriller1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_ThePriests();
			}
		});
		btn_thriller2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_TheWailing();
			}
		});
		btn_thriller3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_Gonjiam();
			}
		});
		btn_thriller4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thriller_HideAndSeek();
			}
		});
		// 애니
		btn_ani1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_TheCatReturns();
			}
		});
		btn_ani2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_Ponyo();
			}
		});
		btn_ani3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_SenAndChihiro();
			}
		});
		btn_ani4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Ani_Totoro();
			}
		});
		// 액션
		btn_action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheAgeOfShadows();
			}
		});
		btn_action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_SecretReunion();
			}
		});
		btn_action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_JeonWoochi();
			}
		});
		btn_action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Action_TheGoodTheBadTheWeird();
			}
		});
		// 코미디
		btn_comedy1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_SpeedScanda();
			}
		});
		btn_comedy2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_ExtremeJob();
			}
		});
		btn_comedy3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_Twenty();
			}
		});
		btn_comedy4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Comedy_HotYoungBloods();
			}
		});

		f.add(tf);
		f.add(btn_search);
		f.add(btn_out);
		f.setVisible(true);
		btn_out.setBorderPainted(false);
		// 창닫기
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

	}

}
