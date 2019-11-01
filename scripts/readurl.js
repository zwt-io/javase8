var feed = "https://zwt.io/2019/10/25/oca-exam-prep-review/";
var url = new java.net.URL(feed);
input = new java.util.Scanner(url.openStream());
input.useDelimiter('$');
var contents = input.next();
contents
