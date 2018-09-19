/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.pixelshift.testclient;

import java.io.IOException;
import org.json.JSONException;
import pixelshift.PixelshiftApi;

/**
 *
 * @author spender
 */
public interface PixelshiftApiFactory {
    PixelshiftApi getPixelshiftApi (
            String clientId,
            String clientSecret,
            String baseUrl) throws JSONException, IOException;
}
