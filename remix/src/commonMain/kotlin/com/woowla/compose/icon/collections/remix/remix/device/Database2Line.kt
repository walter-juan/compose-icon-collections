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

public val DeviceGroup.Database2Line: ImageVector
    get() {
        if (_database2Line != null) {
            return _database2Line!!
        }
        _database2Line = Builder(name = "Database2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.5f)
                curveTo(5.0f, 12.813f, 5.461f, 13.358f, 6.53f, 13.893f)
                curveTo(7.914f, 14.585f, 9.877f, 15.0f, 12.0f, 15.0f)
                curveTo(14.123f, 15.0f, 16.086f, 14.585f, 17.469f, 13.893f)
                curveTo(18.539f, 13.358f, 19.0f, 12.813f, 19.0f, 12.5f)
                verticalLineTo(10.329f)
                curveTo(17.35f, 11.348f, 14.827f, 12.0f, 12.0f, 12.0f)
                curveTo(9.173f, 12.0f, 6.65f, 11.348f, 5.0f, 10.329f)
                verticalLineTo(12.5f)
                close()
                moveTo(19.0f, 15.329f)
                curveTo(17.35f, 16.348f, 14.827f, 17.0f, 12.0f, 17.0f)
                curveTo(9.173f, 17.0f, 6.65f, 16.348f, 5.0f, 15.329f)
                verticalLineTo(17.5f)
                curveTo(5.0f, 17.813f, 5.461f, 18.358f, 6.53f, 18.893f)
                curveTo(7.914f, 19.585f, 9.877f, 20.0f, 12.0f, 20.0f)
                curveTo(14.123f, 20.0f, 16.086f, 19.585f, 17.469f, 18.893f)
                curveTo(18.539f, 18.358f, 19.0f, 17.813f, 19.0f, 17.5f)
                verticalLineTo(15.329f)
                close()
                moveTo(3.0f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 5.015f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 5.015f, 21.0f, 7.5f)
                verticalLineTo(17.5f)
                curveTo(21.0f, 19.985f, 16.971f, 22.0f, 12.0f, 22.0f)
                curveTo(7.029f, 22.0f, 3.0f, 19.985f, 3.0f, 17.5f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(14.123f, 10.0f, 16.086f, 9.585f, 17.469f, 8.893f)
                curveTo(18.539f, 8.358f, 19.0f, 7.813f, 19.0f, 7.5f)
                curveTo(19.0f, 7.187f, 18.539f, 6.642f, 17.469f, 6.107f)
                curveTo(16.086f, 5.415f, 14.123f, 5.0f, 12.0f, 5.0f)
                curveTo(9.877f, 5.0f, 7.914f, 5.415f, 6.53f, 6.107f)
                curveTo(5.461f, 6.642f, 5.0f, 7.187f, 5.0f, 7.5f)
                curveTo(5.0f, 7.813f, 5.461f, 8.358f, 6.53f, 8.893f)
                curveTo(7.914f, 9.585f, 9.877f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _database2Line!!
    }

private var _database2Line: ImageVector? = null
