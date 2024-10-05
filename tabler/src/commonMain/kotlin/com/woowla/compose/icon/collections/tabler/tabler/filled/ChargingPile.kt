package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ChargingPile: ImageVector
    get() {
        if (_chargingPile != null) {
            return _chargingPile!!
        }
        _chargingPile = Builder(name = "ChargingPile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineToRelative(-6.585f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-0.293f, 0.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(0.292f, -0.293f)
                lineToRelative(-0.292f, -0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                verticalLineToRelative(-13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(9.514f, 10.643f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.371f, 0.343f)
                lineToRelative(-1.5f, 2.5f)
                lineToRelative(-0.054f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.911f, 1.414f)
                horizontalLineToRelative(1.233f)
                lineToRelative(-0.59f, 0.986f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.714f, 1.028f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(0.054f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.911f, -1.414f)
                horizontalLineToRelative(-1.235f)
                lineToRelative(0.592f, -0.986f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.343f, -1.371f)
                moveToRelative(2.486f, -5.643f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
            }
        }
        .build()
        return _chargingPile!!
    }

private var _chargingPile: ImageVector? = null
