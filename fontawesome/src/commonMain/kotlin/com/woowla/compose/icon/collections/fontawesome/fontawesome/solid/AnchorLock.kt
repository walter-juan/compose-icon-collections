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

public val SolidGroup.AnchorLock: ImageVector
    get() {
        if (_anchorLock != null) {
            return _anchorLock!!
        }
        _anchorLock = Builder(name = "AnchorLock", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
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
                curveToRelative(28.3f, 0.0f, 55.4f, -5.7f, 80.0f, -15.9f)
                lineToRelative(0.0f, -0.2f)
                lineToRelative(0.0f, -72.2f)
                curveToRelative(-14.4f, 9.6f, -30.6f, 16.7f, -48.0f, 20.7f)
                lineToRelative(0.0f, -257.9f)
                curveToRelative(37.3f, -13.2f, 64.0f, -48.7f, 64.0f, -90.5f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(560.5f, 304.1f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(416.5f, 400.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -20.9f, -13.4f, -38.7f, -32.0f, -45.3f)
                lineToRelative(0.0f, -50.6f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                lineToRelative(0.0f, 50.6f)
                curveToRelative(-18.6f, 6.6f, -32.0f, 24.4f, -32.0f, 45.3f)
                close()
            }
        }
        .build()
        return _anchorLock!!
    }

private var _anchorLock: ImageVector? = null
