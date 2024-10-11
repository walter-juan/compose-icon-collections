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

public val FinanceGroup.Gift2Fill: ImageVector
    get() {
        if (_gift2Fill != null) {
            return _gift2Fill!!
        }
        _gift2Fill = Builder(name = "Gift2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.005f, 13.003f)
                verticalLineTo(20.003f)
                curveTo(20.005f, 20.555f, 19.557f, 21.003f, 19.005f, 21.003f)
                horizontalLineTo(5.005f)
                curveTo(4.453f, 21.003f, 4.005f, 20.555f, 4.005f, 20.003f)
                verticalLineTo(13.003f)
                horizontalLineTo(20.005f)
                close()
                moveTo(14.505f, 2.003f)
                curveTo(16.438f, 2.003f, 18.005f, 3.57f, 18.005f, 5.503f)
                curveTo(18.005f, 6.04f, 17.884f, 6.549f, 17.668f, 7.004f)
                lineTo(21.005f, 7.003f)
                curveTo(21.557f, 7.003f, 22.005f, 7.451f, 22.005f, 8.003f)
                verticalLineTo(11.003f)
                curveTo(22.005f, 11.555f, 21.557f, 12.003f, 21.005f, 12.003f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 12.003f, 2.005f, 11.555f, 2.005f, 11.003f)
                verticalLineTo(8.003f)
                curveTo(2.005f, 7.451f, 2.453f, 7.003f, 3.005f, 7.003f)
                lineTo(6.342f, 7.004f)
                curveTo(6.126f, 6.549f, 6.005f, 6.04f, 6.005f, 5.503f)
                curveTo(6.005f, 3.57f, 7.572f, 2.003f, 9.505f, 2.003f)
                curveTo(10.485f, 2.003f, 11.371f, 2.406f, 12.006f, 3.055f)
                curveTo(12.639f, 2.406f, 13.525f, 2.003f, 14.505f, 2.003f)
                close()
                moveTo(9.505f, 4.003f)
                curveTo(8.676f, 4.003f, 8.005f, 4.674f, 8.005f, 5.503f)
                curveTo(8.005f, 6.282f, 8.6f, 6.923f, 9.36f, 6.996f)
                lineTo(9.505f, 7.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(5.503f)
                curveTo(11.005f, 4.723f, 10.41f, 4.082f, 9.649f, 4.01f)
                lineTo(9.505f, 4.003f)
                close()
                moveTo(14.505f, 4.003f)
                lineTo(14.36f, 4.01f)
                curveTo(13.647f, 4.078f, 13.08f, 4.645f, 13.012f, 5.358f)
                lineTo(13.005f, 5.503f)
                verticalLineTo(7.003f)
                horizontalLineTo(14.505f)
                lineTo(14.649f, 6.996f)
                curveTo(15.41f, 6.923f, 16.005f, 6.282f, 16.005f, 5.503f)
                curveTo(16.005f, 4.723f, 15.41f, 4.082f, 14.649f, 4.01f)
                lineTo(14.505f, 4.003f)
                close()
            }
        }
        .build()
        return _gift2Fill!!
    }

private var _gift2Fill: ImageVector? = null
