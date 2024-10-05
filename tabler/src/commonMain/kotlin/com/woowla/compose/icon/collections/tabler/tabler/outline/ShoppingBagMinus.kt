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

public val OutlineGroup.ShoppingBagMinus: ImageVector
    get() {
        if (_shoppingBagMinus != null) {
            return _shoppingBagMinus!!
        }
        _shoppingBagMinus = Builder(name = "ShoppingBagMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 21.0f)
                horizontalLineToRelative(-3.926f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.965f, -2.544f)
                lineToRelative(-1.255f, -8.152f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.977f, -2.304f)
                horizontalLineToRelative(11.339f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.977f, 2.304f)
                lineToRelative(-0.73f, 4.744f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _shoppingBagMinus!!
    }

private var _shoppingBagMinus: ImageVector? = null
