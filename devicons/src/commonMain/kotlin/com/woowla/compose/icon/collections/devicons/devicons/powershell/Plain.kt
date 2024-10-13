package com.woowla.compose.icon.collections.devicons.devicons.powershell

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PowershellGroup

public val PowershellGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(124.91f, 19.36f)
                curveToRelative(-0.96f, -1.2f, -2.42f, -1.86f, -4.11f, -1.86f)
                horizontalLineToRelative(-92.61f)
                curveToRelative(-3.4f, 0.0f, -6.66f, 2.64f, -7.44f, 6.01f)
                lineTo(2.16f, 104.02f)
                curveToRelative(-0.4f, 1.71f, -0.06f, 3.39f, 0.93f, 4.62f)
                curveToRelative(0.96f, 1.2f, 2.42f, 1.86f, 4.11f, 1.86f)
                verticalLineToRelative(0.0f)
                lineTo(99.81f, 110.5f)
                curveToRelative(3.4f, 0.0f, 6.66f, -2.64f, 7.44f, -6.02f)
                lineToRelative(18.59f, -80.51f)
                curveToRelative(0.4f, -1.71f, 0.06f, -3.39f, -0.93f, -4.62f)
                close()
                moveTo(26.32f, 96.53f)
                curveToRelative(-1.74f, -2.4f, -1.32f, -5.67f, 0.94f, -7.32f)
                lineToRelative(37.38f, -27.07f)
                verticalLineToRelative(-0.56f)
                lineTo(41.16f, 36.6f)
                curveToRelative(-1.92f, -2.04f, -1.72f, -5.33f, 0.44f, -7.36f)
                curveToRelative(2.16f, -2.03f, 5.47f, -2.02f, 7.38f, 0.02f)
                lineToRelative(28.18f, 29.98f)
                curveToRelative(1.6f, 1.7f, 1.72f, 4.28f, 0.46f, 6.26f)
                curveToRelative(-0.38f, 0.77f, -1.18f, 1.63f, -2.59f, 2.62f)
                lineToRelative(-41.45f, 29.77f)
                curveToRelative(-2.26f, 1.64f, -5.51f, 1.03f, -7.26f, -1.36f)
                close()
                moveTo(85.87f, 97.07f)
                lineTo(63.53f, 97.07f)
                curveToRelative(-2.6f, 0.0f, -4.7f, -2.08f, -4.7f, -4.65f)
                reflectiveCurveToRelative(2.11f, -4.65f, 4.7f, -4.65f)
                horizontalLineToRelative(22.33f)
                curveToRelative(2.6f, 0.0f, 4.7f, 2.08f, 4.7f, 4.65f)
                reflectiveCurveToRelative(-2.1f, 4.65f, -4.7f, 4.65f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
