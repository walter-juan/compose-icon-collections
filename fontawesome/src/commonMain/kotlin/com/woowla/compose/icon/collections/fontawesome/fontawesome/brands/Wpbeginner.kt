package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Wpbeginner: ImageVector
    get() {
        if (_wpbeginner != null) {
            return _wpbeginner!!
        }
        _wpbeginner = Builder(name = "Wpbeginner", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.2f, 322.4f)
                curveToRelative(56.2f, 64.3f, 4.2f, 157.6f, -91.9f, 157.6f)
                curveToRelative(-39.6f, 0.0f, -78.8f, -17.7f, -100.1f, -50.0f)
                curveToRelative(-6.9f, 0.4f, -22.7f, 0.4f, -29.6f, 0.0f)
                curveToRelative(-21.4f, 32.4f, -60.6f, 50.0f, -100.1f, 50.0f)
                curveToRelative(-95.5f, 0.0f, -148.3f, -93.0f, -91.9f, -157.6f)
                curveToRelative(-79.1f, -131.9f, 31.3f, -290.4f, 206.8f, -290.4f)
                curveToRelative(175.6f, 0.0f, 285.9f, 158.6f, 206.8f, 290.4f)
                close()
                moveTo(123.6f, 239.4f)
                lineToRelative(41.5f, 0.0f)
                lineToRelative(0.0f, -58.1f)
                lineToRelative(-41.5f, 0.0f)
                lineToRelative(0.0f, 58.1f)
                close()
                moveTo(340.8f, 325.5f)
                lineToRelative(0.0f, -23.8f)
                curveToRelative(-60.5f, 20.9f, -132.4f, 9.2f, -187.6f, -34.0f)
                lineToRelative(0.2f, 24.9f)
                curveToRelative(51.1f, 46.4f, 131.7f, 57.9f, 187.3f, 32.9f)
                close()
                moveTo(190.0f, 239.4f)
                lineToRelative(166.1f, 0.0f)
                lineToRelative(0.0f, -58.1f)
                lineToRelative(-166.1f, 0.0f)
                lineToRelative(0.0f, 58.1f)
                close()
            }
        }
        .build()
        return _wpbeginner!!
    }

private var _wpbeginner: ImageVector? = null
