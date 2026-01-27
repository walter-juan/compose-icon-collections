package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.GlobalOffFill: ImageVector
    get() {
        if (_globalOffFill != null) {
            return _globalOffFill!!
        }
        _globalOffFill = Builder(name = "GlobalOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.035f, 16.379f)
                lineTo(19.914f, 18.5f)
                lineTo(22.035f, 20.621f)
                lineTo(20.621f, 22.036f)
                lineTo(18.5f, 19.914f)
                lineTo(16.379f, 22.036f)
                lineTo(14.965f, 20.621f)
                lineTo(17.086f, 18.5f)
                lineTo(14.965f, 16.379f)
                lineTo(16.379f, 14.965f)
                lineTo(18.5f, 17.086f)
                lineTo(20.621f, 14.965f)
                lineTo(22.035f, 16.379f)
                close()
                moveTo(7.527f, 13.0f)
                curveTo(7.706f, 16.269f, 8.758f, 19.305f, 10.452f, 21.881f)
                curveTo(5.988f, 21.187f, 2.5f, 17.54f, 2.049f, 13.0f)
                horizontalLineTo(7.527f)
                close()
                moveTo(14.469f, 13.0f)
                curveTo(14.444f, 13.393f, 14.405f, 13.781f, 14.352f, 14.166f)
                curveTo(13.212f, 15.258f, 12.5f, 16.796f, 12.5f, 18.5f)
                curveTo(12.5f, 18.865f, 12.534f, 19.222f, 12.597f, 19.569f)
                curveTo(12.409f, 19.918f, 12.212f, 20.26f, 12.0f, 20.592f)
                curveTo(10.585f, 18.374f, 9.702f, 15.783f, 9.53f, 13.0f)
                horizontalLineTo(14.469f)
                close()
                moveTo(10.452f, 2.119f)
                curveTo(8.758f, 4.695f, 7.706f, 7.731f, 7.527f, 11.0f)
                horizontalLineTo(2.049f)
                curveTo(2.5f, 6.46f, 5.988f, 2.813f, 10.452f, 2.119f)
                close()
                moveTo(12.0f, 3.408f)
                curveTo(13.415f, 5.626f, 14.297f, 8.217f, 14.469f, 11.0f)
                horizontalLineTo(9.53f)
                curveTo(9.702f, 8.217f, 10.585f, 5.627f, 12.0f, 3.408f)
                close()
                moveTo(13.548f, 2.119f)
                curveTo(18.012f, 2.813f, 21.499f, 6.46f, 21.95f, 11.0f)
                horizontalLineTo(16.473f)
                curveTo(16.294f, 7.731f, 15.242f, 4.695f, 13.548f, 2.119f)
                close()
            }
        }
        .build()
        return _globalOffFill!!
    }

private var _globalOffFill: ImageVector? = null
