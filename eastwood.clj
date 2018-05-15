(disable-warning
 {:linter :deprecations
  ;;:symbol-matches #{#"^#'public\ final\ void\ java\.lang\.Thread\.stop\(\)"}
  ;;:symbol-matches #{#"^#'public\ final\ void\ java.lang.Thread.stop()"}
  :symbol-matches #{#"^#.*Thread.*"}})
