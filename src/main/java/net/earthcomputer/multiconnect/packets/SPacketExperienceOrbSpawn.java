package net.earthcomputer.multiconnect.packets;

import net.earthcomputer.multiconnect.ap.MessageVariant;

@MessageVariant
public class SPacketExperienceOrbSpawn {
    public int entityId;
    public double x;
    public double y;
    public double z;
    public short count;
}
