package id.co.adiyatmubarak.learnscala.concurrency

import java.net.{Socket, ServerSocket}

/**
 * Created by adiyatmubarak on 10/28/15.
 */
class NetworkService(port: Int, poolSize: Int) extends Runnable {
  val serverSocket = new ServerSocket(port)

  override def run(): Unit = {
    while (true) {
      // This will block until a connection comes in.
      val socket = serverSocket.accept()
      new Handler(socket).run()
    }
  }

}

class Handler(socket: Socket) extends Runnable {

  def message = (Thread.currentThread.getName + "\n").getBytes

  override def run(): Unit = {
    socket.getOutputStream.write(message)
    socket.getOutputStream.close()
  }

}

object Test {
  def main(args: Array[String]) {
    new NetworkService(2020, 2).run()
  }
}
