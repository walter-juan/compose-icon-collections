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

public val Simpleicons.Abbvie: ImageVector
    get() {
        if (_abbvie != null) {
            return _abbvie!!
        }
        _abbvie = Builder(name = "Abbvie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.186f, 20.17f)
                curveToRelative(-1.533f, 0.0f, -2.14f, -0.612f, -2.347f, -1.838f)
                lineToRelative(-0.406f, -1.74f)
                curveToRelative(-0.413f, 0.72f, -2.453f, 3.579f, -6.945f, 3.579f)
                horizontalLineTo(8.89f)
                curveTo(1.94f, 20.17f, 0.0f, 15.467f, 0.0f, 12.0f)
                curveToRelative(0.0f, -3.885f, 2.347f, -8.17f, 8.884f, -8.17f)
                horizontalLineToRelative(4.905f)
                curveToRelative(5.005f, 0.0f, 7.759f, 2.853f, 8.372f, 6.431f)
                curveToRelative(0.512f, 2.96f, 1.839f, 9.91f, 1.839f, 9.91f)
                close()
                moveTo(13.076f, 6.378f)
                horizontalLineToRelative(-3.88f)
                curveToRelative(-4.698f, 0.0f, -6.231f, 2.965f, -6.231f, 5.623f)
                curveToRelative(0.0f, 2.653f, 1.533f, 5.618f, 6.236f, 5.618f)
                horizontalLineToRelative(3.875f)
                curveToRelative(4.904f, 0.0f, 6.236f, -3.065f, 6.236f, -5.618f)
                curveToRelative(0.0f, -2.246f, -1.231f, -5.618f, -6.236f, -5.618f)
                close()
            }
        }
        .build()
        return _abbvie!!
    }

private var _abbvie: ImageVector? = null
