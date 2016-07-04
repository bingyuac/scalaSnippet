package reactiveComponent.nbiot

package object flow {
  case class CellId(value: String) extends AnyVal
  case class UeId(value: String) extends AnyVal
  case class RRCInstanceId(value: String) extends AnyVal
  case class UeIdentity(ueId: UeId, cellId: CellId)
  case class Mac(value: String) extends AnyVal
}
