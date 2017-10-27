package org.apache.zookeeper.book;

import org.apache.zookeeper.ZooKeeperMain;

import java.util.List;

/**
 * Created by liyuhang on 2017-19-10.
 */
public class ZooKeeperMainTest {
  public static  void main(String[] args) throws Exception{
    //test get all commands
    List<String> cmds = ZooKeeperMain.getCommands();
    for(String cmd: cmds){
      System.out.println(cmd);
    }
    //test printMessage
    ZooKeeperMain.printMessage("this is printMessage");
    //test executeLine
    String[] arr = new String[4];
    arr[0] = "-server";
    arr[1] = "localhost:2181";
    arr[2] = "ls";
    arr[3] = "/workers";
    ZooKeeperMain.main(arr);
  }
}
