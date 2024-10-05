package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ChristmasTree: ImageVector
    get() {
        if (_christmasTree != null) {
            return _christmasTree!!
        }
        _christmasTree = Builder(name = "ChristmasTree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveToRelative(-0.89f, 0.0f, -1.337f, -1.077f, -0.707f, -1.707f)
                lineToRelative(2.855f, -2.857f)
                lineToRelative(-1.464f, -0.487f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.472f, -1.565f)
                lineToRelative(0.08f, -0.091f)
                lineToRelative(3.019f, -3.02f)
                lineToRelative(-0.758f, -0.379f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.343f, -1.507f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.26f, 1.601f)
                lineToRelative(-0.759f, 0.379f)
                lineToRelative(3.02f, 3.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.279f, 1.61f)
                lineToRelative(-0.113f, 0.046f)
                lineToRelative(-1.465f, 0.487f)
                lineToRelative(2.856f, 2.857f)
                curveToRelative(0.603f, 0.602f, 0.22f, 1.614f, -0.593f, 1.701f)
                lineToRelative(-0.114f, 0.006f)
                close()
            }
        }
        .build()
        return _christmasTree!!
    }

private var _christmasTree: ImageVector? = null
