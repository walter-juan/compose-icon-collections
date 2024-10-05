package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.425f, 1.414f)
                lineToRelative(-6.775f, 3.996f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, false, -1.65f, 2.807f)
                verticalLineToRelative(7.285f)
                arcToRelative(3.226f, 3.226f, 0.0f, false, false, 1.678f, 2.826f)
                lineToRelative(6.695f, 4.237f)
                curveToRelative(1.034f, 0.57f, 2.22f, 0.57f, 3.2f, 0.032f)
                lineToRelative(6.804f, -4.302f)
                curveToRelative(0.98f, -0.537f, 1.623f, -1.618f, 1.623f, -2.793f)
                verticalLineToRelative(-7.284f)
                lineToRelative(-0.005f, -0.204f)
                arcToRelative(3.223f, 3.223f, 0.0f, false, false, -1.284f, -2.39f)
                lineToRelative(-0.107f, -0.075f)
                lineToRelative(-0.007f, -0.007f)
                arcToRelative(1.074f, 1.074f, 0.0f, false, false, -0.181f, -0.133f)
                lineToRelative(-6.776f, -3.995f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, false, -3.216f, 0.0f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
