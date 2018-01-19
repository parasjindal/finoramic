import json
import pip
f = open('json').read()
l = json.loads(f)
l = l['Dependencies']
num=0
failed=[]
for a in l:
	try:
		if pip.main(['install','{0}=={1}'.format(a,l[a])])!=0:
			num=1
			failed.append(a)
	except PipException as exc:
		pass

if num==0:
	print ("Success")
else:
	print ("Failed Packages:")
	for a in failed:
		print (a)