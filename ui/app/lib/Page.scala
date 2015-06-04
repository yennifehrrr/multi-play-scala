package lib

class Page[T](rowsPlusOne: Seq[T], val currentPage: Int, val pageSize: Int) {

  lazy val rows = rowsPlusOne.slice(0, pageSize)

  def nextPage = if (rowsPlusOne.size > pageSize) Some(currentPage + 1) else None

  def previousPage = if (currentPage > 1) Some(currentPage - 1) else None

}

object Page {

  def offset(page: Int, size: Int) = (page - 1) * size

}
