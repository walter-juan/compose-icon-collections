package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.754f)
                arcToRelative(3.246f, 3.246f, 0.0f, true, false, 0.0f, 6.492f)
                arcToRelative(3.246f, 3.246f, 0.0f, false, false, 0.0f, -6.492f)
                moveTo(5.754f, 8.0f)
                arcToRelative(2.246f, 2.246f, 0.0f, true, true, 4.492f, 0.0f)
                arcToRelative(2.246f, 2.246f, 0.0f, false, true, -4.492f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.796f, 1.343f)
                curveToRelative(-0.527f, -1.79f, -3.065f, -1.79f, -3.592f, 0.0f)
                lineToRelative(-0.094f, 0.319f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, -1.255f, 0.52f)
                lineToRelative(-0.292f, -0.16f)
                curveToRelative(-1.64f, -0.892f, -3.433f, 0.902f, -2.54f, 2.541f)
                lineToRelative(0.159f, 0.292f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, -0.52f, 1.255f)
                lineToRelative(-0.319f, 0.094f)
                curveToRelative(-1.79f, 0.527f, -1.79f, 3.065f, 0.0f, 3.592f)
                lineToRelative(0.319f, 0.094f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, 0.52f, 1.255f)
                lineToRelative(-0.16f, 0.292f)
                curveToRelative(-0.892f, 1.64f, 0.901f, 3.434f, 2.541f, 2.54f)
                lineToRelative(0.292f, -0.159f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, 1.255f, 0.52f)
                lineToRelative(0.094f, 0.319f)
                curveToRelative(0.527f, 1.79f, 3.065f, 1.79f, 3.592f, 0.0f)
                lineToRelative(0.094f, -0.319f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, 1.255f, -0.52f)
                lineToRelative(0.292f, 0.16f)
                curveToRelative(1.64f, 0.893f, 3.434f, -0.902f, 2.54f, -2.541f)
                lineToRelative(-0.159f, -0.292f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, 0.52f, -1.255f)
                lineToRelative(0.319f, -0.094f)
                curveToRelative(1.79f, -0.527f, 1.79f, -3.065f, 0.0f, -3.592f)
                lineToRelative(-0.319f, -0.094f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, -0.52f, -1.255f)
                lineToRelative(0.16f, -0.292f)
                curveToRelative(0.893f, -1.64f, -0.902f, -3.433f, -2.541f, -2.54f)
                lineToRelative(-0.292f, 0.159f)
                arcToRelative(0.873f, 0.873f, 0.0f, false, true, -1.255f, -0.52f)
                close()
                moveTo(7.163f, 1.626f)
                curveToRelative(0.246f, -0.835f, 1.428f, -0.835f, 1.674f, 0.0f)
                lineToRelative(0.094f, 0.319f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 2.693f, 1.115f)
                lineToRelative(0.291f, -0.16f)
                curveToRelative(0.764f, -0.415f, 1.6f, 0.42f, 1.184f, 1.185f)
                lineToRelative(-0.159f, 0.292f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 1.116f, 2.692f)
                lineToRelative(0.318f, 0.094f)
                curveToRelative(0.835f, 0.246f, 0.835f, 1.428f, 0.0f, 1.674f)
                lineToRelative(-0.319f, 0.094f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, -1.115f, 2.693f)
                lineToRelative(0.16f, 0.291f)
                curveToRelative(0.415f, 0.764f, -0.42f, 1.6f, -1.185f, 1.184f)
                lineToRelative(-0.291f, -0.159f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, -2.693f, 1.116f)
                lineToRelative(-0.094f, 0.318f)
                curveToRelative(-0.246f, 0.835f, -1.428f, 0.835f, -1.674f, 0.0f)
                lineToRelative(-0.094f, -0.319f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, -2.692f, -1.115f)
                lineToRelative(-0.292f, 0.16f)
                curveToRelative(-0.764f, 0.415f, -1.6f, -0.42f, -1.184f, -1.185f)
                lineToRelative(0.159f, -0.291f)
                arcTo(1.873f, 1.873f, 0.0f, false, false, 1.945f, 8.93f)
                lineToRelative(-0.319f, -0.094f)
                curveToRelative(-0.835f, -0.246f, -0.835f, -1.428f, 0.0f, -1.674f)
                lineToRelative(0.319f, -0.094f)
                arcTo(1.873f, 1.873f, 0.0f, false, false, 3.06f, 4.377f)
                lineToRelative(-0.16f, -0.292f)
                curveToRelative(-0.415f, -0.764f, 0.42f, -1.6f, 1.185f, -1.184f)
                lineToRelative(0.292f, 0.159f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 2.692f, -1.115f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
