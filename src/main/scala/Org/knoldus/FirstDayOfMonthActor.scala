package Org.knoldus

import Org.knoldus.FirstDayOfMonthActor.ExecuteTask
import akka.actor.Actor
import com.typesafe.scalalogging.LazyLogging

class FirstDayOfMonthActor extends Actor with LazyLogging {

  def receive: PartialFunction[Any, Unit] = {
    case ExecuteTask => logger.info("I am going to execute every first day of the month")
    case _ => logger.info("Invalid message")
  }
}

object FirstDayOfMonthActor {
  case object ExecuteTask
}