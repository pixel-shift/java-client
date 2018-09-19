/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.pixelshift.testclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pixelshift.PixelshiftApi;
import pixelshift.models.*;

/**
 *
 * @author spender
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String clientId = "__client_id__"; //replace with "public key" from https://www.pixelshift.io/Dashboard/ApiAccess
        String clientSecret = "__client_secret__"; //replace with "secret key" from https://www.pixelshift.io/Dashboard/ApiAccess
        String baseUrl = "https://www.pixelshift.io";

        PixelshiftApiFactory pixelshiftApiFactory = new PixelshiftApiFactoryImpl();

        PixelshiftApi api = pixelshiftApiFactory
                .getPixelshiftApi(clientId, clientSecret, baseUrl);

        Batch batch = getExampleBatch();

        BatchStartReportResponse response = api.processImageBatch(batch);

        System.out.println("success : " + response.success());

    }

    private static Batch getExampleBatch() {
        TransformGraph graph = getExampleGraph();
        
        List<TransformGraph> batchItems = new ArrayList<>();
        batchItems.add(graph);
        
        return new Batch().withItems(batchItems);
    }

    private static TransformGraph getExampleGraph() {
        StorageSourceS3 storageSource = new StorageSourceS3()
                .withSourceBucket("somebucket")
                .withSourceKey("somekeyname");
        ImageResizeMax resize = new ImageResizeMax()
                .withWidth(200)
                .withHeight(200);
        ImageFormatJpeg jpeg = new ImageFormatJpeg()
                .withQuality(80);
        StorageSinkS3 storageSink = new StorageSinkS3()
                .withAllowOverwrite(true)
                .withDestinationBucket("someotherbucket")
                .withDestinationKey("someotherkeyname");
        
        List<TransformUnit> transforms = new ArrayList<>();
        transforms.add(storageSource);
        transforms.add(resize);
        transforms.add(jpeg);
        transforms.add(storageSink);


        return new TransformGraph()
                .withTransforms(transforms);
    }

}
