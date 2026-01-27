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

public val SolidGroup.GlassMartini: ImageVector
    get() {
        if (_glassMartini != null) {
            return _glassMartini!!
        }
        _glassMartini = Builder(name = "GlassMartini", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(19.1f, 32.0f, 7.4f, 39.8f, 2.4f, 51.8f)
                reflectiveCurveTo(0.2f, 77.5f, 9.4f, 86.6f)
                lineToRelative(214.6f, 214.6f)
                lineToRelative(0.0f, 146.7f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -146.7f)
                lineToRelative(214.6f, -214.6f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveTo(492.9f, 32.0f, 480.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                close()
                moveTo(256.0f, 242.7f)
                lineTo(109.3f, 96.0f)
                lineTo(402.7f, 96.0f)
                lineTo(256.0f, 242.7f)
                close()
            }
        }
        .build()
        return _glassMartini!!
    }

private var _glassMartini: ImageVector? = null
