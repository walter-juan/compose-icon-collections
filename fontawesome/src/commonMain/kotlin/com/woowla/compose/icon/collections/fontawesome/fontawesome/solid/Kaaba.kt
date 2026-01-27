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

public val SolidGroup.Kaaba: ImageVector
    get() {
        if (_kaaba != null) {
            return _kaaba!!
        }
        _kaaba = Builder(name = "Kaaba", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 51.3f)
                lineTo(92.8f, 112.4f)
                lineTo(247.5f, 171.1f)
                curveToRelative(5.5f, 2.1f, 11.5f, 2.1f, 17.0f, 0.0f)
                lineTo(419.2f, 112.4f)
                lineTo(256.0f, 51.3f)
                close()
                moveTo(0.0f, 129.3f)
                curveToRelative(0.0f, -20.0f, 12.4f, -37.9f, 31.1f, -44.9f)
                lineToRelative(208.0f, -78.0f)
                curveToRelative(10.9f, -4.1f, 22.8f, -4.1f, 33.7f, 0.0f)
                lineToRelative(208.0f, 78.0f)
                curveToRelative(18.7f, 7.0f, 31.1f, 24.9f, 31.1f, 44.9f)
                lineToRelative(0.0f, 36.0f)
                lineToRelative(-253.2f, 96.0f)
                curveToRelative(-1.8f, 0.7f, -3.8f, 0.7f, -5.7f, 0.0f)
                lineToRelative(-253.2f, -96.0f)
                lineToRelative(0.0f, -36.0f)
                close()
                moveTo(0.0f, 269.3f)
                lineToRelative(0.0f, -52.7f)
                lineToRelative(236.1f, 89.6f)
                curveToRelative(12.8f, 4.9f, 26.9f, 4.9f, 39.7f, 0.0f)
                lineToRelative(236.1f, -89.6f)
                lineToRelative(0.0f, 52.7f)
                lineToRelative(-128.0f, 48.6f)
                lineToRelative(0.0f, 51.3f)
                lineToRelative(128.0f, -48.6f)
                lineToRelative(0.0f, 62.2f)
                curveToRelative(0.0f, 20.0f, -12.4f, 37.9f, -31.1f, 44.9f)
                lineToRelative(-208.0f, 78.0f)
                curveToRelative(-10.9f, 4.1f, -22.8f, 4.1f, -33.7f, 0.0f)
                lineToRelative(-208.0f, -78.0f)
                curveTo(12.4f, 420.7f, 0.0f, 402.7f, 0.0f, 382.7f)
                lineToRelative(0.0f, -62.2f)
                lineToRelative(128.0f, 48.6f)
                lineToRelative(0.0f, -51.3f)
                lineToRelative(-128.0f, -48.6f)
                close()
                moveTo(236.1f, 410.1f)
                curveToRelative(12.8f, 4.9f, 26.9f, 4.9f, 39.7f, 0.0f)
                lineToRelative(60.1f, -22.8f)
                lineToRelative(0.0f, -51.3f)
                lineToRelative(-77.2f, 29.3f)
                curveToRelative(-1.8f, 0.7f, -3.8f, 0.7f, -5.7f, 0.0f)
                lineToRelative(-77.2f, -29.3f)
                lineToRelative(0.0f, 51.3f)
                lineToRelative(60.1f, 22.8f)
                close()
            }
        }
        .build()
        return _kaaba!!
    }

private var _kaaba: ImageVector? = null
