package com.amazon.bddframework;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServerUtil {
static AppiumDriverLocalService appium;

public static void start() {

        appium = AppiumDriverLocalService.buildDefaultService();
        appium.start();

        }

public static void stop() {
        appium.stop();
        }
        }
