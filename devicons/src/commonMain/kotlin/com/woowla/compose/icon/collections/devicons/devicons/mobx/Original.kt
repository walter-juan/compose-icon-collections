package com.woowla.compose.icon.collections.devicons.devicons.mobx

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
import com.woowla.compose.icon.collections.devicons.devicons.MobxGroup

public val MobxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFea6618)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 118.19f)
                verticalLineTo(9.81f)
                curveToRelative(0.0f, -4.45f, -2.96f, -8.2f, -7.02f, -9.4f)
                lineToRelative(-4.61f, 2.76f)
                lineToRelative(-51.13f, 54.52f)
                lineToRelative(-1.61f, 5.01f)
                lineToRelative(-0.93f, 4.81f)
                lineToRelative(15.94f, 59.59f)
                lineToRelative(2.46f, 0.91f)
                horizontalLineToRelative(37.08f)
                curveToRelative(5.41f, 0.0f, 9.81f, -4.39f, 9.81f, -9.81f)
            }
            path(fill = SolidColor(Color(0xFFd65813)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 9.81f)
                verticalLineToRelative(108.39f)
                arcToRelative(9.79f, 9.79f, 0.0f, false, false, 4.25f, 8.08f)
                lineToRelative(3.14f, -1.5f)
                lineToRelative(54.12f, -57.95f)
                lineToRelative(2.12f, -4.13f)
                lineToRelative(0.08f, -4.0f)
                lineToRelative(-14.73f, -56.04f)
                lineTo(46.76f, 0.0f)
                horizontalLineTo(9.81f)
                curveTo(4.39f, 0.0f, 0.0f, 4.39f, 0.0f, 9.81f)
            }
            path(fill = SolidColor(Color(0xFFe05e11)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.64f, 62.69f)
                lineTo(120.98f, 0.4f)
                arcTo(9.78f, 9.78f, 0.0f, false, false, 118.19f, 0.0f)
                lineTo(46.76f, 0.0f)
                close()
                moveTo(63.64f, 62.69f)
            }
            path(fill = SolidColor(Color(0xFFde5c16)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.81f, 128.0f)
                horizontalLineToRelative(71.31f)
                lineTo(63.64f, 62.69f)
                lineTo(4.25f, 126.27f)
                arcTo(9.74f, 9.74f, 0.0f, false, false, 9.81f, 128.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(47.46f, 48.52f)
                horizontalLineToRelative(7.11f)
                curveToRelative(2.84f, 10.69f, 6.06f, 20.07f, 9.66f, 28.54f)
                curveToRelative(4.07f, -9.53f, 7.06f, -18.92f, 9.59f, -28.54f)
                horizontalLineToRelative(6.72f)
                curveToRelative(-3.01f, 11.96f, -7.93f, 24.02f, -13.57f, 36.46f)
                lineTo(61.03f, 84.98f)
                curveToRelative(-5.41f, -11.79f, -10.02f, -23.92f, -13.57f, -36.46f)
                close()
                moveTo(24.0f, 29.99f)
                horizontalLineToRelative(15.81f)
                verticalLineToRelative(67.82f)
                lineTo(23.93f, 97.81f)
                verticalLineToRelative(-5.23f)
                horizontalLineToRelative(9.73f)
                lineTo(33.66f, 35.07f)
                lineTo(24.0f, 35.07f)
                close()
                moveTo(104.08f, 35.07f)
                horizontalLineToRelative(-9.66f)
                verticalLineToRelative(57.5f)
                horizontalLineToRelative(9.73f)
                verticalLineToRelative(5.23f)
                lineTo(88.27f, 97.81f)
                lineTo(88.27f, 29.99f)
                horizontalLineToRelative(15.81f)
                close()
                moveTo(104.08f, 35.07f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
