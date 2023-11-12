package com.modifylab.modifycore.platform;

import com.modifylab.modifycore.registry.RegistrationProvider;

import java.util.ServiceLoader;

public class Services {

    private static final RegistrationProvider.Factory FACTORY = load(RegistrationProvider.Factory.class);

    public static <T> T load(Class<T> clazz) {
        return ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
    }
}
