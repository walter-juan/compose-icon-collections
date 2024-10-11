package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.HourglassFill: ImageVector
    get() {
        if (_hourglassFill != null) {
            return _hourglassFill!!
        }
        _hourglassFill = Builder(name = "HourglassFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 7.615f, 17.184f, 8.915f, 16.156f, 9.977f)
                curveTo(15.453f, 10.703f, 14.598f, 11.372f, 13.731f, 12.0f)
                curveTo(14.598f, 12.628f, 15.453f, 13.297f, 16.156f, 14.023f)
                curveTo(17.184f, 15.085f, 18.0f, 16.385f, 18.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 16.385f, 6.816f, 15.085f, 7.844f, 14.023f)
                curveTo(8.547f, 13.297f, 9.402f, 12.628f, 10.269f, 12.0f)
                curveTo(9.402f, 11.372f, 8.547f, 10.703f, 7.844f, 9.977f)
                curveTo(6.816f, 8.915f, 6.0f, 7.615f, 6.0f, 6.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 6.685f, 8.26f, 7.335f, 8.771f, 8.0f)
                horizontalLineTo(15.229f)
                curveTo(15.74f, 7.335f, 16.0f, 6.685f, 16.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.0f, 13.222f)
                curveTo(10.955f, 13.96f, 10.008f, 14.663f, 9.281f, 15.414f)
                curveTo(9.09f, 15.612f, 8.92f, 15.806f, 8.771f, 16.0f)
                horizontalLineTo(15.229f)
                curveTo(15.08f, 15.806f, 14.91f, 15.612f, 14.719f, 15.414f)
                curveTo(13.992f, 14.663f, 13.045f, 13.96f, 12.0f, 13.222f)
                close()
            }
        }
        .build()
        return _hourglassFill!!
    }

private var _hourglassFill: ImageVector? = null
