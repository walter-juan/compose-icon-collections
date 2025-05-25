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

public val Simpleicons.Actigraph: ImageVector
    get() {
        if (_actigraph != null) {
            return _actigraph!!
        }
        _actigraph = Builder(name = "Actigraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.189f, 0.0f)
                lineTo(0.86f, 24.0f)
                horizontalLineToRelative(4.151f)
                lineTo(12.0f, 4.975f)
                horizontalLineToRelative(0.03f)
                lineTo(18.959f, 24.0f)
                horizontalLineToRelative(4.182f)
                lineTo(14.187f, 0.916f)
                curveTo(13.974f, 0.366f, 13.445f, 0.0f, 12.854f, 0.0f)
                close()
                moveTo(12.0f, 13.714f)
                arcToRelative(2.472f, 2.472f, 0.0f, false, false, -2.472f, 2.472f)
                arcTo(2.472f, 2.472f, 0.0f, false, false, 12.0f, 18.659f)
                arcToRelative(2.472f, 2.472f, 0.0f, false, false, 2.472f, -2.472f)
                arcToRelative(2.472f, 2.472f, 0.0f, false, false, -2.472f, -2.472f)
                close()
            }
        }
        .build()
        return _actigraph!!
    }

private var _actigraph: ImageVector? = null
