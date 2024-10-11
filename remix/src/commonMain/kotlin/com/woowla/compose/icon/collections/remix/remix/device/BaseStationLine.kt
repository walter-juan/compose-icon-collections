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

public val DeviceGroup.BaseStationLine: ImageVector
    get() {
        if (_baseStationLine != null) {
            return _baseStationLine!!
        }
        _baseStationLine = Builder(name = "BaseStationLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                lineTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                lineTo(12.0f, 13.0f)
                close()
                moveTo(12.0f, 16.6f)
                lineTo(9.74f, 20.0f)
                horizontalLineTo(14.26f)
                lineTo(12.0f, 16.6f)
                close()
                moveTo(10.939f, 10.561f)
                curveTo(10.354f, 9.975f, 10.354f, 9.025f, 10.939f, 8.439f)
                curveTo(11.525f, 7.854f, 12.475f, 7.854f, 13.061f, 8.439f)
                curveTo(13.646f, 9.025f, 13.646f, 9.975f, 13.061f, 10.561f)
                curveTo(12.475f, 11.146f, 11.525f, 11.146f, 10.939f, 10.561f)
                close()
                moveTo(5.282f, 2.782f)
                lineTo(6.697f, 4.197f)
                curveTo(3.768f, 7.126f, 3.768f, 11.874f, 6.697f, 14.803f)
                lineTo(5.282f, 16.218f)
                curveTo(1.572f, 12.507f, 1.572f, 6.492f, 5.282f, 2.782f)
                close()
                moveTo(18.718f, 2.782f)
                curveTo(22.427f, 6.492f, 22.427f, 12.507f, 18.718f, 16.218f)
                lineTo(17.303f, 14.803f)
                curveTo(20.232f, 11.874f, 20.232f, 7.126f, 17.303f, 4.197f)
                lineTo(18.718f, 2.782f)
                close()
                moveTo(8.111f, 5.611f)
                lineTo(9.525f, 7.025f)
                curveTo(8.158f, 8.392f, 8.158f, 10.608f, 9.525f, 11.975f)
                lineTo(8.111f, 13.389f)
                curveTo(5.963f, 11.241f, 5.963f, 7.759f, 8.111f, 5.611f)
                horizontalLineTo(8.111f)
                close()
                moveTo(15.889f, 5.611f)
                curveTo(18.037f, 7.759f, 18.037f, 11.241f, 15.889f, 13.389f)
                lineTo(14.475f, 11.975f)
                curveTo(15.842f, 10.608f, 15.842f, 8.392f, 14.475f, 7.025f)
                lineTo(15.889f, 5.611f)
                close()
            }
        }
        .build()
        return _baseStationLine!!
    }

private var _baseStationLine: ImageVector? = null
