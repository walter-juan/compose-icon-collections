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

public val SolidGroup.AnchorCircleXmark: ImageVector
    get() {
        if (_anchorCircleXmark != null) {
            return _anchorCircleXmark!!
        }
        _anchorCircleXmark = Builder(name = "AnchorCircleXmark", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.5f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                close()
                moveTo(288.5f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 41.8f, 26.7f, 77.4f, 64.0f, 90.5f)
                lineToRelative(0.0f, 257.9f)
                curveToRelative(-62.9f, -14.3f, -110.2f, -69.7f, -111.9f, -136.5f)
                lineToRelative(16.1f, 14.1f)
                curveToRelative(10.0f, 8.7f, 25.1f, 7.7f, 33.9f, -2.3f)
                reflectiveCurveToRelative(7.7f, -25.1f, -2.3f, -33.9f)
                lineToRelative(-64.0f, -56.0f)
                curveToRelative(-9.0f, -7.9f, -22.6f, -7.9f, -31.6f, 0.0f)
                lineToRelative(-64.0f, 56.0f)
                curveToRelative(-10.0f, 8.7f, -11.0f, 23.9f, -2.3f, 33.9f)
                reflectiveCurveToRelative(23.9f, 11.0f, 33.9f, 2.3f)
                lineToRelative(16.2f, -14.2f)
                curveToRelative(2.1f, 113.1f, 94.4f, 204.1f, 208.0f, 204.1f)
                curveToRelative(16.6f, 0.0f, 32.7f, -1.9f, 48.2f, -5.6f)
                curveToRelative(-20.3f, -30.5f, -32.2f, -67.0f, -32.2f, -106.4f)
                curveToRelative(0.0f, -27.3f, 5.7f, -53.3f, 16.0f, -76.9f)
                lineToRelative(0.0f, -136.6f)
                curveToRelative(37.3f, -13.2f, 64.0f, -48.7f, 64.0f, -90.5f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(496.5f, 544.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(555.8f, 363.3f)
                lineToRelative(-36.7f, 36.7f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-36.7f, -36.7f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(36.7f, -36.7f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(36.7f, 36.7f)
                lineToRelative(36.7f, -36.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _anchorCircleXmark!!
    }

private var _anchorCircleXmark: ImageVector? = null
