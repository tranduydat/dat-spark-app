package org.example.task.monitoring

import org.apache.log4j.Logger
import org.example.task.AbstractTask

abstract class AbstractMonitoring extends AbstractTask {
  @transient lazy val monitoringTaskLogger: Logger = new Logger(getClass)
}
