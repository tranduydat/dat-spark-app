package org.example.task.saving

import org.apache.log4j.Logger
import org.example.task.AbstractTask

abstract class AbstractSaving extends AbstractTask {
  @transient lazy val savingTaskLogger: Logger = new Logger(getClass)
}
