package com.solonarv.mods.core.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.solonarv.mods.core.math.operators.IOperator;

public class ReflectionHelper {
    /**
     * Get a field from a class that has on of the serveral given names.
     * @param cls the class to grab a field from
     * @param deobfName The desired field names
     * @return The field in the given class whose name is either deobfName or srgName
     */
    public static Field getFieldByNames(Class cls, String... names){
        List<Field> fields = getFieldsByNames(cls, names);
        return fields.isEmpty() ? null : fields.get(0);
    }
    
    public static List<Field> getFieldsByNames(Class cls, String... names){
        List<Field> fields = new LinkedList<Field>();
        List<String> namesList = Arrays.asList(names);
        for(Field f: cls.getDeclaredFields()) if(namesList.contains(f.getName())){
            fields.add(f);
        }
        return fields;
    }
    
    public static Field chmods(Field f, int flags, IOperator<Integer> op) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
        Field modfield = Field.class.getDeclaredField("modifiers");
        modfield.setAccessible(true);
        modfield.setInt(f, op.apply(f.getModifiers(), flags));
        return f;
    }
}
