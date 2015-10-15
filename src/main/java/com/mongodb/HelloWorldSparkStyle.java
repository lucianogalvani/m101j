/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb;

import static spark.Spark.get;

/**
 *
 * @author luciano.galvani
 */
public class HelloWorldSparkStyle {

    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World from Spark");
    }

}
