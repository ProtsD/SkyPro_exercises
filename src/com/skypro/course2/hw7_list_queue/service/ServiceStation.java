package com.skypro.course2.hw7_list_queue.service;

import com.skypro.course2.hw7_list_queue.exceptions.TransportTypeException;
import com.skypro.course2.hw7_list_queue.transport.Transport;

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
