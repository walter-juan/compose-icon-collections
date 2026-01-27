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

public val SolidGroup.Diagnoses: ImageVector
    get() {
        if (_diagnoses != null) {
            return _diagnoses!!
        }
        _diagnoses = Builder(name = "Diagnoses", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 72.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 144.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -144.0f, 0.0f)
                close()
                moveTo(160.0f, 299.3f)
                curveToRelative(-19.9f, 22.6f, -32.0f, 52.2f, -32.0f, 84.7f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -106.0f, 86.0f, -192.0f, 192.0f, -192.0f)
                reflectiveCurveToRelative(192.0f, 86.0f, 192.0f, 192.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -32.5f, -12.1f, -62.1f, -32.0f, -84.7f)
                lineToRelative(0.0f, 116.7f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -116.7f)
                close()
                moveTo(232.0f, 384.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(320.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(24.0f, 464.0f)
                lineToRelative(464.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(64.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(488.0f, 256.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _diagnoses!!
    }

private var _diagnoses: ImageVector? = null
