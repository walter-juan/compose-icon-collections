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

public val FinanceGroup.MoneyRupeeCircleLine: ImageVector
    get() {
        if (_moneyRupeeCircleLine != null) {
            return _moneyRupeeCircleLine!!
        }
        _moneyRupeeCircleLine = Builder(name = "MoneyRupeeCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(13.5f, 8.0f)
                curveTo(13.828f, 8.436f, 14.063f, 8.946f, 14.175f, 9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.175f)
                curveTo(13.828f, 12.712f, 12.314f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(10.311f)
                lineTo(14.03f, 17.72f)
                lineTo(12.97f, 18.78f)
                lineTo(8.0f, 13.811f)
                verticalLineTo(12.5f)
                horizontalLineTo(10.5f)
                curveTo(11.48f, 12.5f, 12.313f, 11.874f, 12.622f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(12.622f)
                curveTo(12.313f, 8.626f, 11.48f, 8.0f, 10.5f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _moneyRupeeCircleLine!!
    }

private var _moneyRupeeCircleLine: ImageVector? = null
