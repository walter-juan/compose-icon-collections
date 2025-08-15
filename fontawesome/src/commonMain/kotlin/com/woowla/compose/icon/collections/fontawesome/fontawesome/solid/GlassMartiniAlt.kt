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

public val SolidGroup.GlassMartiniAlt: ImageVector
    get() {
        if (_glassMartiniAlt != null) {
            return _glassMartiniAlt!!
        }
        _glassMartiniAlt = Builder(name = "GlassMartiniAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4f, 51.8f)
                curveTo(7.4f, 39.8f, 19.1f, 32.0f, 32.0f, 32.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(12.9f, 0.0f, 24.6f, 7.8f, 29.6f, 19.8f)
                reflectiveCurveToRelative(2.2f, 25.7f, -6.9f, 34.9f)
                lineTo(288.0f, 301.3f)
                lineTo(288.0f, 448.0f)
                lineTo(352.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -146.7f)
                lineToRelative(-214.6f, -214.6f)
                curveTo(0.2f, 77.5f, -2.5f, 63.7f, 2.4f, 51.8f)
                close()
                moveTo(354.7f, 144.0f)
                lineToRelative(48.0f, -48.0f)
                lineToRelative(-293.5f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                lineToRelative(197.5f, 0.0f)
                close()
            }
        }
        .build()
        return _glassMartiniAlt!!
    }

private var _glassMartiniAlt: ImageVector? = null
