db.createUser({
  user: "root",
  pwd: "example",
  roles: [
    {
      role: "readWrite",
      db: "data"
    }
  ]
});

db.createCollection("my_collection");

db.my_collection.insertMany([
  { identifier: {key1: 1, key2: "aa" }, content: "Sample Content 1" },
  { identifier: {key1: 1, key2: "bbb" }, content: "Sample Content 1.1" },
  { identifier: {key1: 2, key2: "bb" }, content: "Sample Content 2" },
  { identifier: {key1: 3, key2: "ccc" }, content: "Sample Content 3" },
  { identifier: {key1: 4, key2: "ddd" }, content: "Sample Content 4" },
]);