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

public val DartGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00A8E1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.6f, 25.0f)
                lineToRelative(3.0f, 0.1f)
                curveToRelative(1.1f, 0.1f, 2.2f, 0.3f, 3.4f, 0.5f)
                lineToRelative(-2.5f, -7.4f)
                lineTo(75.7f, 3.5f)
                curveToRelative(-3.4f, -3.4f, -8.0f, -4.4f, -10.4f, -2.3f)
                lineTo(29.2f, 25.1f)
                lineToRelative(57.4f, -0.1f)
                close()
                moveTo(92.7f, 28.6f)
                curveToRelative(-1.2f, -0.2f, -2.3f, -0.4f, -3.3f, -0.5f)
                lineToRelative(-2.9f, -0.1f)
                lineToRelative(-56.0f, 0.1f)
                lineToRelative(78.6f, 78.6f)
                lineToRelative(6.1f, -13.8f)
                lineToRelative(-22.5f, -64.3f)
                close()
                moveTo(28.9f, 92.2f)
                lineToRelative(64.3f, 22.7f)
                lineToRelative(13.8f, -6.1f)
                lineToRelative(-78.6f, -78.6f)
                verticalLineToRelative(56.1f)
                lineToRelative(0.1f, 2.7f)
                curveToRelative(0.0f, 0.9f, 0.1f, 2.0f, 0.4f, 3.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00A8E1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.9f, 34.3f)
                curveToRelative(-2.6f, -2.6f, -7.0f, -5.1f, -11.3f, -6.5f)
                lineTo(118.4f, 93.0f)
                lineToRelative(-6.9f, 15.7f)
                lineToRelative(15.8f, -5.2f)
                lineTo(127.3f, 54.8f)
                lineToRelative(-20.4f, -20.5f)
                close()
                moveTo(93.4f, 118.1f)
                lineToRelative(-65.0f, -22.9f)
                curveToRelative(1.4f, 4.3f, 3.8f, 8.7f, 6.5f, 11.4f)
                lineToRelative(21.3f, 21.2f)
                lineToRelative(47.6f, 0.1f)
                lineToRelative(5.3f, -16.7f)
                lineToRelative(-15.7f, 6.9f)
                close()
                moveTo(25.5f, 89.1f)
                lineToRelative(-0.1f, -2.7f)
                lineTo(25.4f, 28.9f)
                lineTo(1.7f, 65.1f)
                curveTo(-0.4f, 67.3f, 0.7f, 72.0f, 4.0f, 75.5f)
                lineToRelative(14.7f, 14.8f)
                lineToRelative(7.3f, 2.6f)
                curveToRelative(-0.3f, -1.3f, -0.5f, -2.5f, -0.5f, -3.8f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
