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

public val OutlineGroup.CurrencyGuarani: ImageVector
    get() {
        if (_currencyGuarani != null) {
            return _currencyGuarani!!
        }
        _currencyGuarani = Builder(name = "CurrencyGuarani", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.007f, 7.54f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, -4.008f, -1.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.992f, 6.0f)
                curveToRelative(0.0f, 3.314f, 2.682f, 6.0f, 5.992f, 6.0f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, 4.0f, -1.536f)
                curveToRelative(0.732f, -0.66f, 1.064f, -2.148f, 1.0f, -4.464f)
                horizontalLineToRelative(-5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                verticalLineToRelative(-16.0f)
            }
        }
        .build()
        return _currencyGuarani!!
    }

private var _currencyGuarani: ImageVector? = null