package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.WindowX: ImageVector
    get() {
        if (_windowX != null) {
            return _windowX!!
        }
        _windowX = Builder(name = "WindowX", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                moveTo(4.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                moveToRelative(2.0f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(14.0f, 7.0f)
                lineTo(1.0f, 7.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(1.0f, 6.0f)
                horizontalLineToRelative(13.0f)
                lineTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                moveToRelative(-4.854f, -1.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                lineToRelative(0.647f, 0.646f)
                lineToRelative(-0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineToRelative(0.646f, -0.647f)
                lineToRelative(0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineToRelative(-0.647f, -0.646f)
                lineToRelative(0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineToRelative(-0.646f, 0.647f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.0f)
            }
        }
        .build()
        return _windowX!!
    }

private var _windowX: ImageVector? = null
