package com.woowla.compose.icon.collections.devicons.devicons.ubuntu

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
import com.woowla.compose.icon.collections.devicons.devicons.UbuntuGroup

public val UbuntuGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFE95420)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.66f, 0.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(80.66f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.44f, 90.31f)
                curveToRelative(4.61f, 0.0f, 8.35f, -3.77f, 8.35f, -8.42f)
                curveToRelative(0.0f, -4.65f, -3.74f, -8.42f, -8.35f, -8.42f)
                curveToRelative(-4.61f, 0.0f, -8.35f, 3.77f, -8.35f, 8.42f)
                curveToRelative(0.0f, 4.65f, 3.74f, 8.42f, 8.35f, 8.42f)
                close()
                moveTo(77.22f, 71.86f)
                curveToRelative(4.61f, 0.0f, 8.35f, -3.77f, 8.35f, -8.42f)
                curveToRelative(0.0f, -4.65f, -3.74f, -8.42f, -8.35f, -8.42f)
                curveToRelative(-4.61f, 0.0f, -8.35f, 3.77f, -8.35f, 8.42f)
                curveToRelative(0.0f, 4.65f, 3.74f, 8.42f, 8.35f, 8.42f)
                close()
                moveTo(61.28f, 103.56f)
                curveToRelative(-6.02f, -1.3f, -11.04f, -5.17f, -13.87f, -10.66f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, true, -7.14f, 0.88f)
                curveToRelative(3.42f, 8.46f, 10.67f, 14.61f, 19.57f, 16.53f)
                curveToRelative(1.95f, 0.42f, 3.94f, 0.63f, 5.93f, 0.61f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, true, -2.44f, -7.04f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, true, -2.05f, -0.34f)
                lineToRelative(-0.0f, 0.0f)
                close()
                moveTo(75.34f, 112.02f)
                curveToRelative(4.61f, 0.0f, 8.35f, -3.77f, 8.35f, -8.42f)
                curveToRelative(0.0f, -4.65f, -3.74f, -8.42f, -8.35f, -8.42f)
                curveToRelative(-4.61f, 0.0f, -8.35f, 3.77f, -8.35f, 8.42f)
                curveToRelative(0.0f, 4.65f, 3.74f, 8.42f, 8.35f, 8.42f)
                close()
                moveTo(86.96f, 100.51f)
                curveToRelative(2.6f, -3.3f, 4.43f, -7.2f, 5.3f, -11.34f)
                arcToRelative(27.77f, 27.77f, 0.0f, false, false, -3.94f, -20.96f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -4.7f, 5.54f)
                arcToRelative(20.74f, 20.74f, 0.0f, false, true, 1.93f, 13.98f)
                arcToRelative(20.66f, 20.66f, 0.0f, false, true, -2.6f, 6.52f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, true, 4.0f, 6.27f)
                lineToRelative(-0.0f, -0.0f)
                close()
                moveTo(41.8f, 69.82f)
                arcToRelative(11.78f, 11.78f, 0.0f, false, true, 3.16f, 0.26f)
                curveToRelative(1.36f, 0.29f, 2.64f, 0.81f, 3.81f, 1.55f)
                curveToRelative(3.76f, -5.45f, 9.83f, -8.72f, 16.4f, -8.84f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, true, 2.53f, -6.83f)
                curveToRelative(-10.5f, -0.84f, -20.71f, 4.63f, -25.91f, 13.87f)
                lineToRelative(0.0f, -0.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
