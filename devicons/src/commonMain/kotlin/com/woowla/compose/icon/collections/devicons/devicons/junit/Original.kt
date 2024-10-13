package com.woowla.compose.icon.collections.devicons.devicons.junit

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
import com.woowla.compose.icon.collections.devicons.devicons.JunitGroup

public val JunitGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFdc514a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.29f, 0.43f)
                curveTo(48.55f, 0.13f, 33.54f, 4.28f, 20.69f, 16.16f)
                curveToRelative(-26.89f, 24.87f, -27.69f, 67.44f, -1.72f, 93.22f)
                curveToRelative(4.67f, 4.64f, 10.24f, 8.94f, 16.34f, 11.55f)
                curveToRelative(1.6f, -5.36f, 1.28f, -11.84f, 0.78f, -18.21f)
                curveToRelative(-0.12f, -0.13f, -0.25f, -0.25f, -0.34f, -0.39f)
                curveToRelative(-1.71f, -2.54f, -0.44f, -9.18f, -0.44f, -12.2f)
                curveToRelative(10.73f, 1.9f, 19.48f, 7.81f, 30.97f, 4.38f)
                curveToRelative(11.25f, -3.36f, 15.93f, -19.58f, 6.02f, -27.25f)
                curveToRelative(-5.99f, -4.64f, -14.87f, -4.01f, -21.93f, -3.16f)
                curveToRelative(-4.24f, 0.51f, -9.54f, 2.08f, -12.46f, -2.43f)
                curveToRelative(-1.73f, -2.65f, 0.06f, -9.17f, 0.35f, -12.18f)
                curveToRelative(0.07f, -0.76f, 0.15f, -1.53f, 0.23f, -2.29f)
                curveToRelative(0.75f, -9.33f, 2.0f, -18.76f, 2.0f, -28.09f)
                horizontalLineToRelative(45.59f)
                verticalLineTo(3.3f)
                curveTo(78.75f, 1.62f, 71.45f, 0.57f, 64.29f, 0.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF23a161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.71f, 3.27f)
                verticalLineTo(31.12f)
                horizontalLineTo(52.53f)
                lineToRelative(-1.72f, 21.42f)
                curveToRelative(7.36f, -0.58f, 14.19f, -1.88f, 21.54f, -0.15f)
                curveToRelative(5.04f, 1.19f, 9.78f, 3.57f, 13.28f, 7.43f)
                curveToRelative(9.77f, 10.77f, 7.85f, 30.99f, -3.37f, 40.08f)
                curveToRelative(-3.16f, 2.56f, -6.77f, 4.24f, -10.58f, 5.32f)
                curveToRelative(-3.52f, 1.13f, -7.05f, 1.6f, -10.6f, 1.63f)
                arcToRelative(72.97f, 72.97f, 0.0f, false, true, -3.81f, 0.11f)
                curveToRelative(-5.52f, 0.0f, -11.05f, -0.72f, -16.37f, -2.21f)
                curveToRelative(-1.35f, -0.38f, -3.45f, -0.91f, -4.76f, -1.89f)
                curveToRelative(-0.28f, -0.06f, -0.56f, -0.12f, -0.84f, -0.19f)
                lineToRelative(-0.43f, 18.0f)
                curveToRelative(34.19f, 18.13f, 77.75f, -1.27f, 90.01f, -36.85f)
                curveToRelative(10.37f, -30.07f, -5.69f, -72.67f, -39.17f, -80.56f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
