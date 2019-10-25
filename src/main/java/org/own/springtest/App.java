package org.own.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.File;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        final ApplicationContext systemContainer = new FileSystemXmlApplicationContext("src/main/java/org/own/springtest/knight.xml");
        final ApplicationContext classPathContainer = new ClassPathXmlApplicationContext("/org/own/springtest/knight.xml");
        final Ciudad city =  (Ciudad) systemContainer.getBean("ciudad");
        final Ciudad City = (Ciudad) classPathContainer.getBean("ciudad");
        final Pais pais = (Pais) classPathContainer.getBean("cityBean");
        final Pais country = (Pais) classPathContainer.getBean("country");
        final Inventory inventory = (Inventory) classPathContainer.getBean("inventory");
        final Inventory inventorySet = (Inventory) classPathContainer.getBean("inventorySet");
        final Inventory inventoryMap = (Inventory) classPathContainer.getBean("inventoryMap");
        final Inventory inventoryProps = (Inventory) classPathContainer.getBean("inventoryProps");
        System.out.println(city.getName());
        System.out.println(City.getName());
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(pais);
        System.out.println(country);
        System.out.println(inventory);
        System.out.println(inventorySet);
        System.out.println(inventoryMap);
        mapInventory(inventoryMap);
        propInventory(inventoryProps);
    }

    private static void mapInventory(final Inventory inventory) {
        if (Objects.nonNull(inventory) && Objects.nonNull(inventory.getProductMap()) && !inventory.getProductMap().isEmpty()) {
            final Set<Entry<String, Product>> entrySet = inventory.getProductMap().entrySet();
            for (Entry<String, Product> product : entrySet)
                System.out.println(product.getKey() + " -> " + product.getValue());
        }
    }

    private static void propInventory(final Inventory inventory) {
        if (Objects.nonNull(inventory) && Objects.nonNull(inventory.getProductProperties()) && !inventory.getProductProperties().isEmpty())
        {
            final Properties properties = inventory.getProductProperties();
            final Set<Entry<Object, Object>> entries = properties.entrySet();
            if (Objects.nonNull(entries) && !entries.isEmpty())
                for(Entry<Object, Object> entry : entries)
                    System.out.println(entry.getKey() + "=====>" + entry);
        }
    }
}