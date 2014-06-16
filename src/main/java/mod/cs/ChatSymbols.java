package mod.cs;

import mod.cs.client.EventChatHandler;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = "Chat Symbols", modid = "cs", version = ChatSymbols.MOD_VER)
public class ChatSymbols {

	public static final String MOD_VER = "1.1";
	
	@Instance("cs")
	public static ChatSymbols instance;
	
	public Logger logger = LogManager.getLogger("Chat Symbols");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		MinecraftForge.EVENT_BUS.register(new EventChatHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
	}
	
}
