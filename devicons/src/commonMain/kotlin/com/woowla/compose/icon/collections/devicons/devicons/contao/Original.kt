package com.woowla.compose.icon.collections.devicons.devicons.contao

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ContaoGroup

public val ContaoGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf37a00)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.85f, 74.89f)
                curveToRelative(3.41f, 15.79f, 6.25f, 30.83f, 16.2f, 41.65f)
                lineTo(11.08f, 116.54f)
                curveToRelative(-4.43f, 0.0f, -8.03f, -3.56f, -8.06f, -7.97f)
                lineTo(3.02f, 18.68f)
                curveToRelative(0.01f, -4.42f, 3.61f, -8.0f, 8.06f, -8.0f)
                horizontalLineToRelative(13.7f)
                arcToRelative(52.21f, 52.21f, 0.0f, false, false, -8.72f, 10.25f)
                curveTo(5.22f, 37.45f, 9.68f, 55.48f, 13.85f, 74.89f)
                close()
                moveTo(116.85f, 10.67f)
                lineTo(95.34f, 10.67f)
                curveToRelative(5.09f, 5.06f, 9.39f, 11.62f, 12.63f, 19.77f)
                lineToRelative(-32.7f, 6.86f)
                curveToRelative(-3.58f, -6.83f, -9.03f, -12.51f, -19.68f, -10.28f)
                curveToRelative(-5.88f, 1.24f, -9.77f, 4.51f, -11.5f, 8.1f)
                curveToRelative(-2.12f, 4.43f, -3.16f, 9.39f, 1.91f, 32.97f)
                curveTo(51.07f, 91.7f, 54.06f, 95.81f, 57.82f, 99.0f)
                curveToRelative(3.05f, 2.58f, 7.97f, 4.01f, 13.85f, 2.77f)
                curveToRelative(10.66f, -2.23f, 13.29f, -9.61f, 13.75f, -17.29f)
                lineToRelative(32.69f, -6.87f)
                curveToRelative(0.77f, 16.82f, -4.47f, 29.87f, -13.71f, 38.89f)
                horizontalLineToRelative(12.44f)
                curveToRelative(4.44f, 0.0f, 8.04f, -3.56f, 8.07f, -7.97f)
                lineTo(124.92f, 18.68f)
                curveToRelative(-0.01f, -4.43f, -3.62f, -8.01f, -8.07f, -8.0f)
                close()
                moveTo(116.85f, 10.67f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
