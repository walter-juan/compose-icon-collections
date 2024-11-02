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

public val Simpleicons.Osgeo: ImageVector
    get() {
        if (_osgeo != null) {
            return _osgeo!!
        }
        _osgeo = Builder(name = "Osgeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.387f, 0.0f)
                lineTo(9.882f, 2.637f)
                curveToRelative(-4.102f, 0.919f, -7.205f, 4.449f, -7.471f, 8.764f)
                horizontalLineToRelative(2.41f)
                curveToRelative(0.293f, -3.503f, 3.077f, -6.286f, 6.566f, -6.579f)
                lineTo(11.387f, 2.424f)
                close()
                moveTo(12.6f, 2.411f)
                lineTo(12.6f, 4.822f)
                curveToRelative(3.489f, 0.293f, 6.273f, 3.076f, 6.566f, 6.566f)
                lineTo(24.0f, 11.387f)
                lineToRelative(-2.637f, -1.505f)
                curveToRelative(-0.919f, -4.102f, -4.448f, -7.205f, -8.763f, -7.471f)
                close()
                moveTo(11.987f, 5.701f)
                lineTo(11.241f, 10.255f)
                lineTo(12.733f, 11.254f)
                lineTo(13.731f, 12.746f)
                lineTo(18.286f, 11.987f)
                lineTo(13.731f, 11.241f)
                lineTo(15.702f, 8.284f)
                lineTo(12.746f, 10.255f)
                close()
                moveTo(12.733f, 11.254f)
                lineTo(8.284f, 8.284f)
                lineToRelative(2.97f, 4.448f)
                lineToRelative(4.448f, 2.97f)
                close()
                moveTo(11.254f, 12.733f)
                lineTo(10.255f, 11.241f)
                lineTo(5.701f, 12.0f)
                lineToRelative(4.554f, 0.746f)
                lineToRelative(-1.971f, 2.957f)
                lineToRelative(2.944f, -1.971f)
                lineToRelative(0.759f, 4.554f)
                lineToRelative(0.759f, -4.554f)
                close()
                moveTo(11.987f, 11.467f)
                curveToRelative(0.28f, 0.0f, 0.519f, 0.24f, 0.519f, 0.519f)
                curveToRelative(0.0f, 0.28f, -0.226f, 0.52f, -0.519f, 0.52f)
                reflectiveCurveToRelative(-0.519f, -0.24f, -0.519f, -0.52f)
                curveToRelative(0.0f, -0.293f, 0.24f, -0.519f, 0.519f, -0.519f)
                close()
                moveTo(0.0f, 12.599f)
                lineToRelative(2.637f, 1.505f)
                curveToRelative(0.919f, 4.102f, 4.448f, 7.206f, 8.763f, 7.472f)
                verticalLineToRelative(-2.411f)
                curveToRelative(-3.503f, -0.293f, -6.286f, -3.076f, -6.579f, -6.566f)
                lineTo(2.424f, 12.599f)
                close()
                moveTo(19.165f, 12.599f)
                curveToRelative(-0.293f, 3.489f, -3.076f, 6.273f, -6.566f, 6.566f)
                lineTo(12.6f, 24.0f)
                lineToRelative(1.505f, -2.637f)
                curveToRelative(4.102f, -0.919f, 7.205f, -4.448f, 7.472f, -8.763f)
                close()
            }
        }
        .build()
        return _osgeo!!
    }

private var _osgeo: ImageVector? = null
