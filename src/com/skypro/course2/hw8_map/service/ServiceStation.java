package com.skypro.course2.hw8_map.service;

import com.skypro.course2.hw8_map.exceptions.TransportTypeException;
import com.skypro.course2.hw8_map.transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public Queue<Transport> queueInService = new LinkedList<>();

    public Queue<Transport> getQueueInService() {
        return queueInService;
    }

    public void addTransportToQueue(Transport transport) throws TransportTypeException {
        transport.makeDiagnostic();
        queueInService.offer(transport);
    }

    public void performService() {
        if(queueInService.poll()!=null) System.out.println("Service is done");
        else System.out.println("Queue is empty");
    }
}
