package com.pro100kryto.server.modules.simplebattle.connection;

import com.pro100kryto.server.utils.datagram.packets.IEndPoint;

public class PlayerConnectionInfo {
    private final int connId;
    private final String nickname;
    private final ConnectionRoles connectionRoles;
    private final IEndPoint endPoint;

    public PlayerConnectionInfo(int connId, String nickname, ConnectionRoles connectionRoles, IEndPoint endPoint) {
        this.connId = connId;
        this.nickname = nickname;
        this.connectionRoles = connectionRoles;
        this.endPoint = endPoint;
    }

    public int getConnId() {
        return connId;
    }

    public String getNickname() {
        return nickname;
    }

    public ConnectionRoles getConnectionRoles() {
        return connectionRoles;
    }

    public IEndPoint getEndPoint() {
        return endPoint;
    }
}
