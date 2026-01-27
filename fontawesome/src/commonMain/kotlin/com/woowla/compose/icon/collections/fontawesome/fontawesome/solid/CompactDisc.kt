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

public val SolidGroup.CompactDisc: ImageVector
    get() {
        if (_compactDisc != null) {
            return _compactDisc!!
        }
        _compactDisc = Builder(name = "CompactDisc", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(256.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                close()
                moveTo(160.0f, 256.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                close()
                moveTo(104.0f, 240.0f)
                curveToRelative(0.0f, -32.4f, 16.3f, -66.6f, 42.8f, -93.2f)
                reflectiveCurveTo(207.6f, 104.0f, 240.0f, 104.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                curveToRelative(-47.9f, 0.0f, -93.7f, 23.5f, -127.1f, 56.9f)
                reflectiveCurveTo(56.0f, 192.1f, 56.0f, 240.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _compactDisc!!
    }

private var _compactDisc: ImageVector? = null
