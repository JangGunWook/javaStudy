package MusicGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		MusicController contr = new MusicController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨노래일까??");
		System.out.println("영어로 시작하면 대문자로 시작하세요. 띄어쓰기 하지말기.");
		contr.play();
		
		String answer = sc.next();
		
		if(contr.play().equals(answer)) {
				contr.stop();
			System.out.println("맞췄어!");
			
			
		} else {
			System.out.println("실망이야");
			contr.stop();
		}
		
	
		
		
		
		
		
		
		
		
		
	}

}
