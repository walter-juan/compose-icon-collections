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

public val FinanceGroup.XrpFill: ImageVector
    get() {
        if (_xrpFill != null) {
            return _xrpFill!!
        }
        _xrpFill = Builder(name = "XrpFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.778f, 4.0f)
                horizontalLineTo(18.941f)
                lineTo(14.452f, 8.371f)
                curveTo(13.798f, 9.005f, 12.917f, 9.36f, 12.0f, 9.36f)
                curveTo(11.082f, 9.36f, 10.201f, 9.005f, 9.548f, 8.371f)
                lineTo(5.062f, 4.0f)
                horizontalLineTo(2.223f)
                lineTo(8.129f, 9.754f)
                curveTo(10.269f, 11.837f, 13.736f, 11.837f, 15.874f, 9.754f)
                lineTo(21.778f, 4.0f)
                close()
                moveTo(2.223f, 20.0f)
                horizontalLineTo(5.051f)
                lineTo(9.559f, 15.615f)
                curveTo(10.21f, 14.984f, 11.088f, 14.63f, 12.002f, 14.63f)
                curveTo(12.916f, 14.63f, 13.794f, 14.984f, 14.445f, 15.615f)
                lineTo(18.952f, 20.0f)
                horizontalLineTo(21.778f)
                lineTo(15.858f, 14.239f)
                curveTo(13.726f, 12.166f, 10.273f, 12.166f, 8.143f, 14.239f)
                lineTo(2.223f, 20.0f)
                close()
            }
        }
        .build()
        return _xrpFill!!
    }

private var _xrpFill: ImageVector? = null
