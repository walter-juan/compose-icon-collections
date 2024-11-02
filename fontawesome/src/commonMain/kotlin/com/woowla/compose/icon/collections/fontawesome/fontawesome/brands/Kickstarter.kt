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

public val BrandsGroup.Kickstarter: ImageVector
    get() {
        if (_kickstarter != null) {
            return _kickstarter!!
        }
        _kickstarter = Builder(name = "Kickstarter", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(320.8f, 233.0f)
                lineToRelative(-23.3f, 23.1f)
                lineTo(320.8f, 279.0f)
                curveToRelative(24.1f, 23.9f, 24.1f, 63.0f, 0.0f, 86.9f)
                reflectiveCurveToRelative(-63.4f, 23.9f, -87.6f, 0.0f)
                lineToRelative(-8.5f, -8.4f)
                curveToRelative(-11.3f, 16.0f, -29.7f, 26.5f, -50.9f, 26.5f)
                curveToRelative(-34.1f, 0.0f, -61.9f, -27.5f, -61.9f, -61.4f)
                lineToRelative(0.0f, -133.2f)
                curveToRelative(0.0f, -33.8f, 27.7f, -61.4f, 61.9f, -61.4f)
                curveToRelative(21.1f, 0.0f, 39.6f, 10.5f, 50.9f, 26.5f)
                lineToRelative(8.5f, -8.4f)
                curveToRelative(24.1f, -23.9f, 63.4f, -23.9f, 87.6f, 0.0f)
                reflectiveCurveToRelative(24.1f, 63.0f, 0.0f, 86.9f)
                close()
            }
        }
        .build()
        return _kickstarter!!
    }

private var _kickstarter: ImageVector? = null
