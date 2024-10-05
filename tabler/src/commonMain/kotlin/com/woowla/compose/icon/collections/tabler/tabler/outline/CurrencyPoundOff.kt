package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.CurrencyPoundOff: ImageVector
    get() {
        if (_currencyPoundOff != null) {
            return _currencyPoundOff!!
        }
        _currencyPoundOff = Builder(name = "CurrencyPoundOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.5f)
                verticalLineToRelative(-7.5f)
                moveToRelative(1.192f, -2.825f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.258f, 0.825f)
                moveToRelative(-3.45f, 6.0f)
                horizontalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _currencyPoundOff!!
    }

private var _currencyPoundOff: ImageVector? = null
