package com.mycompany.storestreams.serde.json;

import com.mycompany.commons.storeapp.events.Order;
import org.springframework.kafka.support.serializer.JsonSerde;

public class OrderJsonSerde extends JsonSerde<Order> {
}
