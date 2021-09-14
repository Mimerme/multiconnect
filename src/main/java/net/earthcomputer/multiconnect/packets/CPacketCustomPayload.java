package net.earthcomputer.multiconnect.packets;

import net.earthcomputer.multiconnect.ap.Message;
import net.earthcomputer.multiconnect.ap.Polymorphic;
import net.earthcomputer.multiconnect.ap.RemainingBytes;
import net.minecraft.util.Identifier;

@Message
@Polymorphic
public abstract class CPacketCustomPayload {
    public Identifier channel;

    @Polymorphic(stringValue = "brand")
    @Message
    public static class BrandPayload extends CPacketCustomPayload {
        public String brand;
    }

    @Polymorphic(otherwise = true)
    @Message
    public static class OtherPayload extends CPacketCustomPayload {
        @RemainingBytes
        public byte[] data;
    }
}
