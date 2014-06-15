package mod.cs.client;

import net.minecraft.client.gui.GuiChat;
import net.minecraftforge.client.event.GuiOpenEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EventChatHandler {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onChatGui(GuiOpenEvent event){
		
		if(event.isCanceled()) return;
		
		if(event.gui != null && event.gui instanceof GuiChat){
			event.gui = new GuiChatReplace();
		}
		
	}

}
