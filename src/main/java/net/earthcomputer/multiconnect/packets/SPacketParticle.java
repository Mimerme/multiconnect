package net.earthcomputer.multiconnect.packets;

import net.earthcomputer.multiconnect.ap.Message;
import net.earthcomputer.multiconnect.ap.Polymorphic;
import net.earthcomputer.multiconnect.ap.PolymorphicBy;
import net.earthcomputer.multiconnect.ap.Registries;
import net.earthcomputer.multiconnect.ap.Registry;
import net.earthcomputer.multiconnect.ap.Type;
import net.earthcomputer.multiconnect.ap.Types;

@Message
public abstract class SPacketParticle {
    @Registry(Registries.PARTICLE_TYPE)
    @Type(Types.INT)
    public int particleId;
    public boolean longDistance;
    public double x;
    public double y;
    public double z;
    public float offsetX;
    public float offsetY;
    public float offsetZ;
    public float particleData;
    @Type(Types.INT)
    public int count;
    @PolymorphicBy(field = "particleId")
    public CommonTypes.Particle particle;
}
