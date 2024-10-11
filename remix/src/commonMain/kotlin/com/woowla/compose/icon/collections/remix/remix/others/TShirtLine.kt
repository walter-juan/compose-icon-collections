package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.TShirtLine: ImageVector
    get() {
        if (_tShirtLine != null) {
            return _tShirtLine!!
        }
        _tShirtLine = Builder(name = "TShirtLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.514f, 5.0f)
                lineTo(17.12f, 2.393f)
                curveTo(17.511f, 2.003f, 18.144f, 2.003f, 18.534f, 2.393f)
                lineTo(22.777f, 6.636f)
                curveTo(23.167f, 7.027f, 23.167f, 7.66f, 22.777f, 8.05f)
                lineTo(18.999f, 11.828f)
                verticalLineTo(21.0f)
                curveTo(18.999f, 21.552f, 18.551f, 22.0f, 17.999f, 22.0f)
                horizontalLineTo(5.999f)
                curveTo(5.447f, 22.0f, 4.999f, 21.552f, 4.999f, 21.0f)
                verticalLineTo(11.828f)
                lineTo(1.221f, 8.05f)
                curveTo(0.83f, 7.66f, 0.83f, 7.027f, 1.221f, 6.636f)
                lineTo(5.463f, 2.393f)
                curveTo(5.854f, 2.003f, 6.487f, 2.003f, 6.877f, 2.393f)
                lineTo(9.484f, 5.0f)
                horizontalLineTo(14.514f)
                close()
                moveTo(15.342f, 7.0f)
                horizontalLineTo(8.656f)
                lineTo(6.17f, 4.515f)
                lineTo(3.342f, 7.343f)
                lineTo(6.999f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.999f)
                verticalLineTo(11.0f)
                lineTo(20.656f, 7.343f)
                lineTo(17.827f, 4.515f)
                lineTo(15.342f, 7.0f)
                close()
            }
        }
        .build()
        return _tShirtLine!!
    }

private var _tShirtLine: ImageVector? = null
