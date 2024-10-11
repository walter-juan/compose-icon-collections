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

public val FinanceGroup.PercentLine: ImageVector
    get() {
        if (_percentLine != null) {
            return _percentLine!!
        }
        _percentLine = Builder(name = "PercentLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.505f, 21.003f)
                curveTo(15.572f, 21.003f, 14.005f, 19.436f, 14.005f, 17.503f)
                curveTo(14.005f, 15.57f, 15.572f, 14.003f, 17.505f, 14.003f)
                curveTo(19.438f, 14.003f, 21.005f, 15.57f, 21.005f, 17.503f)
                curveTo(21.005f, 19.436f, 19.438f, 21.003f, 17.505f, 21.003f)
                close()
                moveTo(17.505f, 19.003f)
                curveTo(18.333f, 19.003f, 19.005f, 18.331f, 19.005f, 17.503f)
                curveTo(19.005f, 16.674f, 18.333f, 16.003f, 17.505f, 16.003f)
                curveTo(16.677f, 16.003f, 16.005f, 16.674f, 16.005f, 17.503f)
                curveTo(16.005f, 18.331f, 16.677f, 19.003f, 17.505f, 19.003f)
                close()
                moveTo(6.505f, 10.003f)
                curveTo(4.572f, 10.003f, 3.005f, 8.436f, 3.005f, 6.503f)
                curveTo(3.005f, 4.57f, 4.572f, 3.003f, 6.505f, 3.003f)
                curveTo(8.438f, 3.003f, 10.005f, 4.57f, 10.005f, 6.503f)
                curveTo(10.005f, 8.436f, 8.438f, 10.003f, 6.505f, 10.003f)
                close()
                moveTo(6.505f, 8.003f)
                curveTo(7.333f, 8.003f, 8.005f, 7.331f, 8.005f, 6.503f)
                curveTo(8.005f, 5.674f, 7.333f, 5.003f, 6.505f, 5.003f)
                curveTo(5.676f, 5.003f, 5.005f, 5.674f, 5.005f, 6.503f)
                curveTo(5.005f, 7.331f, 5.676f, 8.003f, 6.505f, 8.003f)
                close()
                moveTo(19.076f, 3.517f)
                lineTo(20.49f, 4.932f)
                lineTo(4.934f, 20.488f)
                lineTo(3.52f, 19.074f)
                lineTo(19.076f, 3.517f)
                close()
            }
        }
        .build()
        return _percentLine!!
    }

private var _percentLine: ImageVector? = null
