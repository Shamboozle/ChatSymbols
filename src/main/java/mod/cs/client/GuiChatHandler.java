package mod.cs.client;

import java.awt.Color;
import java.util.List;

import mod.cs.ChatSymbols;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;


public class GuiChatHandler {
	
	private static String[] emotes = {"\u263A", "\u25CF", "\u00A9", "\u2600", "\u2601", "\u2602", "\u2603", "\u2605", "\u2622", "\u2623",
									  "\u2660", "\u2661", "\u2662", "\u2663", "\u2664", "\u2665", "\u2666", "\u2667", "\u2669", "\u266A",
									  "\u266B", "\u266C", "\u2708", "\u2709", "\u2714", "\u2716", "\u2764", "\u24B6", "\u24B7", "\u24B8",
									  "\u24B9", "\u24BA", "\u24BB", "\u24BC", "\u24BD", "\u24BE", "\u24BF", "\u24C0", "\u24C1", "\u24C2",
									  "\u24C3", "\u24C4", "\u24C5", "\u24C6", "\u24C7", "\u24C8", "\u24C9", "\u24CA", "\u24CB", "\u24CC",
									  "\u24CD", "\u24CE", "\u24CF"};
	
	public static void initButtons(List<GuiButton> btnList){		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < emotes.length; i++){
			if(x == 25){
				y++;
				x = 0;
			}
			btnList.add(new GuiEmoticonBtn(i, x * 13 + 1, y * 13 + 12, emotes[i]));
			x++;
		}
	}
	public static void actionPerformed(GuiButton btn) {

		if (btn.enabled) {
			
			for(int j = 0; j < emotes.length; j++){
				if(btn.id == j){
					GuiChatReplace.inputField.writeText(emotes[j]);
					GuiChatReplace.inputField.setCursorPositionEnd();
				}
			}
		}

	}
	
	public static void drawScreenHandler(){
		Minecraft.getMinecraft().fontRenderer.drawString("Chat Symbols: " + ChatSymbols.MOD_VER, 1, 1, Color.WHITE.getRGB());
	}
	
	public static void drawColorRect(int x, int y, int width, int height, Color col){
		GuiScreen.drawRect(x, y, x + width, y + height, col.getRGB());
	}
}
