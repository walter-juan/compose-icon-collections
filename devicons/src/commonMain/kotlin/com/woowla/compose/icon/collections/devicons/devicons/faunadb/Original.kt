package com.woowla.compose.icon.collections.devicons.devicons.faunadb

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FaunadbGroup

public val FaunadbGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3a1ab6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.06f, 26.91f)
                curveToRelative(-7.78f, 2.65f, -11.52f, 7.4f, -14.07f, 14.8f)
                curveToRelative(-0.66f, 1.98f, -2.31f, 4.16f, -4.15f, 5.64f)
                lineToRelative(6.38f, 6.98f)
                lineToRelative(-20.24f, -14.46f)
                lineTo(7.11f, 0.0f)
                reflectiveCurveToRelative(4.04f, 26.74f, 5.43f, 36.58f)
                curveToRelative(0.99f, 6.93f, 2.68f, 10.05f, 8.02f, 13.2f)
                lineToRelative(2.14f, 1.17f)
                lineToRelative(9.22f, 4.97f)
                lineToRelative(-5.48f, -2.9f)
                lineToRelative(25.26f, 14.09f)
                lineToRelative(-0.16f, 0.38f)
                lineToRelative(-27.19f, -12.87f)
                curveToRelative(1.44f, 5.05f, 4.23f, 14.76f, 5.43f, 19.05f)
                curveToRelative(1.28f, 4.62f, 2.72f, 6.31f, 7.12f, 7.95f)
                lineTo(45.0f, 84.64f)
                lineToRelative(5.02f, -2.02f)
                lineToRelative(-6.38f, 4.33f)
                lineToRelative(-31.88f, 41.33f)
                curveToRelative(21.19f, -20.1f, 39.12f, -27.25f, 52.25f, -33.09f)
                curveToRelative(16.74f, -7.4f, 26.82f, -12.15f, 33.4f, -29.23f)
                curveToRelative(4.69f, -11.98f, 8.35f, -27.33f, 13.0f, -33.25f)
                lineToRelative(9.91f, -12.95f)
                reflectiveCurveToRelative(-20.53f, 5.55f, -25.26f, 7.15f)
                close()
                moveTo(95.06f, 26.91f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
