# ics3u-2019-culminating-task

Use this repository to complete your culminating task.

Be sure to commit your work frequently; as discussed in class, this is a major part of the expectations for the culminating task.

## Install the shortcut

To use the `./acp` shortcut, copy and paste these commands into your Terminal window in the `ics3u-2019-culminating-task` folder:

```
rm -rf acp
echo -e 'acp' >> .gitignore
echo -e '#!/bin/bash' >> acp
echo -e 'git add *' >> acp
echo -e 'git commit -m "$1"' >> acp
echo -e 'git push -u origin master' >> acp
chmod +x acp
```
