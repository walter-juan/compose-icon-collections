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

public val FinanceGroup.Refund2Line: ImageVector
    get() {
        if (_refund2Line != null) {
            return _refund2Line!!
        }
        _refund2Line = Builder(name = "Refund2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.676f, 4.257f)
                curveTo(9.604f, 1.038f, 15.409f, 1.262f, 19.076f, 4.929f)
                curveTo(22.981f, 8.834f, 22.981f, 15.166f, 19.076f, 19.071f)
                curveTo(15.171f, 22.976f, 8.839f, 22.976f, 4.934f, 19.071f)
                curveTo(2.409f, 16.547f, 1.517f, 13.008f, 2.256f, 9.767f)
                lineTo(2.333f, 9.454f)
                lineTo(4.267f, 9.963f)
                curveTo(3.57f, 12.623f, 4.263f, 15.572f, 6.348f, 17.657f)
                curveTo(9.472f, 20.781f, 14.538f, 20.781f, 17.662f, 17.657f)
                curveTo(20.786f, 14.533f, 20.786f, 9.467f, 17.662f, 6.343f)
                curveTo(14.844f, 3.526f, 10.448f, 3.249f, 7.32f, 5.514f)
                lineTo(7.099f, 5.68f)
                lineTo(8.116f, 6.697f)
                lineTo(3.52f, 7.757f)
                lineTo(4.58f, 3.161f)
                lineTo(5.676f, 4.257f)
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
        return _refund2Line!!
    }

private var _refund2Line: ImageVector? = null
