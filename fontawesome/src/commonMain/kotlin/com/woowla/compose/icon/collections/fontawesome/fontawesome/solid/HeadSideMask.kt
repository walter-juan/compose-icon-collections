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

public val SolidGroup.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(445.9f, 193.0f)
                curveToRelative(-0.1f, -0.4f, -0.2f, -0.9f, -0.2f, -1.3f)
                curveToRelative(-15.7f, -108.4f, -108.9f, -191.7f, -221.7f, -191.7f)
                curveToRelative(-85.0f, 0.0f, -159.0f, 47.4f, -196.9f, 117.2f)
                lineTo(283.3f, 288.0f)
                lineTo(456.0f, 288.0f)
                lineTo(442.9f, 336.0f)
                lineTo(336.0f, 336.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(98.2f, 0.0f)
                lineToRelative(-8.7f, 32.0f)
                lineToRelative(-89.5f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(80.6f, 0.0f)
                curveToRelative(-6.7f, 19.1f, -24.8f, 32.0f, -45.3f, 32.0f)
                lineTo(288.0f, 464.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -104.5f)
                lineToRelative(-247.5f, -165.0f)
                curveTo(3.0f, 182.1f, 0.0f, 202.7f, 0.0f, 224.0f)
                curveTo(0.0f, 278.0f, 19.1f, 327.5f, 50.9f, 366.2f)
                curveTo(58.9f, 375.9f, 64.0f, 387.8f, 64.0f, 400.4f)
                lineTo(64.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(127.3f, 0.0f)
                lineToRelative(0.7f, 0.0f)
                lineToRelative(131.3f, 0.0f)
                curveToRelative(44.9f, 0.0f, 83.8f, -31.1f, 93.6f, -74.9f)
                lineToRelative(33.9f, -150.3f)
                curveToRelative(3.3f, -14.4f, -0.3f, -29.5f, -9.7f, -41.0f)
                lineTo(445.9f, 193.0f)
                close()
                moveTo(288.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
