import com.exalate.basic.domain.hubobject.v1.BasicHubIssue

public class MajidTest{
  public MajidTest(){
  }
  public def mySync(BasicHubIssue issue, BasicHubIssue replica){
    replica.key            = issue.key
    replica.type           = issue.type
    replica.assignee       = issue.assignee
    replica.reporter       = issue.reporter
    replica.summary        = issue.summary
    replica.description    = issue.description
    replica.labels         = issue.labels
    replica.comments       = issue.comments.findAll {!it.internal}
    replica.resolution     = issue.resolution
    replica.status         = issue.statusd
    replica.priority       = issue.priority
   // replica.attachments    = issue.attachments
    issue.customFields."Target Issue Key" = replica.customFields."Target Issue Key"

  }
}
