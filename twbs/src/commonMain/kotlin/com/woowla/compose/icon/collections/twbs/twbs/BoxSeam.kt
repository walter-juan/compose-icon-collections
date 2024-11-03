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

public val Twbs.BoxSeam: ImageVector
    get() {
        if (_boxSeam != null) {
            return _boxSeam!!
        }
        _boxSeam = Builder(name = "BoxSeam", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.186f, 1.113f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.372f, 0.0f)
                lineTo(1.846f, 3.5f)
                lineToRelative(2.404f, 0.961f)
                lineTo(10.404f, 2.0f)
                close()
                moveTo(11.75f, 2.539f)
                lineTo(5.596f, 5.0f)
                lineTo(8.0f, 5.961f)
                lineTo(14.154f, 3.5f)
                close()
                moveTo(15.0f, 4.239f)
                lineTo(8.5f, 6.839f)
                verticalLineToRelative(7.922f)
                lineToRelative(6.5f, -2.6f)
                lineTo(15.0f, 4.24f)
                close()
                moveTo(7.5f, 14.762f)
                lineTo(7.5f, 6.838f)
                lineTo(1.0f, 4.239f)
                verticalLineToRelative(7.923f)
                close()
                moveTo(7.443f, 0.184f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.114f, 0.0f)
                lineToRelative(7.129f, 2.852f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 3.5f)
                verticalLineToRelative(8.662f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.629f, 0.928f)
                lineToRelative(-7.185f, 2.874f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.372f, 0.0f)
                lineTo(0.63f, 13.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.63f, -0.928f)
                lineTo(0.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.314f, -0.464f)
                close()
            }
        }
        .build()
        return _boxSeam!!
    }

private var _boxSeam: ImageVector? = null
