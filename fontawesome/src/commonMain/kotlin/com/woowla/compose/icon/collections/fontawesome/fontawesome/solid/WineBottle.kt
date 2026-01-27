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

public val SolidGroup.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                curveToRelative(0.0f, 11.8f, -6.4f, 22.2f, -16.0f, 27.7f)
                lineToRelative(0.0f, 145.6f)
                curveToRelative(56.5f, 24.7f, 96.0f, 81.1f, 96.0f, 146.7f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 576.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 288.0f)
                curveToRelative(0.0f, -65.6f, 39.5f, -122.0f, 96.0f, -146.7f)
                lineTo(96.0f, -4.3f)
                curveTo(86.4f, -9.8f, 80.0f, -20.2f, 80.0f, -32.0f)
                close()
                moveTo(96.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 288.0f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
