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

public val FinanceGroup.TokenSwapFill: ImageVector
    get() {
        if (_tokenSwapFill != null) {
            return _tokenSwapFill!!
        }
        _tokenSwapFill = Builder(name = "TokenSwapFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.0f)
                curveTo(21.5f, 11.704f, 19.849f, 14.022f, 17.5f, 15.002f)
                lineTo(17.5f, 15.0f)
                curveTo(17.5f, 10.306f, 13.694f, 6.5f, 9.0f, 6.5f)
                lineTo(8.998f, 6.5f)
                curveTo(9.978f, 4.151f, 12.296f, 2.5f, 15.0f, 2.5f)
                curveTo(18.59f, 2.5f, 21.5f, 5.41f, 21.5f, 9.0f)
                close()
                moveTo(7.0f, 3.0f)
                curveTo(4.791f, 3.0f, 3.0f, 4.791f, 3.0f, 7.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.895f, 5.895f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(19.0f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.105f, 18.105f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                curveTo(19.209f, 21.0f, 21.0f, 19.209f, 21.0f, 17.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.0f)
                close()
                moveTo(9.0f, 21.5f)
                curveTo(12.59f, 21.5f, 15.5f, 18.59f, 15.5f, 15.0f)
                curveTo(15.5f, 11.41f, 12.59f, 8.5f, 9.0f, 8.5f)
                curveTo(5.41f, 8.5f, 2.5f, 11.41f, 2.5f, 15.0f)
                curveTo(2.5f, 18.59f, 5.41f, 21.5f, 9.0f, 21.5f)
                close()
                moveTo(9.0f, 12.5f)
                lineTo(11.5f, 15.0f)
                lineTo(9.0f, 17.5f)
                lineTo(6.5f, 15.0f)
                lineTo(9.0f, 12.5f)
                close()
            }
        }
        .build()
        return _tokenSwapFill!!
    }

private var _tokenSwapFill: ImageVector? = null
