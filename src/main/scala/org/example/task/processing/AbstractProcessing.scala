package org.example.task.processing

import org.apache.log4j.Logger
import org.example.task.AbstractTask

abstract class AbstractProcessing extends AbstractTask {
  @transient lazy val processingTaskLogger: Logger = new Logger(getClass)
}
