package com.solonarv.mods.core.block;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.block.Block;

import com.google.common.base.Function;
import com.solonarv.mods.core.math.operators.IntegerOperators;
import com.solonarv.mods.core.reflect.ReflectionHelper;

public class BlockHelper {
    public static void createBlock(int id, Function<Integer, Block> blockMaker){
        try{
            Block.blocksList[id] = null;
            Field targetField = null;
            for(Field f : Block.class.getDeclaredFields()){
                if((f.getModifiers() & Modifier.STATIC) != 0){
                    Object o = f.get(null);
                    if(o!=null && o instanceof Block){
                        targetField = f;
                        break;
                    }
                }
            }
            Block.blocksList[id] = null;
            Block block = blockMaker.apply(id);
            if(targetField != null){
                targetField.setAccessible(true);
                ReflectionHelper.chmods(targetField, ~Modifier.FINAL, IntegerOperators.Bitwise.AND);
                targetField.set(null, block);
            }
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
