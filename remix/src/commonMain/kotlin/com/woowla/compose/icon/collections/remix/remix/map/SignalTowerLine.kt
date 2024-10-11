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

public val MapGroup.SignalTowerLine: ImageVector
    get() {
        if (_signalTowerLine != null) {
            return _signalTowerLine!!
        }
        _signalTowerLine = Builder(name = "SignalTowerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.116f, 20.087f)
                lineTo(7.131f, 18.348f)
                curveTo(5.227f, 16.886f, 4.0f, 14.586f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 14.586f, 18.773f, 16.886f, 16.869f, 18.348f)
                lineTo(17.884f, 20.087f)
                curveTo(20.379f, 18.268f, 22.0f, 15.324f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 15.324f, 3.621f, 18.268f, 6.116f, 20.087f)
                close()
                moveTo(8.15f, 16.602f)
                curveTo(6.836f, 15.501f, 6.0f, 13.848f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                curveTo(15.314f, 6.0f, 18.0f, 8.686f, 18.0f, 12.0f)
                curveTo(18.0f, 13.848f, 17.164f, 15.501f, 15.85f, 16.602f)
                lineTo(14.82f, 14.837f)
                curveTo(15.549f, 14.112f, 16.0f, 13.109f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.209f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 13.109f, 8.451f, 14.112f, 9.18f, 14.837f)
                lineTo(8.15f, 16.602f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _signalTowerLine!!
    }

private var _signalTowerLine: ImageVector? = null
