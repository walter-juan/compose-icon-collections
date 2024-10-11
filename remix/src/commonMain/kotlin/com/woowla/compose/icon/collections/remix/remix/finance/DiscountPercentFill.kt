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

public val FinanceGroup.DiscountPercentFill: ImageVector
    get() {
        if (_discountPercentFill != null) {
            return _discountPercentFill!!
        }
        _discountPercentFill = Builder(name = "DiscountPercentFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.946f, 2.094f)
                curveTo(12.825f, 1.139f, 11.176f, 1.139f, 10.054f, 2.094f)
                lineTo(8.706f, 3.243f)
                curveTo(8.546f, 3.379f, 8.347f, 3.462f, 8.137f, 3.479f)
                lineTo(6.372f, 3.619f)
                curveTo(4.903f, 3.737f, 3.737f, 4.903f, 3.62f, 6.371f)
                lineTo(3.479f, 8.137f)
                curveTo(3.462f, 8.347f, 3.38f, 8.546f, 3.243f, 8.706f)
                lineTo(2.095f, 10.054f)
                curveTo(1.139f, 11.175f, 1.139f, 12.824f, 2.095f, 13.946f)
                lineTo(3.243f, 15.294f)
                curveTo(3.38f, 15.454f, 3.462f, 15.653f, 3.479f, 15.863f)
                lineTo(3.62f, 17.628f)
                curveTo(3.737f, 19.097f, 4.903f, 20.263f, 6.372f, 20.38f)
                lineTo(8.137f, 20.521f)
                curveTo(8.347f, 20.538f, 8.546f, 20.62f, 8.706f, 20.757f)
                lineTo(10.054f, 21.905f)
                curveTo(11.176f, 22.861f, 12.825f, 22.861f, 13.946f, 21.905f)
                lineTo(15.294f, 20.757f)
                curveTo(15.454f, 20.62f, 15.653f, 20.538f, 15.863f, 20.521f)
                lineTo(17.629f, 20.38f)
                curveTo(19.097f, 20.263f, 20.263f, 19.097f, 20.381f, 17.628f)
                lineTo(20.521f, 15.863f)
                curveTo(20.538f, 15.653f, 20.621f, 15.454f, 20.757f, 15.293f)
                lineTo(21.906f, 13.946f)
                curveTo(22.861f, 12.824f, 22.861f, 11.175f, 21.906f, 10.054f)
                lineTo(20.757f, 8.706f)
                curveTo(20.621f, 8.546f, 20.538f, 8.347f, 20.521f, 8.137f)
                lineTo(20.381f, 6.371f)
                curveTo(20.263f, 4.903f, 19.097f, 3.737f, 17.629f, 3.619f)
                lineTo(15.863f, 3.479f)
                curveTo(15.653f, 3.462f, 15.454f, 3.379f, 15.294f, 3.243f)
                lineTo(13.946f, 2.094f)
                close()
                moveTo(14.828f, 7.757f)
                lineTo(16.243f, 9.171f)
                lineTo(9.172f, 16.243f)
                lineTo(7.757f, 14.828f)
                lineTo(14.828f, 7.757f)
                close()
                moveTo(10.232f, 10.232f)
                curveTo(9.646f, 10.818f, 8.697f, 10.818f, 8.111f, 10.232f)
                curveTo(7.525f, 9.646f, 7.525f, 8.697f, 8.111f, 8.111f)
                curveTo(8.697f, 7.525f, 9.646f, 7.525f, 10.232f, 8.111f)
                curveTo(10.818f, 8.697f, 10.818f, 9.646f, 10.232f, 10.232f)
                close()
                moveTo(13.768f, 15.889f)
                curveTo(13.182f, 15.303f, 13.182f, 14.353f, 13.768f, 13.768f)
                curveTo(14.354f, 13.182f, 15.303f, 13.182f, 15.889f, 13.768f)
                curveTo(16.475f, 14.353f, 16.475f, 15.303f, 15.889f, 15.889f)
                curveTo(15.303f, 16.475f, 14.354f, 16.475f, 13.768f, 15.889f)
                close()
            }
        }
        .build()
        return _discountPercentFill!!
    }

private var _discountPercentFill: ImageVector? = null
