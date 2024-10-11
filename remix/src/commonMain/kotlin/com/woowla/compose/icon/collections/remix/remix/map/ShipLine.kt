package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.ShipLine: ImageVector
    get() {
        if (_shipLine != null) {
            return _shipLine!!
        }
        _shipLine = Builder(name = "ShipLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.4f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.448f, 4.448f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 3.0f, 20.0f, 3.448f, 20.0f, 4.0f)
                verticalLineTo(10.4f)
                lineTo(21.086f, 10.726f)
                curveTo(21.597f, 10.879f, 21.898f, 11.408f, 21.768f, 11.926f)
                lineTo(20.252f, 17.994f)
                curveTo(20.168f, 17.998f, 20.084f, 18.0f, 20.0f, 18.0f)
                curveTo(19.422f, 18.0f, 18.867f, 17.902f, 18.35f, 17.721f)
                lineTo(19.6f, 12.37f)
                lineTo(12.0f, 10.0f)
                lineTo(4.4f, 12.37f)
                lineTo(5.65f, 17.721f)
                curveTo(5.133f, 17.902f, 4.578f, 18.0f, 4.0f, 18.0f)
                curveTo(3.916f, 18.0f, 3.832f, 17.998f, 3.748f, 17.994f)
                lineTo(2.232f, 11.926f)
                curveTo(2.102f, 11.408f, 2.403f, 10.879f, 2.914f, 10.726f)
                lineTo(4.0f, 10.4f)
                close()
                moveTo(6.0f, 9.8f)
                lineTo(12.0f, 8.0f)
                lineTo(18.0f, 9.8f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.8f)
                close()
                moveTo(4.0f, 20.0f)
                curveTo(5.537f, 20.0f, 6.938f, 19.422f, 8.0f, 18.472f)
                curveTo(9.062f, 19.422f, 10.463f, 20.0f, 12.0f, 20.0f)
                curveTo(13.537f, 20.0f, 14.939f, 19.422f, 16.0f, 18.472f)
                curveTo(17.062f, 19.422f, 18.463f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                curveTo(18.543f, 22.0f, 17.177f, 21.61f, 16.0f, 20.93f)
                curveTo(14.823f, 21.61f, 13.457f, 22.0f, 12.0f, 22.0f)
                curveTo(10.543f, 22.0f, 9.177f, 21.61f, 8.0f, 20.93f)
                curveTo(6.823f, 21.61f, 5.457f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _shipLine!!
    }

private var _shipLine: ImageVector? = null
