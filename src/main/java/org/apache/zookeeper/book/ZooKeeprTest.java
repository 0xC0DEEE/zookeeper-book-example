package org.apache.zookeeper.book;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

/**
 * Created by liyuhang on 2017-19-10.
 */
public class ZooKeeprTest {
  public static void main(String[] args) throws Exception{
    ZooKeeper zk = new ZooKeeper("localhost:2181", 10000, new Watcher(){
      @Override
      public void process(WatchedEvent watchedEvent) {
        System.out.println(watchedEvent);
      }
    });

    zk.create("/tt/create_from_prog", null, null, CreateMode.EPHEMERAL);

  }

}
