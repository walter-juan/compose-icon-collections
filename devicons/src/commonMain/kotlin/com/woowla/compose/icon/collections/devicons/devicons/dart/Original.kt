package com.woowla.compose.icon.collections.devicons.devicons.dart

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
import com.woowla.compose.icon.collections.devicons.devicons.DartGroup

public val DartGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00c4b3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.2f, 34.9f)
                lineToRelative(-8.3f, -8.3f)
                verticalLineToRelative(59.7f)
                lineToRelative(0.1f, 2.8f)
                curveToRelative(0.0f, 1.3f, 0.2f, 2.8f, 0.7f, 4.3f)
                lineToRelative(65.6f, 23.1f)
                lineToRelative(16.3f, -7.2f)
                lineToRelative(-74.4f, -74.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF22d3c5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.7f, 93.4f)
                close()
                moveTo(109.6f, 109.3f)
                lineToRelative(-16.3f, 7.2f)
                lineToRelative(-65.4f, -23.1f)
                curveToRelative(1.3f, 4.8f, 4.0f, 10.1f, 7.0f, 13.2f)
                lineToRelative(21.3f, 21.2f)
                lineToRelative(47.6f, 0.1f)
                lineToRelative(5.8f, -18.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0075c9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7f, 65.1f)
                curveTo(-0.4f, 67.3f, 0.7f, 72.0f, 4.0f, 75.5f)
                lineToRelative(14.7f, 14.8f)
                lineToRelative(9.2f, 3.3f)
                curveToRelative(-0.3f, -1.5f, -0.7f, -3.0f, -0.7f, -4.3f)
                lineToRelative(-0.1f, -2.8f)
                lineToRelative(-0.2f, -59.8f)
                moveToRelative(82.7f, 82.6f)
                lineToRelative(7.2f, -16.4f)
                lineToRelative(-23.0f, -65.6f)
                curveToRelative(-1.5f, -0.3f, -3.0f, -0.6f, -4.3f, -0.7f)
                lineToRelative(-2.9f, -0.1f)
                lineToRelative(-59.6f, 0.1f)
            }
            path(fill = SolidColor(Color(0xFF00a8e1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.6f, 27.3f)
                curveToRelative(0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(109.6f, 109.3f)
                lineToRelative(17.7f, -5.8f)
                lineTo(127.3f, 54.8f)
                lineToRelative(-20.4f, -20.5f)
                curveToRelative(-3.0f, -3.0f, -8.3f, -5.8f, -13.2f, -7.0f)
                lineToRelative(23.1f, 65.6f)
            }
            path(fill = SolidColor(Color(0xFF00c4b3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.5f, 18.2f)
                lineTo(75.7f, 3.5f)
                curveToRelative(-3.4f, -3.4f, -8.0f, -4.4f, -10.4f, -2.3f)
                lineTo(26.9f, 26.6f)
                horizontalLineToRelative(59.5f)
                lineToRelative(2.9f, 0.1f)
                curveToRelative(1.3f, 0.0f, 2.8f, 0.2f, 4.3f, 0.7f)
                lineToRelative(-3.1f, -9.2f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
