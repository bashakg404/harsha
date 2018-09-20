package com.basha.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {


	public static void main(String[] args) {
		
		Player kohli=new Player("Virat Kohli", 1, 28, "India");
		Player root=new Player("Joe Root", 2, 26, "England");
		Player smith=new Player("Steven Smith", 4, 30, "Australia");
		Player williamson=new Player("Kane Williamson", 3, 28, "NewZealand");
		Player elgar=new Player("Dean Elgar", 5, 28, "South Aftrica");
		List<Player> listPlayer=new ArrayList<>();
		listPlayer.add(kohli);
		listPlayer.add(root);
		listPlayer.add(smith);
		listPlayer.add(williamson);
		listPlayer.add(elgar);
		
		Collections.sort(listPlayer);
		System.out.println(listPlayer);
		
		
	}

}
