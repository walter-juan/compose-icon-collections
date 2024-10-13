package com.woowla.compose.icon.collections.devicons.devicons.nim

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
import com.woowla.compose.icon.collections.devicons.devicons.NimGroup

public val NimGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf3d400)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.51f, 20.14f)
                reflectiveCurveToRelative(-4.91f, 3.87f, -9.91f, 7.72f)
                arcToRelative(70.22f, 70.22f, 0.0f, false, false, -20.69f, 2.98f)
                curveToRelative(-5.03f, -3.2f, -9.46f, -6.72f, -9.46f, -6.72f)
                reflectiveCurveToRelative(-3.78f, 6.51f, -6.16f, 10.32f)
                arcToRelative(52.03f, 52.03f, 0.0f, false, false, -10.22f, 6.78f)
                curveTo(4.39f, 39.77f, 0.14f, 37.99f, 0.0f, 37.94f)
                curveToRelative(4.86f, 9.81f, 8.13f, 19.62f, 17.01f, 25.52f)
                curveToRelative(14.17f, -22.35f, 79.91f, -20.29f, 94.35f, -0.13f)
                curveToRelative(9.32f, -4.88f, 12.98f, -15.34f, 16.64f, -25.03f)
                curveToRelative(-0.4f, 0.13f, -5.4f, 1.81f, -8.64f, 3.04f)
                arcToRelative(52.52f, 52.52f, 0.0f, false, false, -9.08f, -6.9f)
                curveToRelative(-2.45f, -4.5f, -6.03f, -10.57f, -6.03f, -10.57f)
                reflectiveCurveToRelative(-4.24f, 3.15f, -9.14f, 6.58f)
                arcToRelative(97.21f, 97.21f, 0.0f, false, false, -21.4f, -2.34f)
                curveToRelative(-4.57f, -3.78f, -9.21f, -7.98f, -9.21f, -7.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffe953)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.03f, 58.76f)
                lineToRelative(11.68f, 28.27f)
                curveToRelative(20.27f, 26.74f, 72.04f, 28.6f, 94.63f, 0.52f)
                curveToRelative(5.34f, -12.04f, 12.55f, -28.95f, 12.55f, -28.95f)
                arcToRelative(61.16f, 61.16f, 0.0f, false, true, -21.03f, 17.69f)
                arcToRelative(55.85f, 55.85f, 0.0f, false, true, -13.64f, 3.63f)
                lineTo(64.23f, 66.97f)
                lineTo(39.09f, 79.65f)
                arcToRelative(71.68f, 71.68f, 0.0f, false, true, -13.64f, -3.49f)
                arcTo(64.35f, 64.35f, 0.0f, false, true, 5.03f, 58.76f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
