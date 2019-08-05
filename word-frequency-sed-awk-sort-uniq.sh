# Read from the file words.txt and output the word frequency list to stdout.
sed 's/ /\n/g' words.txt | sed '/^$/d' |\
sort | uniq -c | awk '{print $2, $1}' | sort -n -r -k2