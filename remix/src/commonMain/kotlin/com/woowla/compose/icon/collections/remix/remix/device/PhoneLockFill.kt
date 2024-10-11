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

public val DeviceGroup.PhoneLockFill: ImageVector
    get() {
        if (_phoneLockFill != null) {
            return _phoneLockFill!!
        }
        _phoneLockFill = Builder(name = "PhoneLockFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveTo(18.552f, 2.0f, 19.0f, 2.448f, 19.0f, 3.0f)
                lineTo(19.001f, 10.1f)
                curveTo(18.678f, 10.035f, 18.343f, 10.0f, 18.0f, 10.0f)
                curveTo(15.581f, 10.0f, 13.563f, 11.718f, 13.1f, 14.0f)
                lineTo(12.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.448f, 5.448f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(19.657f, 12.0f, 21.0f, 13.343f, 21.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.552f, 21.552f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(14.448f, 22.0f, 14.0f, 21.552f, 14.0f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 13.343f, 16.343f, 12.0f, 18.0f, 12.0f)
                close()
                moveTo(18.0f, 14.0f)
                curveTo(17.487f, 14.0f, 17.0f, 14.45f, 17.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 14.448f, 18.552f, 14.0f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _phoneLockFill!!
    }

private var _phoneLockFill: ImageVector? = null
