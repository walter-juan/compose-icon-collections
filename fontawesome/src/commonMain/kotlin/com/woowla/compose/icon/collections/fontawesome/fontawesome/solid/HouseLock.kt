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

public val SolidGroup.HouseLock: ImageVector
    get() {
        if (_houseLock != null) {
            return _houseLock!!
        }
        _houseLock = Builder(name = "HouseLock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 224.1f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 50.6f)
                curveToRelative(18.6f, 6.6f, 32.0f, 24.4f, 32.0f, 45.3f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -20.9f, 13.4f, -38.7f, 32.0f, -45.3f)
                lineToRelative(0.0f, -50.6f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                close()
                moveTo(268.6f, 6.5f)
                curveToRelative(12.2f, -9.3f, 29.7f, -8.7f, 41.2f, 2.0f)
                lineToRelative(185.0f, 171.8f)
                curveTo(440.2f, 195.0f, 400.0f, 244.8f, 400.0f, 304.0f)
                lineToRelative(0.0f, 24.4f)
                curveToRelative(-19.6f, 17.6f, -32.0f, 43.1f, -32.0f, 71.5f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 5.5f, 0.5f, 10.9f, 1.3f, 16.1f)
                lineTo(144.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-13.2f, 0.0f, -25.0f, -8.1f, -29.8f, -20.3f)
                reflectiveCurveToRelative(-1.6f, -26.2f, 8.0f, -35.1f)
                lineToRelative(224.0f, -208.0f)
                lineToRelative(2.4f, -2.0f)
                close()
                moveTo(272.0f, 320.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, -87.3f)
                curveToRelative(0.0f, -16.5f, 7.0f, -31.5f, 18.4f, -42.1f)
                curveToRelative(-8.7f, -9.0f, -20.9f, -14.6f, -34.4f, -14.6f)
                lineToRelative(-32.0f, 0.0f)
                close()
                moveTo(528.0f, 272.1f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _houseLock!!
    }

private var _houseLock: ImageVector? = null
