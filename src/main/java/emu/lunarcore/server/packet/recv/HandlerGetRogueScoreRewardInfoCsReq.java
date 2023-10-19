package emu.lunarcore.server.packet.recv;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketGetRogueScoreRewardInfoScRsp;

@Opcodes(CmdId.GetRogueScoreRewardInfoCsReq)
public class HandlerGetRogueScoreRewardInfoCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] data) throws Exception {
        session.send(new PacketGetRogueScoreRewardInfoScRsp());
    }

}
