package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Awwwards: ImageVector
    get() {
        if (_awwwards != null) {
            return _awwwards!!
        }
        _awwwards = Builder(name = "Awwwards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.72f, 5.6f)
                lineToRelative(-2.24f, 8.68f)
                lineToRelative(-2.12f, -8.68f)
                lineTo(7.47f, 5.6f)
                lineToRelative(-2.12f, 8.68f)
                lineTo(3.11f, 5.6f)
                lineTo(0.0f, 5.6f)
                lineToRelative(4.01f, 12.65f)
                horizontalLineToRelative(2.74f)
                lineToRelative(2.17f, -8.18f)
                lineToRelative(2.16f, 8.18f)
                horizontalLineToRelative(2.74f)
                lineTo(17.83f, 5.6f)
                close()
                moveTo(19.82f, 16.3f)
                curveToRelative(0.0f, 1.2f, 0.9f, 2.1f, 2.09f, 2.1f)
                curveToRelative(1.2f, 0.0f, 2.09f, -0.9f, 2.09f, -2.1f)
                reflectiveCurveToRelative(-0.9f, -2.12f, -2.1f, -2.12f)
                curveToRelative(-1.19f, 0.0f, -2.08f, 0.9f, -2.08f, 2.11f)
            }
        }
        .build()
        return _awwwards!!
    }

private var _awwwards: ImageVector? = null
