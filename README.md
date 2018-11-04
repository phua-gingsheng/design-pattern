# Design Pattern

###### Repo info
```
https://github.com/phuagingsheng/<repo>.git
git@github.com:phuagingsheng/<repo>.git
```

###### Configure Git for the first time
```
git config --global user.name "phuagingsheng" OR
git config --global user.email "phua.gingsheng@gmail.com"
```

###### If you want to simply clone this empty repository then run this command in your terminal.
```
git clone ssh://git@github.com:phuagingsheng/<repo>.git
```

###### If you already have code ready to be pushed to this repository then run this in your terminal.
```
cd existing-project
git init
git add --all
git commit -m "Initial Commit"
git remote add origin ssh://git@github.com:phuagingsheng/<repo>.git OR
git remote add origin git@github.com:phuagingsheng/<repo>.git
git push -u origin master
```

###### If your code is already tracked by Git then set this repository as your "origin" to push to.
```
cd existing-project
git remote set-url origin ssh://git@github.com:phuagingsheng/<repo>.git OR
git remote set-url git@github.com:phuagingsheng/<repo>.git
git push -u origin --all
git push origin --tags
```
