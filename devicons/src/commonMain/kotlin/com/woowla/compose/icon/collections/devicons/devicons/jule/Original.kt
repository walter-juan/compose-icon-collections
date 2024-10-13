package com.woowla.compose.icon.collections.devicons.devicons.jule

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JuleGroup

public val JuleGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF5f7389)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(39.95f, 70.57f)
                lineToRelative(19.55f, 15.82f)
                verticalLineToRelative(25.43f)
                lineToRelative(-35.29f, -28.49f)
                close()
                moveTo(20.61f, 54.85f)
                lineTo(31.89f, 64.0f)
                lineTo(20.61f, 73.12f)
                close()
                moveTo(68.49f, 86.41f)
                lineTo(88.05f, 70.6f)
                lineTo(103.79f, 83.35f)
                lineTo(68.49f, 111.84f)
                close()
                moveTo(24.21f, 44.68f)
                lineTo(59.48f, 16.19f)
                verticalLineToRelative(25.43f)
                lineToRelative(-19.53f, 15.82f)
                close()
                moveTo(107.39f, 54.88f)
                verticalLineToRelative(18.29f)
                lineToRelative(-11.28f, -9.15f)
                close()
                moveTo(68.49f, 41.61f)
                verticalLineToRelative(-25.43f)
                lineToRelative(35.27f, 28.49f)
                lineToRelative(-15.74f, 12.75f)
                close()
                moveTo(114.43f, 40.12f)
                lineTo(66.51f, 1.43f)
                curveToRelative(-0.82f, -0.62f, -1.67f, -0.93f, -2.52f, -0.93f)
                reflectiveCurveToRelative(-1.69f, 0.31f, -2.5f, 0.93f)
                lineToRelative(-47.92f, 38.69f)
                curveToRelative(-1.32f, 1.08f, -1.98f, 2.59f, -1.98f, 4.53f)
                verticalLineToRelative(38.69f)
                curveToRelative(0.0f, 1.94f, 0.66f, 3.45f, 1.98f, 4.53f)
                lineToRelative(47.92f, 38.69f)
                curveToRelative(0.81f, 0.62f, 1.64f, 0.93f, 2.5f, 0.93f)
                reflectiveCurveToRelative(1.7f, -0.31f, 2.52f, -0.93f)
                lineToRelative(47.92f, -38.69f)
                curveToRelative(1.32f, -1.08f, 1.98f, -2.59f, 1.98f, -4.53f)
                verticalLineToRelative(-38.69f)
                curveToRelative(0.0f, -1.94f, -0.66f, -3.45f, -1.98f, -4.53f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
