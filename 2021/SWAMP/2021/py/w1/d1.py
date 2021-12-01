import util

def count_increments(depths, slice_length):
    increments = 0
    slice_start = 0
    slice_end = slice_start + slice_length
    prev = depths[slice_start:slice_end]
    for i in range(len(depths)):
        idx = i+1
        slice = depths[idx:idx+slice_length]
        if (sum(slice) > sum(prev) and len(slice) == slice_length):
            increments += 1
        prev = slice
    return increments


def part1():
    depths = util.readAsIntArray("id1.txt")
    return count_increments(depths, 1)

def part2():
    depths = util.readAsIntArray("id1.txt")
    return count_increments(depths,3)
    