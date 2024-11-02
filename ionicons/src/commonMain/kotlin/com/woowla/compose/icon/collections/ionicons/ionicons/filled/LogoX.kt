package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.LogoX: ImageVector
    get() {
        if (_logoX != null) {
            return _logoX!!
        }
        _logoX = Builder(name = "LogoX", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.333f, 6.929f)
                lineTo(14.546f, 1.0f)
                horizontalLineTo(13.311f)
                lineTo(8.783f, 6.147f)
                lineTo(5.169f, 1.0f)
                horizontalLineTo(1.0f)
                lineTo(6.466f, 8.783f)
                lineTo(1.0f, 15.0f)
                horizontalLineTo(2.235f)
                lineTo(7.014f, 9.564f)
                lineTo(10.831f, 15.0f)
                horizontalLineTo(15.0f)
                lineTo(9.333f, 6.929f)
                close()
                moveTo(7.641f, 8.852f)
                lineTo(7.087f, 8.076f)
                lineTo(2.68f, 1.911f)
                horizontalLineTo(4.578f)
                lineTo(8.135f, 6.888f)
                lineTo(8.687f, 7.664f)
                lineTo(13.31f, 14.133f)
                horizontalLineTo(11.413f)
                lineTo(7.641f, 8.852f)
                close()
            }
        }
        .build()
        return _logoX!!
    }

private var _logoX: ImageVector? = null
