const arr = [9, 8, 7, 6, 1, 3, 2, 5, 4];

function sort(arr, left = 0, right = arr.length - 1) {
  if (left < right) {
    const index = partition(arr, left, right);
    sort(arr, left, index - 1);
    sort(arr, index + 1, right);
  }
  return arr;
}

function partition(arr, left, right) {
  const pivot = arr[left];
  let l = left;
  let r = right;
  while (l < r) {
    while (l < r && arr[r] > pivot) r--;
    arr[l] = arr[r];
    while (l < r && arr[l] <= pivot) l++;
    arr[r] = arr[l];
  }

  arr[l] = pivot;
  return l;
}

console.log(sort(arr));
