package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.Number24HoursFill: ImageVector
    get() {
        if (_number24HoursFill != null) {
            return _number24HoursFill!!
        }
        _number24HoursFill = Builder(name = "Number24HoursFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 13.003f)
                curveTo(13.662f, 13.003f, 15.005f, 14.346f, 15.005f, 16.003f)
                curveTo(15.005f, 16.852f, 14.652f, 17.619f, 14.085f, 18.164f)
                lineTo(12.175f, 20.002f)
                lineTo(15.005f, 20.003f)
                verticalLineTo(22.003f)
                horizontalLineTo(9.005f)
                lineTo(9.004f, 20.278f)
                lineTo(12.698f, 16.723f)
                curveTo(12.887f, 16.541f, 13.005f, 16.286f, 13.005f, 16.003f)
                curveTo(13.005f, 15.45f, 12.557f, 15.003f, 12.005f, 15.003f)
                curveTo(11.453f, 15.003f, 11.005f, 15.45f, 11.005f, 16.003f)
                horizontalLineTo(9.005f)
                curveTo(9.005f, 14.346f, 10.348f, 13.003f, 12.005f, 13.003f)
                close()
                moveTo(18.005f, 13.003f)
                verticalLineTo(17.003f)
                horizontalLineTo(20.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(22.005f)
                verticalLineTo(22.003f)
                horizontalLineTo(20.005f)
                verticalLineTo(19.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(18.005f)
                close()
                moveTo(4.005f, 12.003f)
                curveTo(4.005f, 14.529f, 5.176f, 16.782f, 7.005f, 18.249f)
                lineTo(7.005f, 20.665f)
                curveTo(4.016f, 18.936f, 2.005f, 15.704f, 2.005f, 12.003f)
                horizontalLineTo(4.005f)
                close()
                moveTo(12.005f, 2.003f)
                curveTo(17.19f, 2.003f, 21.454f, 5.949f, 21.955f, 11.003f)
                lineTo(19.943f, 11.003f)
                curveTo(19.451f, 7.057f, 16.084f, 4.003f, 12.005f, 4.003f)
                curveTo(9.541f, 4.003f, 7.337f, 5.117f, 5.87f, 6.868f)
                lineTo(8.005f, 9.003f)
                horizontalLineTo(2.005f)
                verticalLineTo(3.003f)
                lineTo(4.451f, 5.449f)
                curveTo(6.285f, 3.338f, 8.989f, 2.003f, 12.005f, 2.003f)
                close()
            }
        }
        .build()
        return _number24HoursFill!!
    }

private var _number24HoursFill: ImageVector? = null
