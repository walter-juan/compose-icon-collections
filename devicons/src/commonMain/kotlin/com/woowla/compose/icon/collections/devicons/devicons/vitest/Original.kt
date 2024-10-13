package com.woowla.compose.icon.collections.devicons.devicons.vitest

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
import com.woowla.compose.icon.collections.devicons.devicons.VitestGroup

public val VitestGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFCC72B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(96.06f, 40.82f)
                lineToRelative(-30.6f, 44.24f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -4.34f, -0.01f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, true, -0.45f, -1.6f)
                lineToRelative(1.23f, -24.43f)
                lineToRelative(-19.77f, -4.19f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -1.89f, -1.59f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 0.28f, -2.45f)
                lineToRelative(30.6f, -44.24f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, 3.01f, -1.0f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, true, 1.33f, 1.0f)
                curveToRelative(0.32f, 0.47f, 0.48f, 1.03f, 0.45f, 1.6f)
                lineToRelative(-1.22f, 24.43f)
                lineToRelative(19.77f, 4.19f)
                curveToRelative(0.42f, 0.09f, 0.82f, 0.28f, 1.15f, 0.56f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, true, 0.47f, 3.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF729B1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.01f, 122.18f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, true, -4.38f, -1.82f)
                lineTo(30.72f, 91.46f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 4.38f, -10.56f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 4.38f, 1.8f)
                lineToRelative(24.53f, 24.53f)
                lineToRelative(53.45f, -53.44f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 8.76f, 8.76f)
                lineTo(68.39f, 120.37f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -4.38f, 1.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF729B1B)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.99f, 122.18f)
                curveToRelative(0.81f, 0.0f, 1.62f, -0.16f, 2.37f, -0.47f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, 2.01f, -1.35f)
                lineToRelative(28.91f, -28.91f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, -0.01f, -8.75f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -8.75f, -0.01f)
                lineToRelative(-24.53f, 24.53f)
                lineTo(10.54f, 53.78f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -8.76f, 8.76f)
                lineToRelative(57.83f, 57.83f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 4.38f, 1.82f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
