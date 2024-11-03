package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudArrowUpFill: ImageVector
    get() {
        if (_cloudArrowUpFill != null) {
            return _cloudArrowUpFill!!
        }
        _cloudArrowUpFill = Builder(name = "CloudArrowUpFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, -3.594f, 1.342f)
                curveToRelative(-0.766f, 0.66f, -1.321f, 1.52f, -1.464f, 2.383f)
                curveTo(1.266f, 6.095f, 0.0f, 7.555f, 0.0f, 9.318f)
                curveTo(0.0f, 11.366f, 1.708f, 13.0f, 3.781f, 13.0f)
                horizontalLineToRelative(8.906f)
                curveTo(14.502f, 13.0f, 16.0f, 11.57f, 16.0f, 9.773f)
                curveToRelative(0.0f, -1.636f, -1.242f, -2.969f, -2.834f, -3.194f)
                curveTo(12.923f, 3.999f, 10.69f, 2.0f, 8.0f, 2.0f)
                moveToRelative(2.354f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(6.707f)
                lineTo(6.354f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudArrowUpFill!!
    }

private var _cloudArrowUpFill: ImageVector? = null
