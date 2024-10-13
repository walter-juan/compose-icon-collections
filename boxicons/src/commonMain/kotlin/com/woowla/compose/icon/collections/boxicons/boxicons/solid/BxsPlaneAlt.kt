package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPlaneAlt: ImageVector
    get() {
        if (_bxsPlaneAlt != null) {
            return _bxsPlaneAlt!!
        }
        _bxsPlaneAlt = Builder(name = "BxsPlaneAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.414f, 13.778f)
                lineTo(2.0f, 15.192f)
                lineToRelative(4.949f, 2.121f)
                lineToRelative(2.122f, 4.95f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.707f, -3.536f)
                lineTo(13.091f, 14.0f)
                lineToRelative(3.61f, 7.704f)
                lineToRelative(1.339f, -1.339f)
                lineToRelative(-1.19f, -10.123f)
                lineToRelative(2.828f, -2.829f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.828f, -2.828f)
                lineToRelative(-2.903f, 2.903f)
                lineTo(3.824f, 6.297f)
                lineTo(2.559f, 7.563f)
                lineToRelative(7.644f, 3.67f)
                lineToRelative(-3.253f, 3.253f)
                lineToRelative(-3.536f, -0.708f)
                close()
            }
        }
        .build()
        return _bxsPlaneAlt!!
    }

private var _bxsPlaneAlt: ImageVector? = null
