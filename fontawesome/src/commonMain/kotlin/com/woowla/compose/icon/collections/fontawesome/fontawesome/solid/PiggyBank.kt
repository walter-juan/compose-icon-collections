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

public val SolidGroup.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, -32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
                moveTo(48.0f, 304.0f)
                curveToRelative(0.0f, -70.1f, 47.0f, -131.4f, 117.1f, -164.9f)
                curveToRelative(25.3f, 41.3f, 70.9f, 68.9f, 122.9f, 68.9f)
                curveToRelative(55.7f, 0.0f, 104.1f, -31.7f, 128.0f, -78.0f)
                curveToRelative(15.8f, -11.3f, 35.1f, -18.0f, 56.0f, -18.0f)
                lineToRelative(19.5f, 0.0f)
                curveToRelative(10.4f, 0.0f, 18.0f, 9.8f, 15.5f, 19.9f)
                lineToRelative(-17.1f, 68.3f)
                curveToRelative(9.9f, 12.4f, 18.2f, 25.7f, 24.4f, 39.8f)
                lineToRelative(21.7f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-40.0f, 0.0f)
                curveToRelative(-16.5f, 22.0f, -38.5f, 39.6f, -64.0f, 50.7f)
                lineToRelative(0.0f, 29.3f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-33.0f, 0.0f)
                curveToRelative(-14.3f, 0.0f, -26.8f, -9.5f, -30.8f, -23.2f)
                lineToRelative(-7.1f, -24.8f)
                lineToRelative(-82.3f, 0.0f)
                lineToRelative(-7.1f, 24.8f)
                curveTo(235.8f, 502.5f, 223.3f, 512.0f, 209.0f, 512.0f)
                lineToRelative(-33.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -29.3f)
                curveTo(87.5f, 426.0f, 48.0f, 369.6f, 48.0f, 304.0f)
                close()
                moveTo(424.0f, 320.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
