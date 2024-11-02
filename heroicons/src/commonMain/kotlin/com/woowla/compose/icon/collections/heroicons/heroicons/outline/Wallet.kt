package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 10.757f, 19.993f, 9.75f, 18.75f, 9.75f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 11.407f, 13.657f, 12.75f, 12.0f, 12.75f)
                curveTo(10.343f, 12.75f, 9.0f, 11.407f, 9.0f, 9.75f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 9.75f, 3.0f, 10.757f, 3.0f, 12.0f)
                moveTo(21.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.243f, 19.993f, 20.25f, 18.75f, 20.25f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 20.25f, 3.0f, 19.243f, 3.0f, 18.0f)
                verticalLineTo(12.0f)
                moveTo(21.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(3.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(21.0f, 9.0f)
                curveTo(21.0f, 7.757f, 19.993f, 6.75f, 18.75f, 6.75f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 6.75f, 3.0f, 7.757f, 3.0f, 9.0f)
                moveTo(21.0f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.757f, 19.993f, 3.75f, 18.75f, 3.75f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 3.75f, 3.0f, 4.757f, 3.0f, 6.0f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
