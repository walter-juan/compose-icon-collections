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

public val Simpleicons.Springboot: ImageVector
    get() {
        if (_springboot != null) {
            return _springboot!!
        }
        _springboot = Builder(name = "Springboot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.693f, 10.706f)
                lineToRelative(-4.73f, -8.184f)
                curveToRelative(-0.409f, -0.711f, -1.417f, -1.294f, -2.24f, -1.294f)
                lineTo(7.273f, 1.227f)
                curveToRelative(-0.819f, 0.0f, -1.831f, 0.584f, -2.24f, 1.294f)
                lineTo(0.307f, 10.706f)
                curveToRelative(-0.41f, 0.711f, -0.41f, 1.873f, 0.0f, 2.584f)
                lineToRelative(4.725f, 8.189f)
                curveToRelative(0.409f, 0.711f, 1.417f, 1.294f, 2.24f, 1.294f)
                horizontalLineToRelative(9.455f)
                curveToRelative(0.819f, 0.0f, 1.826f, -0.584f, 2.24f, -1.294f)
                lineToRelative(4.725f, -8.189f)
                curveToRelative(0.41f, -0.711f, 0.41f, -1.873f, 0.0f, -2.584f)
                close()
                moveTo(10.976f, 5.755f)
                curveToRelative(0.0f, -0.536f, 0.438f, -0.974f, 0.974f, -0.974f)
                reflectiveCurveToRelative(0.974f, 0.438f, 0.974f, 0.974f)
                verticalLineToRelative(5.822f)
                curveToRelative(0.0f, 0.537f, -0.438f, 0.974f, -0.974f, 0.974f)
                reflectiveCurveToRelative(-0.974f, -0.438f, -0.974f, -0.974f)
                close()
                moveTo(11.951f, 18.184f)
                curveToRelative(-3.643f, 0.0f, -6.608f, -2.965f, -6.608f, -6.608f)
                curveToRelative(0.005f, -2.09f, 0.993f, -4.052f, 2.668f, -5.304f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, 1.214f, 0.179f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, true, -0.179f, 1.214f)
                curveToRelative(-2.16f, 1.605f, -2.612f, 4.659f, -1.007f, 6.819f)
                curveToRelative(1.605f, 2.16f, 4.659f, 2.612f, 6.819f, 1.007f)
                curveToRelative(1.238f, -0.918f, 1.967f, -2.372f, 1.967f, -3.916f)
                arcToRelative(4.897f, 4.897f, 0.0f, false, false, -1.986f, -3.925f)
                curveToRelative(-0.386f, -0.282f, -0.466f, -0.828f, -0.184f, -1.214f)
                curveToRelative(0.282f, -0.386f, 0.828f, -0.466f, 1.214f, -0.184f)
                curveToRelative(1.689f, 1.247f, 2.683f, 3.224f, 2.687f, 5.323f)
                curveToRelative(0.0f, 3.647f, -2.965f, 6.608f, -6.608f, 6.608f)
                close()
            }
        }
        .build()
        return _springboot!!
    }

private var _springboot: ImageVector? = null
