package mod.cs.client;

import java.awt.Color;
import java.util.List;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;


public class GuiChatHandler {
	
	//141 Emoticons
	 private static String[] emoticons = {"ಠ", "©", "®", "°", "҂", "؎", "�?", "۞", "۩", "۽", "۾", "߶", "৺", "୰", "௳", "௴", "௵",
 		 "௶", "௷", "௸", "௺", "౿", "൹", "�?", "༂", "༃", "༓", "༕", "༖", "༗", "༚", "༛", "༜",
 		 "�?", "༞", "༟", "༴", "༶", "༸", "྾", "࿇", "࿉", "࿊", "࿋", "࿌", "℃", "℅", "℉", "℗", "™",
 		 "℧", "℮", "↕", "↖", "↗", "↘", "↙", "↺", "↻", "⇄", "⇅", "⇆", "⇇", "⇉", "⇈", "⇊", "⇉",
 		 "�?", "�?", "⇑", "⇓", "⇕", "⇖", "⇗", "⇘", "⇙", "⌀", "Ⓐ", "Ⓑ", "Ⓒ", "Ⓓ", "Ⓔ", "Ⓕ", "Ⓖ",
 		 "Ⓗ", "Ⓘ", "Ⓙ", "Ⓚ", "�?", "Ⓜ", "Ⓝ", "Ⓞ", "Ⓟ", "Ⓠ", "Ⓡ", "Ⓢ", "Ⓣ", "Ⓤ", "Ⓥ", "Ⓦ",
 		 "�?", "Ⓨ", "�?", "▲", "△", "▶", "▼", "◀", "◆", "◇", "�?", "�?", "☀", "☂", "★", "☆",
 		 "☎", "☚", "☛", "☠", "☢", "☣", "☮", "☯", "☹", "☺", "☻", "♔", "♘", "♠", "♡", "♥",
 		 "✈", "✉", "✌", "�?", "✓", "✔", "✖", "�?�", "�"};
	
	public static void initButtons(List<GuiButton> btnList){			
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < emoticons.length; i++){
			if(x == 22){
				y++;
				x = 0;
			}
			btnList.add(new GuiEmoticonBtn(i, x * 13 + 1, y * 13 + 12, emoticons[i]));
			x++;
		}
		
	}
	
	public static void actionPerformed(GuiButton btn) {

		if (btn.enabled) {
			for(int i = 0; i < emoticons.length; i++){
				if(btn.id == i){
					GuiChatReplace.inputField.writeText(emoticons[i]);
				}
			}
		}

	}
	
	public static void drawColorRect(int x, int y, int width, int height, Color col){
		GuiScreen.drawRect(x, y, x + width, y + height, col.getRGB());
	}
}
