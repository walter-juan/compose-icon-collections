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

public val SolidGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(419.5f, 96.0f)
                curveToRelative(-16.6f, 0.0f, -32.7f, 4.5f, -46.8f, 12.7f)
                curveToRelative(-15.8f, -16.0f, -34.2f, -29.4f, -54.5f, -39.5f)
                curveToRelative(28.2f, -24.0f, 64.1f, -37.2f, 101.3f, -37.2f)
                curveToRelative(86.4f, 0.0f, 156.5f, 70.0f, 156.5f, 156.5f)
                curveToRelative(0.0f, 41.5f, -16.5f, 81.3f, -45.8f, 110.6f)
                lineToRelative(-71.1f, 71.1f)
                curveToRelative(-29.3f, 29.3f, -69.1f, 45.8f, -110.6f, 45.8f)
                curveToRelative(-86.4f, 0.0f, -156.5f, -70.0f, -156.5f, -156.5f)
                curveToRelative(0.0f, -1.5f, 0.0f, -3.0f, 0.1f, -4.5f)
                curveToRelative(0.5f, -17.7f, 15.2f, -31.6f, 32.9f, -31.1f)
                reflectiveCurveToRelative(31.6f, 15.2f, 31.1f, 32.9f)
                curveToRelative(0.0f, 0.9f, 0.0f, 1.8f, 0.0f, 2.6f)
                curveToRelative(0.0f, 51.1f, 41.4f, 92.5f, 92.5f, 92.5f)
                curveToRelative(24.5f, 0.0f, 48.0f, -9.7f, 65.4f, -27.1f)
                lineToRelative(71.1f, -71.1f)
                curveToRelative(17.3f, -17.3f, 27.1f, -40.9f, 27.1f, -65.4f)
                curveToRelative(0.0f, -51.1f, -41.4f, -92.5f, -92.5f, -92.5f)
                close()
                moveTo(275.2f, 173.3f)
                curveToRelative(-1.9f, -0.8f, -3.8f, -1.9f, -5.5f, -3.1f)
                curveToRelative(-12.6f, -6.5f, -27.0f, -10.2f, -42.1f, -10.2f)
                curveToRelative(-24.5f, 0.0f, -48.0f, 9.7f, -65.4f, 27.1f)
                lineTo(91.1f, 258.2f)
                curveToRelative(-17.3f, 17.3f, -27.1f, 40.9f, -27.1f, 65.4f)
                curveToRelative(0.0f, 51.1f, 41.4f, 92.5f, 92.5f, 92.5f)
                curveToRelative(16.5f, 0.0f, 32.6f, -4.4f, 46.7f, -12.6f)
                curveToRelative(15.8f, 16.0f, 34.2f, 29.4f, 54.6f, 39.5f)
                curveToRelative(-28.2f, 23.9f, -64.0f, 37.2f, -101.3f, 37.2f)
                curveToRelative(-86.4f, 0.0f, -156.5f, -70.0f, -156.5f, -156.5f)
                curveToRelative(0.0f, -41.5f, 16.5f, -81.3f, 45.8f, -110.6f)
                lineToRelative(71.1f, -71.1f)
                curveToRelative(29.3f, -29.3f, 69.1f, -45.8f, 110.6f, -45.8f)
                curveToRelative(86.6f, 0.0f, 156.5f, 70.6f, 156.5f, 156.9f)
                curveToRelative(0.0f, 1.3f, 0.0f, 2.6f, 0.0f, 3.9f)
                curveToRelative(-0.4f, 17.7f, -15.1f, 31.6f, -32.8f, 31.2f)
                reflectiveCurveToRelative(-31.6f, -15.1f, -31.2f, -32.8f)
                curveToRelative(0.0f, -0.8f, 0.0f, -1.5f, 0.0f, -2.3f)
                curveToRelative(0.0f, -33.7f, -18.0f, -63.3f, -44.8f, -79.6f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
