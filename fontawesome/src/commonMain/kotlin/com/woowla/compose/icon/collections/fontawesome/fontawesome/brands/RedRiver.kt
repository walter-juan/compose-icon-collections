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

public val BrandsGroup.RedRiver: ImageVector
    get() {
        if (_redRiver != null) {
            return _redRiver!!
        }
        _redRiver = Builder(name = "RedRiver", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(353.2f, 32.0f)
                lineTo(94.8f, 32.0f)
                curveTo(42.4f, 32.0f, 0.0f, 74.4f, 0.0f, 126.8f)
                lineTo(0.0f, 385.2f)
                curveTo(0.0f, 437.6f, 42.4f, 480.0f, 94.8f, 480.0f)
                lineToRelative(258.4f, 0.0f)
                curveToRelative(52.4f, 0.0f, 94.8f, -42.4f, 94.8f, -94.8f)
                lineToRelative(0.0f, -258.4f)
                curveTo(448.0f, 74.4f, 405.6f, 32.0f, 353.2f, 32.0f)
                close()
                moveTo(144.9f, 200.9f)
                lineToRelative(0.0f, 56.3f)
                curveToRelative(0.0f, 27.0f, -21.9f, 48.9f, -48.9f, 48.9f)
                lineToRelative(0.0f, -154.2f)
                curveToRelative(0.0f, -13.2f, 10.7f, -23.9f, 23.9f, -23.9f)
                lineToRelative(154.2f, 0.0f)
                curveToRelative(0.0f, 27.0f, -21.9f, 48.9f, -48.9f, 48.9f)
                lineToRelative(-56.3f, 0.0f)
                curveToRelative(-12.3f, -0.6f, -24.6f, 11.6f, -24.0f, 24.0f)
                close()
                moveTo(321.2f, 272.9f)
                lineToRelative(-56.3f, 0.0f)
                curveToRelative(-12.3f, -0.6f, -24.6f, 11.6f, -24.0f, 24.0f)
                lineToRelative(0.0f, 56.3f)
                curveToRelative(0.0f, 27.0f, -21.9f, 48.9f, -48.9f, 48.9f)
                lineToRelative(0.0f, -154.2f)
                curveToRelative(0.0f, -13.2f, 10.7f, -23.9f, 23.9f, -23.9f)
                lineToRelative(154.2f, 0.0f)
                curveToRelative(0.0f, 27.0f, -21.9f, 48.9f, -48.9f, 48.9f)
                close()
            }
        }
        .build()
        return _redRiver!!
    }

private var _redRiver: ImageVector? = null
