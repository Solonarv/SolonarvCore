package com.solonarv.mods.core.command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandSolonarv extends CommandBase {
    
    private String name;
    private String usage;
    
    private Map<String, SubCommand> subCommands = new HashMap<>();

    public CommandSolonarv(String name, String usage){
        this.name = name;
        this.usage = usage;
    }
    
    public void registerCommand(SubCommand cmd){
        this.subCommands.put(cmd.getCommandName(), cmd);
    }
    
    @Override
    public String getCommandName() {
        return this.name;
    }
    
    @Override
    public String getCommandUsage(ICommandSender commandSender) {
        return this.usage;
    }
    
    @Override
    public void processCommand(ICommandSender commandSender, String[] args) {
        if(args.length >= 1){
            String cn = args[0];
            if(this.subCommands.containsKey(cn)){
                this.subCommands.get(cn).processCommand(commandSender, Arrays.copyOfRange(args, 1, args.length));
            }
        }
    }
    
}
