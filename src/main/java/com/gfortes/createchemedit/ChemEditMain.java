package com.gfortes.createchemedit;

import com.gfortes.createchemedit.Block.modBlocks;
import com.gfortes.createchemedit.Item.modItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.gfortes.createchemedit.Other.ModEventHandler;

import java.util.logging.LogManager;
import java.util.logging.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ChemEditMain.MOD_ID)
public class ChemEditMain
{
    // Directly reference a slf4j logger
    public static final String MOD_ID = "createchemedit";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger("CHEM_LOG");

    public ChemEditMain()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modItems.register(eventBus);
        modBlocks.register(eventBus);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

}
