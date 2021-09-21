package Org.knoldus

import Org.knoldus.FirstDayOfMonthActor.ExecuteTask
import java.util.TimeZone
import akka.actor.{ActorSystem, Props}
import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension
import scala.concurrent.ExecutionContextExecutor

object Driver extends App {

  val system = ActorSystem("SchedulerSystem")
  implicit val executionContext: ExecutionContextExecutor = system.dispatcher
  val scheduler = QuartzSchedulerExtension
  val schedulerActor = system.actorOf(Props(classOf[FirstDayOfMonthActor]),
    "Schedule Job")
  QuartzSchedulerExtension.get(system).createSchedule("monthlyScheduler", None, "0 0 0 1 1/1 ? *", None, TimeZone.getTimeZone("Asia/Calcutta"))
  QuartzSchedulerExtension.get(system).schedule("monthlyScheduler", schedulerActor,
    ExecuteTask)
}