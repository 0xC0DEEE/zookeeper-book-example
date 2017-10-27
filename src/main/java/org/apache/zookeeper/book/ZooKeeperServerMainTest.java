package org.apache.zookeeper.book;

import org.apache.zookeeper.server.ServerConfig;
import org.apache.zookeeper.server.ZooKeeperServerMain;

/**
 * Created by liyuhang on 2017-19-10.
 */
public class ZooKeeperServerMainTest {
  public static void main(String[] args) throws Exception{
    ZooKeeperServerMain server = new ZooKeeperServerMain();
    //
    ServerConfig config = new ServerConfig();
    config.parse("/Users/liyuhang/work/zookeeper-3.4.10/conf/zoo1.cfg");
    //

    server.runFromConfig(config);
  }
}
