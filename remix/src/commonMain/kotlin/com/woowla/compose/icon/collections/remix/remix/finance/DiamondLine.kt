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

public val FinanceGroup.DiamondLine: ImageVector
    get() {
        if (_diamondLine != null) {
            return _diamondLine!!
        }
        _diamondLine = Builder(name = "DiamondLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.467f, 8.694f)
                lineTo(19.713f, 8.128f)
                curveTo(20.153f, 7.119f, 20.944f, 6.316f, 21.932f, 5.877f)
                lineTo(22.692f, 5.539f)
                curveTo(23.103f, 5.357f, 23.103f, 4.759f, 22.692f, 4.576f)
                lineTo(21.975f, 4.257f)
                curveTo(20.962f, 3.807f, 20.156f, 2.974f, 19.724f, 1.931f)
                lineTo(19.471f, 1.32f)
                curveTo(19.294f, 0.893f, 18.706f, 0.893f, 18.529f, 1.32f)
                lineTo(18.276f, 1.931f)
                curveTo(17.844f, 2.974f, 17.038f, 3.807f, 16.025f, 4.257f)
                lineTo(15.308f, 4.576f)
                curveTo(14.897f, 4.759f, 14.897f, 5.357f, 15.308f, 5.539f)
                lineTo(16.068f, 5.877f)
                curveTo(17.056f, 6.316f, 17.847f, 7.119f, 18.287f, 8.128f)
                lineTo(18.533f, 8.694f)
                curveTo(18.714f, 9.108f, 19.286f, 9.108f, 19.467f, 8.694f)
                close()
                moveTo(5.0f, 6.0f)
                curveTo(4.685f, 6.0f, 4.389f, 6.148f, 4.2f, 6.4f)
                lineTo(1.2f, 10.4f)
                curveTo(0.913f, 10.782f, 0.937f, 11.314f, 1.257f, 11.669f)
                lineTo(10.257f, 21.669f)
                curveTo(10.446f, 21.88f, 10.717f, 22.0f, 11.0f, 22.0f)
                curveTo(11.283f, 22.0f, 11.554f, 21.88f, 11.743f, 21.669f)
                lineTo(20.743f, 11.669f)
                lineTo(19.257f, 10.331f)
                lineTo(11.0f, 19.505f)
                lineTo(3.293f, 10.942f)
                lineTo(5.5f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _diamondLine!!
    }

private var _diamondLine: ImageVector? = null
