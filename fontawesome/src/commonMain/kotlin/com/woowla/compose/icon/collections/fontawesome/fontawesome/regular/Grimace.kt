package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Grimace: ImageVector
    get() {
        if (_grimace != null) {
            return _grimace!!
        }
        _grimace = Builder(name = "Grimace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 0.0f, -416.0f)
                close()
                moveTo(512.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                close()
                moveTo(152.0f, 352.0f)
                curveToRelative(0.0f, 11.9f, 8.6f, 21.8f, 20.0f, 23.7f)
                lineToRelative(0.0f, -47.3f)
                curveToRelative(-11.4f, 1.9f, -20.0f, 11.8f, -20.0f, 23.7f)
                close()
                moveTo(236.0f, 376.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(24.0f, 0.0f)
                close()
                moveTo(300.0f, 376.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(24.0f, 0.0f)
                close()
                moveTo(340.0f, 375.7f)
                curveToRelative(11.4f, -1.9f, 20.0f, -11.8f, 20.0f, -23.7f)
                reflectiveCurveToRelative(-8.6f, -21.8f, -20.0f, -23.7f)
                lineToRelative(0.0f, 47.3f)
                close()
                moveTo(176.0f, 288.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _grimace!!
    }

private var _grimace: ImageVector? = null
