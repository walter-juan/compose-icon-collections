package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ClipboardDocument: ImageVector
    get() {
        if (_clipboardDocument != null) {
            return _clipboardDocument!!
        }
        _clipboardDocument = Builder(name = "ClipboardDocument", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.663f, 3.118f)
                curveTo(17.888f, 3.133f, 18.112f, 3.15f, 18.336f, 3.169f)
                curveTo(19.875f, 3.297f, 21.0f, 4.603f, 21.0f, 6.108f)
                verticalLineTo(15.75f)
                curveTo(21.0f, 17.407f, 19.657f, 18.75f, 18.0f, 18.75f)
                verticalLineTo(16.5f)
                curveTo(18.0f, 10.578f, 13.424f, 5.725f, 7.616f, 5.283f)
                curveTo(7.94f, 4.151f, 8.916f, 3.272f, 10.164f, 3.169f)
                curveTo(10.388f, 3.15f, 10.612f, 3.133f, 10.837f, 3.118f)
                curveTo(11.337f, 2.156f, 12.342f, 1.5f, 13.5f, 1.5f)
                horizontalLineTo(15.0f)
                curveTo(16.158f, 1.5f, 17.163f, 2.156f, 17.663f, 3.118f)
                close()
                moveTo(12.0f, 4.5f)
                curveTo(12.0f, 3.672f, 12.672f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(15.828f, 3.0f, 16.5f, 3.672f, 16.5f, 4.5f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.625f)
                curveTo(3.0f, 7.589f, 3.839f, 6.75f, 4.875f, 6.75f)
                horizontalLineTo(5.25f)
                curveTo(7.321f, 6.75f, 9.0f, 8.429f, 9.0f, 10.5f)
                verticalLineTo(12.375f)
                curveTo(9.0f, 13.41f, 9.839f, 14.25f, 10.875f, 14.25f)
                horizontalLineTo(12.75f)
                curveTo(14.821f, 14.25f, 16.5f, 15.929f, 16.5f, 18.0f)
                verticalLineTo(20.625f)
                curveTo(16.5f, 21.66f, 15.66f, 22.5f, 14.625f, 22.5f)
                horizontalLineTo(4.875f)
                curveTo(3.839f, 22.5f, 3.0f, 21.66f, 3.0f, 20.625f)
                verticalLineTo(8.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                curveTo(10.5f, 9.187f, 10.018f, 7.986f, 9.221f, 7.066f)
                curveTo(12.62f, 7.954f, 15.296f, 10.63f, 16.184f, 14.029f)
                curveTo(15.264f, 13.232f, 14.063f, 12.75f, 12.75f, 12.75f)
                horizontalLineTo(10.875f)
                curveTo(10.668f, 12.75f, 10.5f, 12.582f, 10.5f, 12.375f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _clipboardDocument!!
    }

private var _clipboardDocument: ImageVector? = null
