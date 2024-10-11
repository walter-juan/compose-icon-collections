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

public val FinanceGroup.DiscountPercentLine: ImageVector
    get() {
        if (_discountPercentLine != null) {
            return _discountPercentLine!!
        }
        _discountPercentLine = Builder(name = "DiscountPercentLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.054f, 2.094f)
                curveTo(11.176f, 1.139f, 12.825f, 1.139f, 13.946f, 2.094f)
                lineTo(15.294f, 3.243f)
                curveTo(15.454f, 3.379f, 15.653f, 3.462f, 15.863f, 3.479f)
                lineTo(17.629f, 3.619f)
                curveTo(19.097f, 3.737f, 20.263f, 4.903f, 20.381f, 6.371f)
                lineTo(20.521f, 8.137f)
                curveTo(20.538f, 8.347f, 20.621f, 8.546f, 20.757f, 8.706f)
                lineTo(21.906f, 10.054f)
                curveTo(22.861f, 11.175f, 22.861f, 12.824f, 21.906f, 13.946f)
                lineTo(20.757f, 15.293f)
                curveTo(20.621f, 15.454f, 20.538f, 15.653f, 20.521f, 15.863f)
                lineTo(20.381f, 17.628f)
                curveTo(20.263f, 19.097f, 19.097f, 20.263f, 17.629f, 20.38f)
                lineTo(15.863f, 20.521f)
                curveTo(15.653f, 20.538f, 15.454f, 20.62f, 15.294f, 20.757f)
                lineTo(13.946f, 21.905f)
                curveTo(12.825f, 22.861f, 11.176f, 22.861f, 10.054f, 21.905f)
                lineTo(8.706f, 20.757f)
                curveTo(8.546f, 20.62f, 8.347f, 20.538f, 8.137f, 20.521f)
                lineTo(6.372f, 20.38f)
                curveTo(4.903f, 20.263f, 3.737f, 19.097f, 3.62f, 17.628f)
                lineTo(3.479f, 15.863f)
                curveTo(3.462f, 15.653f, 3.38f, 15.454f, 3.243f, 15.294f)
                lineTo(2.095f, 13.946f)
                curveTo(1.139f, 12.824f, 1.139f, 11.175f, 2.095f, 10.054f)
                lineTo(3.243f, 8.706f)
                curveTo(3.38f, 8.546f, 3.462f, 8.347f, 3.479f, 8.137f)
                lineTo(3.62f, 6.371f)
                curveTo(3.737f, 4.903f, 4.903f, 3.737f, 6.372f, 3.619f)
                lineTo(8.137f, 3.479f)
                curveTo(8.347f, 3.462f, 8.546f, 3.379f, 8.706f, 3.243f)
                lineTo(10.054f, 2.094f)
                close()
                moveTo(12.649f, 3.616f)
                curveTo(12.275f, 3.298f, 11.725f, 3.298f, 11.352f, 3.616f)
                lineTo(10.004f, 4.765f)
                curveTo(9.523f, 5.175f, 8.926f, 5.422f, 8.296f, 5.472f)
                lineTo(6.531f, 5.613f)
                curveTo(6.041f, 5.652f, 5.653f, 6.041f, 5.614f, 6.53f)
                lineTo(5.473f, 8.296f)
                curveTo(5.423f, 8.925f, 5.175f, 9.523f, 4.766f, 10.003f)
                lineTo(3.617f, 11.351f)
                curveTo(3.298f, 11.725f, 3.298f, 12.275f, 3.617f, 12.648f)
                lineTo(4.766f, 13.996f)
                curveTo(5.175f, 14.477f, 5.423f, 15.074f, 5.473f, 15.703f)
                lineTo(5.614f, 17.469f)
                curveTo(5.653f, 17.958f, 6.041f, 18.347f, 6.531f, 18.386f)
                lineTo(8.296f, 18.527f)
                curveTo(8.926f, 18.577f, 9.523f, 18.825f, 10.004f, 19.234f)
                lineTo(11.352f, 20.383f)
                curveTo(11.725f, 20.702f, 12.275f, 20.702f, 12.649f, 20.383f)
                lineTo(13.997f, 19.234f)
                curveTo(14.477f, 18.825f, 15.075f, 18.577f, 15.704f, 18.527f)
                lineTo(17.469f, 18.386f)
                curveTo(17.959f, 18.347f, 18.348f, 17.958f, 18.387f, 17.469f)
                lineTo(18.528f, 15.703f)
                curveTo(18.578f, 15.074f, 18.825f, 14.477f, 19.235f, 13.996f)
                lineTo(20.384f, 12.648f)
                curveTo(20.702f, 12.275f, 20.702f, 11.725f, 20.384f, 11.351f)
                lineTo(19.235f, 10.003f)
                curveTo(18.825f, 9.523f, 18.578f, 8.925f, 18.528f, 8.296f)
                lineTo(18.387f, 6.53f)
                curveTo(18.348f, 6.041f, 17.959f, 5.652f, 17.469f, 5.613f)
                lineTo(15.704f, 5.472f)
                curveTo(15.075f, 5.422f, 14.477f, 5.175f, 13.997f, 4.765f)
                lineTo(12.649f, 3.616f)
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
                curveTo(14.354f, 16.475f, 15.303f, 16.475f, 15.889f, 15.889f)
                curveTo(16.475f, 15.303f, 16.475f, 14.353f, 15.889f, 13.768f)
                curveTo(15.303f, 13.182f, 14.354f, 13.182f, 13.768f, 13.768f)
                curveTo(13.182f, 14.353f, 13.182f, 15.303f, 13.768f, 15.889f)
                close()
            }
        }
        .build()
        return _discountPercentLine!!
    }

private var _discountPercentLine: ImageVector? = null
