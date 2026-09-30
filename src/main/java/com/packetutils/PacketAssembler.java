package com.packetutils;

import java.nio.ByteBuffer;

public class PacketAssembler {
    public byte[] assemblePacket(byte[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length + 4);
        buffer.putInt(data.length);
        buffer.put(data);
        return buffer.array();
    }
}