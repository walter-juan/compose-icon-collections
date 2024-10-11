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

public val FinanceGroup.Safe2Line: ImageVector
    get() {
        if (_safe2Line != null) {
            return _safe2Line!!
        }
        _safe2Line = Builder(name = "Safe2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.005f, 20.333f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(20.666f)
                lineTo(10.587f, 21.903f)
                curveTo(10.315f, 21.948f, 10.057f, 21.764f, 10.012f, 21.492f)
                curveTo(10.007f, 21.465f, 10.005f, 21.437f, 10.005f, 21.41f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.005f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 20.0f, 2.005f, 19.552f, 2.005f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(10.005f)
                verticalLineTo(1.59f)
                curveTo(10.005f, 1.314f, 10.229f, 1.09f, 10.505f, 1.09f)
                curveTo(10.532f, 1.09f, 10.56f, 1.092f, 10.587f, 1.097f)
                lineTo(21.169f, 2.861f)
                curveTo(21.652f, 2.941f, 22.005f, 3.358f, 22.005f, 3.847f)
                verticalLineTo(6.0f)
                horizontalLineTo(23.005f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.005f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(19.153f)
                curveTo(22.005f, 19.642f, 21.652f, 20.059f, 21.169f, 20.139f)
                lineTo(20.005f, 20.333f)
                close()
                moveTo(4.005f, 5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.005f)
                close()
                moveTo(12.005f, 19.639f)
                lineTo(20.005f, 18.306f)
                verticalLineTo(4.694f)
                lineTo(12.005f, 3.361f)
                verticalLineTo(19.639f)
                close()
                moveTo(16.505f, 14.0f)
                curveTo(15.677f, 14.0f, 15.005f, 12.88f, 15.005f, 11.5f)
                curveTo(15.005f, 10.119f, 15.677f, 9.0f, 16.505f, 9.0f)
                curveTo(17.333f, 9.0f, 18.005f, 10.119f, 18.005f, 11.5f)
                curveTo(18.005f, 12.88f, 17.333f, 14.0f, 16.505f, 14.0f)
                close()
            }
        }
        .build()
        return _safe2Line!!
    }

private var _safe2Line: ImageVector? = null
