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

public val FinanceGroup.DiamondRingFill: ImageVector
    get() {
        if (_diamondRingFill != null) {
            return _diamondRingFill!!
        }
        _diamondRingFill = Builder(name = "DiamondRingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.535f, 1.0f)
                horizontalLineTo(9.465f)
                lineTo(7.691f, 3.661f)
                lineTo(9.556f, 5.357f)
                curveTo(6.053f, 6.407f, 3.5f, 9.655f, 3.5f, 13.5f)
                curveTo(3.5f, 18.194f, 7.306f, 22.0f, 12.0f, 22.0f)
                curveTo(16.694f, 22.0f, 20.5f, 18.194f, 20.5f, 13.5f)
                curveTo(20.5f, 9.655f, 17.947f, 6.407f, 14.444f, 5.357f)
                lineTo(16.309f, 3.661f)
                lineTo(14.535f, 1.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(15.59f, 7.0f, 18.5f, 9.91f, 18.5f, 13.5f)
                curveTo(18.5f, 17.09f, 15.59f, 20.0f, 12.0f, 20.0f)
                curveTo(8.41f, 20.0f, 5.5f, 17.09f, 5.5f, 13.5f)
                curveTo(5.5f, 9.91f, 8.41f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _diamondRingFill!!
    }

private var _diamondRingFill: ImageVector? = null
