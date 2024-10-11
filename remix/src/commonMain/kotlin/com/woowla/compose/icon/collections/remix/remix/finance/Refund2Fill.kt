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

public val FinanceGroup.Refund2Fill: ImageVector
    get() {
        if (_refund2Fill != null) {
            return _refund2Fill!!
        }
        _refund2Fill = Builder(name = "Refund2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 2.0f)
                curveTo(17.528f, 2.0f, 22.005f, 6.477f, 22.005f, 12.0f)
                curveTo(22.005f, 17.523f, 17.528f, 22.0f, 12.005f, 22.0f)
                curveTo(9.578f, 22.0f, 7.354f, 21.136f, 5.622f, 19.698f)
                lineTo(5.378f, 19.489f)
                lineTo(6.279f, 17.587f)
                curveTo(7.732f, 19.076f, 9.761f, 20.0f, 12.005f, 20.0f)
                curveTo(16.423f, 20.0f, 20.005f, 16.418f, 20.005f, 12.0f)
                curveTo(20.005f, 7.582f, 16.423f, 4.0f, 12.005f, 4.0f)
                curveTo(7.67f, 4.0f, 4.14f, 7.448f, 4.009f, 11.751f)
                lineTo(4.005f, 12.0f)
                horizontalLineTo(6.505f)
                lineTo(3.799f, 17.716f)
                curveTo(2.668f, 16.096f, 2.005f, 14.125f, 2.005f, 12.0f)
                curveTo(2.005f, 6.477f, 6.482f, 2.0f, 12.005f, 2.0f)
                close()
                moveTo(13.005f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.505f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.005f)
                curveTo(9.729f, 10.0f, 9.505f, 10.224f, 9.505f, 10.5f)
                curveTo(9.505f, 10.745f, 9.682f, 10.95f, 9.915f, 10.992f)
                lineTo(10.005f, 11.0f)
                horizontalLineTo(14.005f)
                curveTo(15.386f, 11.0f, 16.505f, 12.119f, 16.505f, 13.5f)
                curveTo(16.505f, 14.881f, 15.386f, 16.0f, 14.005f, 16.0f)
                horizontalLineTo(13.005f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.005f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.505f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.005f)
                curveTo(14.281f, 14.0f, 14.505f, 13.776f, 14.505f, 13.5f)
                curveTo(14.505f, 13.255f, 14.328f, 13.05f, 14.095f, 13.008f)
                lineTo(14.005f, 13.0f)
                horizontalLineTo(10.005f)
                curveTo(8.624f, 13.0f, 7.505f, 11.881f, 7.505f, 10.5f)
                curveTo(7.505f, 9.119f, 8.624f, 8.0f, 10.005f, 8.0f)
                horizontalLineTo(11.005f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.005f)
                close()
            }
        }
        .build()
        return _refund2Fill!!
    }

private var _refund2Fill: ImageVector? = null
