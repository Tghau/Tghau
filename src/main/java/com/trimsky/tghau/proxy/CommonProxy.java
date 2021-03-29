package com.tghau.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;



public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        public class EventsHandler {

            public void wakeup(PlayerWakeUpEvent e)
            {
                EntityPlayer player = (EntityPlayer) e.getEntity();
                player.sendMessage(new TextComponentString("You feel something strange..."));
            }
        }
        MinecraftForge.EVENT_BUS.register(new EventsHandler());
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event) 
    {
        
    }

}
