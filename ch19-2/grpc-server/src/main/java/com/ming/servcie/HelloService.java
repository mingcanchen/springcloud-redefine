package com.ming.servcie;


import com.ming.HelloResponse;
import com.ming.HelloServiceGrpc;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-06-11
 **/
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(com.ming.HelloRequest request,
                      io.grpc.stub.StreamObserver<com.ming.HelloResponse> responseObserver) {
        System.out.println(request);

        String greeting = "Hi " + request.getName() + " you are " + request.getAge() + " years old" +
                " your hoby is " + (request.getHobbiesList()) + " your tags " + request.getTagsMap();

        HelloResponse response = HelloResponse.newBuilder().setGreeting(greeting).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
