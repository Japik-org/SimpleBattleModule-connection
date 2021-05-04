package com.pro100kryto.server.modules.simplebattle.connection;

import com.pro100kryto.server.module.IModuleConnection;

public interface ISimpleBattleModuleConnection extends IModuleConnection {

    void connectPlayer(PlayerConnectionInfo connectionInfo);

    void disconnectPlayer(int connId);

    boolean isConnectedPlayer(int connId);
}
