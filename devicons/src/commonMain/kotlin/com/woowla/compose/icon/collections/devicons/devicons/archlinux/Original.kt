package com.woowla.compose.icon.collections.devicons.devicons.archlinux

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.woowla.compose.icon.collections.devicons.devicons.ArchlinuxGroup

public val ArchlinuxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1791cf)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveToRelative(61.11f, 4.89f)
                curveToRelative(-5.29f, 12.9f, -8.48f, 21.34f, -14.38f, 33.86f)
                curveToRelative(3.61f, 3.8f, 8.05f, 8.24f, 15.25f, 13.25f)
                curveTo(54.24f, 48.83f, 48.96f, 45.65f, 45.02f, 42.35f)
                curveTo(37.48f, 58.0f, 25.66f, 80.28f, 1.69f, 123.12f)
                curveTo(20.53f, 112.3f, 35.14f, 105.64f, 48.75f, 103.09f)
                curveToRelative(-0.59f, -2.5f, -0.92f, -5.2f, -0.89f, -8.02f)
                lineToRelative(0.02f, -0.6f)
                curveToRelative(0.3f, -12.0f, 6.58f, -21.24f, 14.02f, -20.61f)
                curveToRelative(7.44f, 0.63f, 13.22f, 10.87f, 12.92f, 22.88f)
                curveToRelative(-0.05f, 2.26f, -0.31f, 4.43f, -0.76f, 6.45f)
                curveToRelative(13.46f, 2.62f, 27.91f, 9.27f, 46.5f, 19.94f)
                curveToRelative(-3.66f, -6.71f, -6.93f, -12.76f, -10.06f, -18.52f)
                curveToRelative(-4.92f, -3.79f, -10.05f, -8.73f, -20.52f, -14.07f)
                curveToRelative(7.2f, 1.86f, 12.35f, 4.01f, 16.36f, 6.41f)
                curveTo(74.58f, 38.12f, 72.0f, 30.31f, 61.11f, 4.89f)
                close()
                moveTo(61.11f, 4.89f)
            }
            path(fill = SolidColor(Color(0xFF1791cf)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(121.14f, 112.57f)
                verticalLineToRelative(-3.24f)
                horizontalLineToRelative(-1.21f)
                verticalLineToRelative(-0.43f)
                horizontalLineToRelative(2.93f)
                verticalLineToRelative(0.43f)
                horizontalLineToRelative(-1.22f)
                verticalLineToRelative(3.24f)
                horizontalLineToRelative(-0.49f)
            }
            path(fill = SolidColor(Color(0xFF1791cf)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(123.36f, 112.57f)
                verticalLineToRelative(-3.68f)
                horizontalLineToRelative(0.73f)
                lineToRelative(0.88f, 2.6f)
                curveToRelative(0.08f, 0.24f, 0.14f, 0.43f, 0.18f, 0.54f)
                curveToRelative(0.04f, -0.13f, 0.11f, -0.33f, 0.2f, -0.59f)
                lineToRelative(0.88f, -2.56f)
                horizontalLineToRelative(0.66f)
                verticalLineToRelative(3.68f)
                horizontalLineToRelative(-0.47f)
                verticalLineToRelative(-3.08f)
                lineToRelative(-1.07f, 3.08f)
                horizontalLineToRelative(-0.44f)
                lineToRelative(-1.07f, -3.13f)
                verticalLineToRelative(3.13f)
                horizontalLineToRelative(-0.47f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
