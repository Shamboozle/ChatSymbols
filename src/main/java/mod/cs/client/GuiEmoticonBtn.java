package mod.cs.client;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

public class GuiEmoticonBtn extends GuiButton{

	public GuiEmoticonBtn(int id, int x, int y, String str){
		super(id, x, y, 12, 12, str);
	}
	
	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		
		if(this.visible){
			
			if(!isMouseOver(mouseX, mouseY)){
				GuiChatHandler.drawColorRect(this.xPosition, this.yPosition, this.width, this.height, new Color(40, 40, 40, 159));
			} else {
				GuiChatHandler.drawColorRect(this.xPosition, this.yPosition, this.width, this.height, new Color(40, 40, 40, 250));
			}
			
			this.drawCenteredString(Minecraft.getMinecraft().fontRenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, Color.WHITE.getRGB());
			
		}
		
	}
	
	private boolean isMouseOver(int mouseX, int mouseY) {
		if (mouseX >= this.xPosition && mouseX <= this.xPosition + this.width
				&& mouseY >= this.yPosition
				&& mouseY <= this.yPosition + this.height) {
			return true;
		} else {
			return false;
		}
	}
	
}
