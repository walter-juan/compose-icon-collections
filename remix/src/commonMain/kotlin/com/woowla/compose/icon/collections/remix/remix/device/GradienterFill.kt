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

public val DeviceGroup.GradienterFill: ImageVector
    get() {
        if (_gradienterFill != null) {
            return _gradienterFill!!
        }
        _gradienterFill = Builder(name = "GradienterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.126f, 11.0f)
                horizontalLineTo(4.062f)
                curveTo(4.021f, 11.328f, 4.0f, 11.661f, 4.0f, 12.0f)
                curveTo(4.0f, 12.339f, 4.021f, 12.672f, 4.062f, 13.0f)
                horizontalLineTo(8.126f)
                curveTo(8.044f, 12.68f, 8.0f, 12.345f, 8.0f, 12.0f)
                curveTo(8.0f, 11.655f, 8.044f, 11.32f, 8.126f, 11.0f)
                close()
                moveTo(15.874f, 11.0f)
                curveTo(15.956f, 11.32f, 16.0f, 11.655f, 16.0f, 12.0f)
                curveTo(16.0f, 12.345f, 15.956f, 12.68f, 15.874f, 13.0f)
                horizontalLineTo(19.938f)
                curveTo(19.979f, 12.672f, 20.0f, 12.339f, 20.0f, 12.0f)
                curveTo(20.0f, 11.661f, 19.979f, 11.328f, 19.938f, 11.0f)
                horizontalLineTo(15.874f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _gradienterFill!!
    }

private var _gradienterFill: ImageVector? = null
