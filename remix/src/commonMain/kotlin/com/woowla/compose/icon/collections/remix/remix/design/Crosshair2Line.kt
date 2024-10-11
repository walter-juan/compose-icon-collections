package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.Crosshair2Line: ImageVector
    get() {
        if (_crosshair2Line != null) {
            return _crosshair2Line!!
        }
        _crosshair2Line = Builder(name = "Crosshair2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.071f)
                curveTo(7.934f, 5.509f, 5.509f, 7.934f, 5.071f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.071f)
                curveTo(5.509f, 16.066f, 7.934f, 18.491f, 11.0f, 18.929f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.929f)
                curveTo(16.066f, 18.491f, 18.491f, 16.066f, 18.929f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.929f)
                curveTo(18.491f, 7.934f, 16.066f, 5.509f, 13.0f, 5.071f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.071f)
                close()
                moveTo(3.055f, 11.0f)
                curveTo(3.516f, 6.828f, 6.828f, 3.516f, 11.0f, 3.055f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.055f)
                curveTo(17.172f, 3.516f, 20.484f, 6.828f, 20.945f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.945f)
                curveTo(20.484f, 17.172f, 17.172f, 20.484f, 13.0f, 20.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.945f)
                curveTo(6.828f, 20.484f, 3.516f, 17.172f, 3.055f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.055f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _crosshair2Line!!
    }

private var _crosshair2Line: ImageVector? = null
