package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.4f, 8.3f)
                curveTo(244.0f, -2.8f, 268.0f, -2.8f, 287.6f, 8.3f)
                lineToRelative(176.0f, 99.7f)
                curveToRelative(20.0f, 11.4f, 32.4f, 32.6f, 32.4f, 55.7f)
                lineToRelative(0.0f, 197.4f)
                curveToRelative(0.0f, 23.0f, -12.4f, 44.3f, -32.4f, 55.7f)
                lineToRelative(-176.0f, 99.7f)
                curveToRelative(-19.6f, 11.1f, -43.6f, 11.1f, -63.1f, 0.0f)
                lineToRelative(-176.0f, -99.7f)
                curveTo(28.4f, 405.5f, 16.0f, 384.2f, 16.0f, 361.2f)
                lineToRelative(0.0f, -197.4f)
                curveToRelative(0.0f, -23.0f, 12.4f, -44.3f, 32.4f, -55.7f)
                lineToRelative(176.0f, -99.7f)
                close()
                moveTo(102.6f, 155.6f)
                curveToRelative(-8.8f, -3.1f, -18.8f, 0.3f, -23.8f, 8.6f)
                reflectiveCurveToRelative(-3.2f, 18.7f, 3.6f, 25.0f)
                lineToRelative(3.2f, 2.4f)
                lineToRelative(150.2f, 90.2f)
                lineToRelative(0.0f, 148.7f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, -9.0f, 20.0f, -20.0f)
                lineToRelative(0.0f, -148.7f)
                lineToRelative(150.3f, -90.2f)
                curveToRelative(9.5f, -5.7f, 12.6f, -18.0f, 6.9f, -27.4f)
                reflectiveCurveToRelative(-18.0f, -12.5f, -27.4f, -6.9f)
                lineToRelative(-149.7f, 89.8f)
                lineToRelative(-149.7f, -89.8f)
                lineToRelative(-3.7f, -1.7f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
