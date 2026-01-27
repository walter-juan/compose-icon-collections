package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Chinarailway: ImageVector
    get() {
        if (_chinarailway != null) {
            return _chinarailway!!
        }
        _chinarailway = Builder(name = "Chinarailway", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.642f, 18.64f)
                arcToRelative(8.035f, 8.035f, 0.0f, true, false, -7.284f, 0.0f)
                lineToRelative(-1.476f, 1.932f)
                arcToRelative(10.435f, 10.435f, 0.0f, false, true, 3.136f, -19.339f)
                arcToRelative(1.043f, 1.043f, 0.0f, false, true, 0.939f, -1.186f)
                arcToRelative(11.478f, 11.478f, 0.0f, false, true, 2.086f, 0.0f)
                arcToRelative(1.043f, 1.043f, 0.0f, false, true, 0.939f, 1.186f)
                arcToRelative(10.435f, 10.435f, 0.0f, false, true, 3.136f, 19.339f)
                close()
                moveTo(18.447f, 22.68f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, 0.336f, 0.41f)
                lineTo(18.783f, 24.0f)
                lineTo(5.217f, 24.0f)
                verticalLineToRelative(-0.91f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, 0.336f, -0.41f)
                lineToRelative(4.438f, -0.887f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 1.174f, -1.432f)
                verticalLineToRelative(-5.934f)
                arcToRelative(1.043f, 1.043f, 0.0f, false, false, -0.757f, -1.003f)
                lineToRelative(-2.06f, -0.59f)
                lineTo(8.348f, 10.94f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, true, 1.345f, -1.456f)
                arcToRelative(29.217f, 29.217f, 0.0f, false, true, 4.614f, 0.0f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, true, 1.345f, 1.456f)
                verticalLineToRelative(1.896f)
                lineToRelative(-2.06f, 0.589f)
                arcToRelative(1.043f, 1.043f, 0.0f, false, false, -0.757f, 1.003f)
                verticalLineToRelative(5.934f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 1.174f, 1.432f)
                close()
            }
        }
        .build()
        return _chinarailway!!
    }

private var _chinarailway: ImageVector? = null
