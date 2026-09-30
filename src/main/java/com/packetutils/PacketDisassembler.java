package com.packetutils;

import java.nio.ByteBuffer;

public class PacketDisassembler {
    public byte[] disassemblePacket(byte[] packet) {
        ByteBuffer buffer = ByteBuffer.wrap(packet);
        int length = buffer.getInt();
        byte[] data = new byte[length];
        buffer.get(data);
        return data;
    }
}