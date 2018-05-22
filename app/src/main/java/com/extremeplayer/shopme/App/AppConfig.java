package com.extremeplayer.shopme.App;

import org.apache.logging.log4j.core.jmx.Server;

/**
 * Created by Abishaik on 01-09-2017.
 */

public class AppConfig {

    // Server user login url
    public static String URL_LOGIN = "http://192.168.1.80/android_connect_php/login.php";

    // Server user register url
    public static String URL_REGISTER = "http://192.168.1.80/android_connect_php/register.php";

    //Server Products url
    public static String URL_PRODUCTS = "http://192.168.1.80/android_connect_php/product.php";

    //Server Products payment url
    public static String URL_PRODUCTS_PAYMENT = "http://192.168.1.80/android_connect_php/payment.php";
}
