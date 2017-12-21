# This an example project of grails json views Edit




## Create Author

```
curl -X "POST" "http://localhost:8080/authors?id=123" \
     -H 'Content-Type: application/json; charset=utf-8' \
     -d $'{
  "name": "1233"
}'
```

## Get Authors

```
curl "http://localhost:8080/authors"
```

## Get Single Author

```
curl "http://localhost:8080/authors/1"
```

## Get Single Author Detail

```
curl "http://localhost:8080/authors/1/detail"
```

## Get Single Author Detail2

```
curl "http://localhost:8080/authors/1/detail2"
```

## Get Authors

```
curl "http://localhost:8080/authors2"
```

## Get Single Author

```
curl "http://localhost:8080/authors2/1"
```

## Get Single Author Detail

```
curl "http://localhost:8080/authors2/1/detail"
```

## Get Books
curl "http://localhost:8080/books"

## Get Books Detail

```
curl "http://localhost:8080/books/details"
```

## Get Single Book

```
curl "http://localhost:8080/books/1"
```

## Get Single Book Detail

```
curl "http://localhost:8080/books/1/detail"
```


