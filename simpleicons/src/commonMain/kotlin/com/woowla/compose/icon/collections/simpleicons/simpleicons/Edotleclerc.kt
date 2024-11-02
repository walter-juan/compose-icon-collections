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

public val Simpleicons.Edotleclerc: ImageVector
    get() {
        if (_edotleclerc != null) {
            return _edotleclerc!!
        }
        _edotleclerc = Builder(name = "Edotleclerc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 0.0f)
                curveTo(5.43f, 0.0f, 0.104f, 5.373f, 0.104f, 12.001f)
                curveTo(0.104f, 18.628f, 5.43f, 24.0f, 12.001f, 24.0f)
                curveToRelative(6.57f, 0.0f, 11.895f, -5.372f, 11.895f, -11.999f)
                curveTo(23.896f, 5.373f, 18.57f, 0.0f, 12.001f, 0.0f)
                close()
                moveTo(12.001f, 2.491f)
                curveToRelative(5.206f, 0.0f, 9.427f, 4.258f, 9.427f, 9.51f)
                curveToRelative(0.0f, 5.252f, -4.22f, 9.509f, -9.427f, 9.509f)
                curveToRelative(-5.207f, 0.0f, -9.428f, -4.257f, -9.428f, -9.509f)
                curveToRelative(0.0f, -5.252f, 4.221f, -9.51f, 9.428f, -9.51f)
                close()
                moveTo(13.148f, 4.482f)
                curveToRelative(-1.442f, 0.0f, -2.773f, 0.47f, -3.856f, 1.266f)
                horizontalLineToRelative(3.193f)
                lineTo(12.485f, 8.982f)
                curveToRelative(-0.556f, 0.028f, -1.016f, 0.478f, -1.016f, 1.044f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(0.944f)
                curveToRelative(1.206f, 0.0f, 1.509f, -1.453f, 1.509f, -1.453f)
                horizontalLineToRelative(2.836f)
                lineToRelative(0.001f, 2.594f)
                curveToRelative(1.774f, -1.184f, 2.944f, -3.215f, 2.944f, -5.521f)
                curveToRelative(0.0f, -3.652f, -2.935f, -6.613f, -6.555f, -6.613f)
                close()
                moveTo(6.49f, 6.732f)
                verticalLineToRelative(1.62f)
                curveToRelative(0.546f, 0.142f, 1.018f, 0.611f, 1.018f, 1.382f)
                verticalLineToRelative(5.459f)
                curveToRelative(0.0f, 0.616f, -0.437f, 1.169f, -1.018f, 1.315f)
                verticalLineToRelative(2.094f)
                horizontalLineToRelative(9.3f)
                lineTo(15.79f, 15.004f)
                lineToRelative(-1.234f, 0.007f)
                curveToRelative(-0.348f, 0.847f, -1.177f, 1.441f, -2.142f, 1.441f)
                horizontalLineToRelative(-1.913f)
                lineTo(10.501f, 9.691f)
                curveToRelative(0.0f, -0.698f, 0.454f, -1.182f, 1.016f, -1.335f)
                lineTo(11.516f, 6.732f)
                close()
            }
        }
        .build()
        return _edotleclerc!!
    }

private var _edotleclerc: ImageVector? = null
