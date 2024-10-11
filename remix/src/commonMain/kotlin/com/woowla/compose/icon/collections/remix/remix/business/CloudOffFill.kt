package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.CloudOffFill: ImageVector
    get() {
        if (_cloudOffFill != null) {
            return _cloudOffFill!!
        }
        _cloudOffFill = Builder(name = "CloudOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.515f, 2.101f)
                lineTo(22.607f, 21.192f)
                lineTo(21.192f, 22.607f)
                lineTo(19.178f, 20.592f)
                curveTo(18.503f, 20.856f, 17.768f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.686f, 21.0f, 1.0f, 18.314f, 1.0f, 15.0f)
                curveTo(1.0f, 12.385f, 2.673f, 10.16f, 5.008f, 9.339f)
                curveTo(5.003f, 9.226f, 5.0f, 9.114f, 5.0f, 9.0f)
                curveTo(5.0f, 8.222f, 5.127f, 7.474f, 5.361f, 6.775f)
                lineTo(2.101f, 3.515f)
                lineTo(3.515f, 2.101f)
                close()
                moveTo(17.0f, 9.0f)
                curveTo(17.698f, 9.0f, 18.369f, 9.119f, 18.992f, 9.339f)
                curveTo(21.326f, 10.16f, 23.0f, 12.385f, 23.0f, 15.0f)
                curveTo(23.0f, 16.088f, 22.71f, 17.109f, 22.204f, 17.989f)
                lineTo(14.011f, 9.796f)
                curveTo(14.891f, 9.29f, 15.912f, 9.0f, 17.0f, 9.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.242f, 2.0f, 17.969f, 4.204f, 18.765f, 7.195f)
                curveTo(18.197f, 7.068f, 17.607f, 7.0f, 17.0f, 7.0f)
                curveTo(15.357f, 7.0f, 13.83f, 7.495f, 12.559f, 8.345f)
                lineTo(7.694f, 3.481f)
                curveTo(8.882f, 2.553f, 10.376f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cloudOffFill!!
    }

private var _cloudOffFill: ImageVector? = null
