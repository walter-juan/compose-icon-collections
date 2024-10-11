package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.GradienterLine: ImageVector
    get() {
        if (_gradienterLine != null) {
            return _gradienterLine!!
        }
        _gradienterLine = Builder(name = "GradienterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.049f, 13.0f)
                horizontalLineTo(4.062f)
                curveTo(4.554f, 16.946f, 7.92f, 20.0f, 12.0f, 20.0f)
                curveTo(16.08f, 20.0f, 19.446f, 16.946f, 19.938f, 13.0f)
                horizontalLineTo(21.951f)
                curveTo(21.449f, 18.053f, 17.185f, 22.0f, 12.0f, 22.0f)
                curveTo(6.815f, 22.0f, 2.551f, 18.053f, 2.049f, 13.0f)
                close()
                moveTo(2.049f, 11.0f)
                curveTo(2.551f, 5.947f, 6.815f, 2.0f, 12.0f, 2.0f)
                curveTo(17.185f, 2.0f, 21.449f, 5.947f, 21.951f, 11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.446f, 7.054f, 16.08f, 4.0f, 12.0f, 4.0f)
                curveTo(7.92f, 4.0f, 4.554f, 7.054f, 4.062f, 11.0f)
                horizontalLineTo(2.049f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.104f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.104f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _gradienterLine!!
    }

private var _gradienterLine: ImageVector? = null
