// REPLで以下を実行
implicit class RichString(val arg: String) {
  def twice: String = arg + arg
}