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

public val SolidGroup.RoadLock: ImageVector
    get() {
        if (_roadLock != null) {
            return _roadLock!!
        }
        _roadLock = Builder(name = "RoadLock", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                lineToRelative(-76.3f, 0.0f)
                curveToRelative(-29.4f, 0.0f, -55.1f, 20.1f, -62.1f, 48.6f)
                lineTo(33.4f, 420.5f)
                curveTo(25.9f, 450.7f, 48.8f, 480.0f, 80.0f, 480.0f)
                lineToRelative(175.9f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                curveToRelative(6.1f, 0.0f, 11.8f, 1.7f, 16.7f, 4.7f)
                curveToRelative(2.8f, -23.9f, 14.3f, -45.1f, 31.4f, -60.3f)
                lineToRelative(0.0f, -24.4f)
                curveToRelative(0.0f, -70.7f, 57.3f, -128.0f, 128.0f, -128.0f)
                curveToRelative(6.2f, 0.0f, 12.4f, 0.4f, 18.4f, 1.3f)
                lineTo(458.5f, 80.6f)
                curveTo(451.4f, 52.1f, 425.8f, 32.0f, 396.3f, 32.0f)
                lineToRelative(-76.4f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(320.0f, 224.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(496.0f, 304.1f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(352.0f, 400.0f)
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
        return _roadLock!!
    }

private var _roadLock: ImageVector? = null
