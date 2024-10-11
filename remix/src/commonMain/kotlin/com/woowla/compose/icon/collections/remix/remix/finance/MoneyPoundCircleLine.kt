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

public val FinanceGroup.MoneyPoundCircleLine: ImageVector
    get() {
        if (_moneyPoundCircleLine != null) {
            return _moneyPoundCircleLine!!
        }
        _moneyPoundCircleLine = Builder(name = "MoneyPoundCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 22.003f)
                curveTo(6.482f, 22.003f, 2.005f, 17.526f, 2.005f, 12.003f)
                curveTo(2.005f, 6.48f, 6.482f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 17.526f, 17.528f, 22.003f, 12.005f, 22.003f)
                close()
                moveTo(12.005f, 20.003f)
                curveTo(16.423f, 20.003f, 20.005f, 16.421f, 20.005f, 12.003f)
                curveTo(20.005f, 7.584f, 16.423f, 4.003f, 12.005f, 4.003f)
                curveTo(7.587f, 4.003f, 4.005f, 7.584f, 4.005f, 12.003f)
                curveTo(4.005f, 16.421f, 7.587f, 20.003f, 12.005f, 20.003f)
                close()
                moveTo(9.005f, 13.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(11.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(10.003f)
                curveTo(9.005f, 8.07f, 10.572f, 6.503f, 12.505f, 6.503f)
                curveTo(13.974f, 6.503f, 15.232f, 7.408f, 15.751f, 8.691f)
                lineTo(13.764f, 9.188f)
                curveTo(13.497f, 8.776f, 13.033f, 8.503f, 12.505f, 8.503f)
                curveTo(11.677f, 8.503f, 11.005f, 9.174f, 11.005f, 10.003f)
                verticalLineTo(11.003f)
                horizontalLineTo(14.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(15.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(17.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(15.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(13.003f)
                close()
            }
        }
        .build()
        return _moneyPoundCircleLine!!
    }

private var _moneyPoundCircleLine: ImageVector? = null
