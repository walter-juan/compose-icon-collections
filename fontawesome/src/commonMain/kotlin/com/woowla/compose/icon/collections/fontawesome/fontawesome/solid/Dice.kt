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

public val SolidGroup.Dice: ImageVector
    get() {
        if (_dice != null) {
            return _dice!!
        }
        _dice = Builder(name = "Dice", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.4f, 2.3f)
                curveTo(103.0f, -8.0f, 63.5f, 14.8f, 53.3f, 53.2f)
                lineTo(2.5f, 242.7f)
                curveTo(-7.8f, 281.1f, 15.0f, 320.6f, 53.4f, 330.9f)
                lineToRelative(189.5f, 50.8f)
                curveToRelative(38.4f, 10.3f, 77.9f, -12.5f, 88.2f, -50.9f)
                lineToRelative(50.8f, -189.5f)
                curveToRelative(10.3f, -38.4f, -12.5f, -77.9f, -50.9f, -88.2f)
                lineTo(141.4f, 2.3f)
                close()
                moveTo(164.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 55.4f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -55.4f, 32.0f)
                close()
                moveTo(79.2f, 220.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 55.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -55.4f)
                close()
                moveTo(264.2f, 316.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -55.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 55.4f)
                close()
                moveTo(273.2f, 108.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 55.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -55.4f)
                close()
                moveTo(152.2f, 122.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -55.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 55.4f)
                close()
                moveTo(418.0f, 192.0f)
                lineTo(377.4f, 343.2f)
                curveToRelative(-17.2f, 64.0f, -83.0f, 102.0f, -147.0f, 84.9f)
                lineToRelative(-38.3f, -10.3f)
                lineToRelative(0.0f, 30.2f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -192.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(418.0f, 192.0f)
                close()
            }
        }
        .build()
        return _dice!!
    }

private var _dice: ImageVector? = null
