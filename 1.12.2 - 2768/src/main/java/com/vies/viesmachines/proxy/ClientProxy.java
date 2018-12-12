package com.vies.viesmachines.proxy;

import com.vies.viesmachines.api.util.Keybinds;
import com.vies.viesmachines.client.InitEntityVMRender;
import com.vies.viesmachines.client.InitTileEntityVMRender;
import com.vies.viesmachines.client.gui.machines.GuiMachineHUD;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
		
		//////Allows the loading of .obj files
		//////OBJLoader.INSTANCE.addDomain(References.MOD_ID.toLowerCase());
		//////AnimationModelBase test;
		//InitSoundEventsVC.registerSounds();
		//InitItemsVCRender.registerItemRender();
		//InitBlocksVCRender.registerBlockRender();
		InitEntityVMRender.registerEntityRender();
		InitTileEntityVMRender.registerTileEntityRender();
		
		Keybinds.init();
		//NetworkHandler.preInitClient();
		//InitItemsVCRender.registerItemRenderTEMP();
		//InitBlocksVCRender.registerBlockRenderTEMP();
		//InitEntityVCRender.registerEntityRenderTEMP();
		//InitTileEntityVCRender.registerTileEntityRenderTEMP();
	}
	
	@Override
	public void init(FMLInitializationEvent event) 
	{
		super.init(event);
		
		MinecraftForge.EVENT_BUS.register(new GuiMachineHUD());
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
	}
}
