package com.skypro.course2.hw9_set_iterator.service;

import com.skypro.course2.hw9_set_iterator.exceptions.TransportTypeException;
import com.skypro.course2.hw9_set_iterator.transport.Transport;

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
