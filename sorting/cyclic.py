
def cyclic (arr):
    i = 0
    while i < len(arr):
        correct  = arr[i] -1

        if arr[i] != arr[correct]:
            # we can swap like this
            arr[i],arr[correct] = arr[correct],arr[i]
        else :
            i += 1

# def swap(arr,first,second):
#     temp = arr[first]
#     arr[first] = arr[second]
#     arr[second] = temp

arr = [5,4,3,2,1]
cyclic(arr)
print(arr)