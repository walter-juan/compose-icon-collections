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

public val SolidGroup.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, -32.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(320.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
                moveTo(352.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(96.0f, 160.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(0.0f, 23.8f, 7.4f, 45.9f, 20.1f, 64.0f)
                lineTo(160.0f, 224.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                curveToRelative(0.0f, -35.1f, -18.9f, -65.9f, -47.0f, -82.6f)
                curveToRelative(19.0f, -19.8f, 30.7f, -46.6f, 31.0f, -76.1f)
                curveToRelative(45.4f, 7.6f, 80.0f, 47.1f, 80.0f, 94.7f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(96.0f, 480.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(0.0f, 256.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                close()
                moveTo(160.0f, 272.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
