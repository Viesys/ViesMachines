package com.vies.viesmachines.network.server.world;

import com.vies.viesmachines.api.References;
import com.vies.viesmachines.network.packet.MessageBase;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class PlayerMessageToolRadioExpansionApply2 extends MessageBase<PlayerMessageToolRadioExpansionApply2> {
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void handleClientSide(PlayerMessageToolRadioExpansionApply2 message, EntityPlayer player) 
	{
		
	}
	
	@Override
	public void handleServerSide(PlayerMessageToolRadioExpansionApply2 message, EntityPlayer player) 
	{
		player.sendMessage(new TextComponentString(TextFormatting.GREEN + References.Old_I18n.translateToLocalFormatted("viesmachines.message.tool.radio_expansion.12")));
	}
}
